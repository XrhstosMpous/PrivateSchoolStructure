/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.privateschoolstructure.services;

import java.util.List;
import java.util.Scanner;
import org.mpous.privateschoolstructure.database.Database;
import org.mpous.privateschoolstructure.models.Course;
import org.mpous.privateschoolstructure.models.Student;
import org.mpous.privateschoolstructure.models.StudentPerCourse;
import org.mpous.privateschoolstructure.utilities.GeneralValidations;

/**
 *
 * @author PSO
 */
public class StudentPerCourseService {

    /**
     * This method asks the user to give his/her id to add a course for the
     * specific student.
     *
     * @param anotherCourse
     * @return StudentPerCourse
     */
    public StudentPerCourse addSCourseInStudent(Course anotherCourse) {

        StudentPerCourse spc = new StudentPerCourse();
        StudentService sce = new StudentService();
        CourseService cre = new CourseService();
        Scanner sc = new Scanner(System.in);
        System.out.println("give your id");
        int studentId = GeneralValidations.checkNumber(sc);
        if (!Database.studentList.stream().anyMatch(stu -> stu.getId() == studentId)) {
            System.out.println("your id doesn't exist ,create a new one!! ");
            Student current = sce.addStudent();
            sce.saveStudent(current);
            spc.setStudents(Database.studentList);
        } else {
            System.out.println("the student exists");
        }
        if (!Database.courseList.stream().anyMatch(course -> course.getId() == anotherCourse.getId())) {
            spc.setCourse(anotherCourse);
            System.out.println("your course is added");
        } else {
            System.out.println("the course already exists");

        }

        return spc;
    }

    /**
     * This method saves the StudentPerCourse object in the general
     * StudentPerCourse list of the database.
     *
     * @param spc
     * @return studentPerCourse list.
     */
    public List<StudentPerCourse> savedSpC(StudentPerCourse spc) {
        Database.studentsPerCourse.add(spc);
        return Database.getStudentsPerCourse();

    }

}
    
    
    
    
    
        

  
  
  
    
    

