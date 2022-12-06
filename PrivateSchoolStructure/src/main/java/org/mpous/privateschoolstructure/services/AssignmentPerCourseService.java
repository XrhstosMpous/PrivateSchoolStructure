/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.privateschoolstructure.services;

import java.util.List;
import java.util.Scanner;
import org.mpous.privateschoolstructure.database.Database;
import org.mpous.privateschoolstructure.models.Assignment;
import org.mpous.privateschoolstructure.models.AssignmentPerCourse;
import org.mpous.privateschoolstructure.models.Course;
import org.mpous.privateschoolstructure.utilities.GeneralValidations;

/**
 *
 * @author PSO
 */
public class AssignmentPerCourseService {

    /**
     * This methods asks the user to give the id of the assignment he/she wants
     * to add in the specific course.
     *
     * @param anotherCourse
     * @return assignmentPerCourse
     */
    public AssignmentPerCourse addAssignmentInCourse(Course anotherCourse) {

        AssignmentPerCourse apc = new AssignmentPerCourse();
        AssignmentService as = new AssignmentService();
        CourseService cre = new CourseService();
        List<Assignment> assignmentList = Database.assignmentList;
        List<Course> courseList = Database.courseList;
        Scanner sc = new Scanner(System.in);
        System.out.println("give assignment's id");
        int id = GeneralValidations.checkNumber(sc);
        if (!Database.assignmentList.stream().anyMatch(assign -> assign.getAssId() == id)) {
            System.out.println("assignment doesnt exist.Create a new one! ");
            Assignment current = as.addAssignment();
            as.saveAssignment(current);
            apc.setAssignments(assignmentList);
        } else {
            System.out.println("the assignment exists");
        }
        if (!courseList.stream().anyMatch(course -> course.getId() == anotherCourse.getId())) {
            apc.setCourse(anotherCourse);
            System.out.println("you course is added");
        } else {
            System.out.println("the course already exists");
        }

        return apc;
    }

    /**
     * This method saves the assignmentPerCourse object in the general
     * assignmentPerCourse list of the database.
     *
     * @param Apc
     * @return assignmentPerCourse list
     */
    public List<AssignmentPerCourse> savedApC(AssignmentPerCourse Apc) {
        Database.assignmentPerCourse.add(Apc);
        return Database.getAssignmentPerCourse();
    }

}
