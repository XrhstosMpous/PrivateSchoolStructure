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
public class AssignmentPerStudent {

    //Member variables of this class
    Student student;
    List<Assignment> assignment = new ArrayList<>();

    //Default Constructor of this class
    public AssignmentPerStudent() {

    }

    //Parameterized Constructor of this class
    public AssignmentPerStudent(Student student, List<Assignment> assignment) {
        this.student = student;
        this.assignment = assignment;
    }

    //Getters and Setters
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Assignment> getAssignment() {
        return assignment;
    }

    public void setAssignment(List<Assignment> assignment) {
        this.assignment = assignment;
    }

    //Print and display method for this class
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssignmentPerStudent{");
        sb.append("student=").append(student);
        sb.append(", assignment=").append(assignment);
        sb.append('}');
        return sb.toString();
    }

}
