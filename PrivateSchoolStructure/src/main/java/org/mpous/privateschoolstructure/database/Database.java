/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.privateschoolstructure.database;

import java.util.ArrayList;

import java.util.List;
import org.mpous.privateschoolstructure.models.Assignment;
import org.mpous.privateschoolstructure.models.AssignmentPerCourse;
import org.mpous.privateschoolstructure.models.AssignmentPerStudent;
import org.mpous.privateschoolstructure.models.Course;
import org.mpous.privateschoolstructure.models.Student;
import org.mpous.privateschoolstructure.models.StudentPerCourse;
import org.mpous.privateschoolstructure.models.Trainer;
import org.mpous.privateschoolstructure.models.TrainerPerCourse;

//Database class for the private School
public class Database {

    //Member variables of this class
    public static List<Student> studentList = new ArrayList<>();
    public static List<Trainer> trainerList = new ArrayList<>();
    public static List<Course> courseList = new ArrayList<>();
    public static List<Assignment> assignmentList = new ArrayList<>();
    public static List<StudentPerCourse> studentsPerCourse = new ArrayList<>();
    public static List<TrainerPerCourse> trainersPerCourse = new ArrayList<>();
    public static List<AssignmentPerCourse> assignmentPerCourse = new ArrayList<>();
    public static List<AssignmentPerStudent> assignmentPerStudent = new ArrayList<>();

    //Getters for this class
    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Trainer> getTrainerList() {
        return trainerList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public List<Assignment> getAssignmentList() {
        return assignmentList;
    }

    public static List<StudentPerCourse> getStudentsPerCourse() {
        return studentsPerCourse;
    }

    public static List<TrainerPerCourse> getTrainersPerCourse() {
        return trainersPerCourse;
    }

    public static List<AssignmentPerCourse> getAssignmentPerCourse() {
        return assignmentPerCourse;
    }

    public static List<AssignmentPerStudent> getAssignmentPerStudent() {
        return assignmentPerStudent;
    }

    //Print and display method for this class
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Database{");
        sb.append('}');
        return sb.toString();
    }

}
    
    
     
    
    
    
    
    
    

