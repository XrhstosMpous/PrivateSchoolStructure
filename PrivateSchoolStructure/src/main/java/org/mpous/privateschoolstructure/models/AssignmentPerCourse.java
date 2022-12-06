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
public class AssignmentPerCourse {

    //Member variables of this class
    Course course;
    List<Assignment> assignments = new ArrayList<>();

    //Default Constructor of this class
    public AssignmentPerCourse() {
    }

    //Parameterized Constructor of this class
    public AssignmentPerCourse(Course course, List<Assignment> assignments) {
        this.course = course;
        this.assignments = assignments;
    }

    //Getters and Setters of this class
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    //Print and display method for this class
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssignmentPerCourse{");
        sb.append("course=").append(course);
        sb.append(", assignments=").append(assignments);
        sb.append('}');
        return sb.toString();
    }
}
