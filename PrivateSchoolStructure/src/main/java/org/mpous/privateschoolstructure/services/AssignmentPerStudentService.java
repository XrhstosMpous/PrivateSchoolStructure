/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.privateschoolstructure.services;

import java.util.List;
import java.util.Scanner;
import org.mpous.privateschoolstructure.database.Database;
import org.mpous.privateschoolstructure.models.Assignment;
import org.mpous.privateschoolstructure.models.AssignmentPerStudent;
import org.mpous.privateschoolstructure.models.Student;
import org.mpous.privateschoolstructure.utilities.GeneralValidations;

/**
 *
 * @author PSO
 */
public class AssignmentPerStudentService {

    /**
     * This methods asks the user to give his/her id to add an assignment for
     * the specific student.
     *
     * @param anotherAssignment
     * @return assignmentPerStudent.
     */
    public AssignmentPerStudent addAssignmentInStudent(Assignment anotherAssignment) {

        AssignmentPerStudent aps = new AssignmentPerStudent();
        AssignmentService as = new AssignmentService();
        StudentService ss = new StudentService();
        List<Student> studentList = Database.studentList;
        List<Assignment> assignmentList = Database.assignmentList;
        Scanner sc = new Scanner(System.in);
        System.out.println("give your id");
        int id = GeneralValidations.checkNumber(sc);
        if (!studentList.stream().anyMatch(stu -> stu.getId() == id)) {
            System.out.println("student doesnt exist.Create a new one! ");
            Student current = ss.addStudent();
            ss.saveStudent(current);
            aps.setStudent(current);
        } else {
            System.out.println("the assignment exists");
        }
        if (!assignmentList.stream().anyMatch(assi -> assi.getAssId() == anotherAssignment.getAssId())) {
            aps.setAssignment(assignmentList);
            System.out.println("your assignment is added");
        } else {
            System.out.println("the assignment already exists");
        }

        return aps;
    }

    /**
     * This method saves the assignmentPerStudent object in the general
     * assignmentPerStudent list of the database.
     *
     * @param aps
     * @return assignmentPerStudent list.
     */
    public List<AssignmentPerStudent> savedApS(AssignmentPerStudent aps) {
        Database.assignmentPerStudent.add(aps);
        return Database.getAssignmentPerStudent();

    }

}
