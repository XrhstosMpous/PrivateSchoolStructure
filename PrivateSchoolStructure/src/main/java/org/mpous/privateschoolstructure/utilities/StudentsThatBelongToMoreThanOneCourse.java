/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.privateschoolstructure.utilities;

import java.util.List;
import org.mpous.privateschoolstructure.database.Database;
import org.mpous.privateschoolstructure.models.StudentPerCourse;

/**
 *
 * @author PSO
 */
public class StudentsThatBelongToMoreThanOneCourse {

    /**
     * This method displays the students that belong in more than one course.
     */
    public static void showStudentsThatBelongInMoreThanOneCourse() {

        List<StudentPerCourse> studentPerCourseList = Database.studentsPerCourse;
        for (int i = 0; i < studentPerCourseList.size(); i++) {
            if (studentPerCourseList.get(i).getStudents().size() > 1) {
                System.out.println(studentPerCourseList.get(i));
            } else {
                System.out.println("Currently, nobody do not have more than one");
            }

        }

    }

}
