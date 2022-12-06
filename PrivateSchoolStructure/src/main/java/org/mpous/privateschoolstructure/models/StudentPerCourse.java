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
public class StudentPerCourse {

    //Member variables of this class
    private Course course;
    private List<Student> students = new ArrayList<>();

    //Default Constructor
    public StudentPerCourse() {
    }

    //Parameterized Constructor of this class
    public StudentPerCourse(Course course, List<Student> students) {
        this.course = course;
        this.students = students;
    }

    //Getters and Setters
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    //Print and display method for this class
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StudentsPerCourse{");
        sb.append("course=").append(course);
        sb.append(", students=").append(students);
        sb.append('}');
        return sb.toString();
    }

}
