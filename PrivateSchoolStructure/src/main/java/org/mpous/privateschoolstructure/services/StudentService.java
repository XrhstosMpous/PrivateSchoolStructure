/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.privateschoolstructure.services;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import org.mpous.privateschoolstructure.database.Database;
import org.mpous.privateschoolstructure.models.Student;
import org.mpous.privateschoolstructure.utilities.GeneralValidations;

/**
 *
 * @author PSO
 */
public class StudentService {

    static Scanner sc = new Scanner(System.in);

    /**
     * This method asks the user to fill all the fields to create a personal
     * "account".
     *
     * @return Student
     */
    public Student addStudent() {
        System.out.println("add your id");
        int id = GeneralValidations.checkNumber(sc);
        System.out.println("add your name");
        String fname = GeneralValidations.checkString(sc);
        System.out.println("add your lastname");
        String lname = GeneralValidations.checkString(sc);
        System.out.println("add  date in the form of 'dd/MM/yyyy'");
        Date date = GeneralValidations.checkDate(sc);
        System.out.println("add your fees");
        int fees = GeneralValidations.checkTuition(sc);
        Student student = new Student(id, fname, lname, date, fees);
        return student;
    }

    /**
     * This method saves the student object in the general student list of the
     * database.
     *
     * @param student
     * @return student list
     */
    public List<Student> saveStudent(Student student) {
        Database.studentList.add(student);
        return Database.studentList;

    }

}
