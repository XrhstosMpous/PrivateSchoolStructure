/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.privateschoolstructure.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PSO
 */
public class TrainerPerCourse {

    //Member variables of this class
    Course course;
    List<Trainer> trainer = new ArrayList<>();

    //Default Constructor of this class
    public TrainerPerCourse() {

    }

    //Parameterized Constructor of this class
    public TrainerPerCourse(Course course, List<Trainer> trainer) {
        this.course = course;
        this.trainer = trainer;
    }

    //Getters and Setters
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Trainer> getTrainer() {
        return trainer;
    }

    public void setTrainer(List<Trainer> trainer) {
        this.trainer = trainer;
    }

    //Print and display method for this class
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrainersPerCourse{");
        sb.append("course=").append(course);
        sb.append(", trainer=").append(trainer);
        sb.append('}');
        return sb.toString();
    }

}
