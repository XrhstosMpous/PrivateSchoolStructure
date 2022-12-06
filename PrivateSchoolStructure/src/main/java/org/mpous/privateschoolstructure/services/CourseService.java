/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.privateschoolstructure.services;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import org.mpous.privateschoolstructure.database.Database;
import org.mpous.privateschoolstructure.models.Course;
import org.mpous.privateschoolstructure.utilities.GeneralValidations;

/**
 *
 * @author PSO
 */
public class CourseService {

    static Scanner sc = new Scanner(System.in);

    /**
     * This method asks the user to fill all the fields of the course he/she
     * wants to add.
     *
     * @return Course
     */
    public Course addCourse() {

        System.out.println("give course id");
        int id = GeneralValidations.checkNumber(sc);
        System.out.println("give title");
        String title = GeneralValidations.checkString(sc);
        System.out.println("give stream");
        String stream = GeneralValidations.checkString(sc);
        System.out.println("give type");
        String type = GeneralValidations.checkString(sc);
        System.out.println("give start date in the form of 'dd/MM/yyyy'\"");
        Date startDate = GeneralValidations.checkDate(sc);
        System.out.println("give end date in the form of 'dd/MM/yyyy'");
        Date endDate = GeneralValidations.checkDate(sc);
        Course course = new Course(id, title, stream, type, startDate, endDate);
        return course;
    }

    /**
     * This method saves the course object in the general course list of the
     * database.
     *
     * @param course
     * @return course list.
     */
    public List<Course> saveCourse(Course course) {
        Database.courseList.add(course);
        return Database.courseList;
    }

}
