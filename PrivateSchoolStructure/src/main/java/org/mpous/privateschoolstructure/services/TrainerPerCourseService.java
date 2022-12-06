/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.privateschoolstructure.services;

import java.util.List;
import java.util.Scanner;
import org.mpous.privateschoolstructure.database.Database;
import org.mpous.privateschoolstructure.models.Course;
import org.mpous.privateschoolstructure.models.Trainer;
import org.mpous.privateschoolstructure.models.TrainerPerCourse;
import org.mpous.privateschoolstructure.utilities.GeneralValidations;

/**
 *
 * @author PSO
 */
public class TrainerPerCourseService {

    /**
     * This method asks the user to give trainer's id to add him in the specific
     * course.
     *
     * @param anotherCourse
     * @return TrainerPerCourse.
     */
    public TrainerPerCourse addTrainerInCourse(Course anotherCourse) {

        TrainerPerCourse tpc = new TrainerPerCourse();
        TrainerService ts = new TrainerService();
        CourseService cre = new CourseService();
        List<Trainer> trainerList = Database.trainerList;
        List<Course> courseList = Database.courseList;
        Scanner sc = new Scanner(System.in);
        System.out.println("give trainer's id");
        int id = GeneralValidations.checkNumber(sc);
        if (!trainerList.stream().anyMatch(train -> train.getTrainerId() == id)) {
            System.out.println("trainer doesnt exist.Create a new one! ");
            Trainer current = ts.addTrainer();
            ts.saveTrainer(current);
            tpc.setTrainer(trainerList);
        } else {
            System.out.println("the trainer exists");
        }
        if (!courseList.stream().anyMatch(course -> course.getId() == anotherCourse.getId())) {
            tpc.setCourse(anotherCourse);
            System.out.println("you course is added");
        } else {
            System.out.println("the course already exists");
        }

        return tpc;
    }

    /**
     * This method saves the TrainerPerCourse object in the general
     * TrainerPerCourse list of the database.
     *
     * @param tpc
     * @return TrainerPerCourse list.
     */
    public List<TrainerPerCourse> savedSpC(TrainerPerCourse tpc) {
        Database.trainersPerCourse.add(tpc);
        return Database.getTrainersPerCourse();

    }

}
