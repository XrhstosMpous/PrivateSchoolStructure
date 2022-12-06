/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.privateschoolstructure.services;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import org.mpous.privateschoolstructure.database.Database;
import org.mpous.privateschoolstructure.models.Assignment;
import org.mpous.privateschoolstructure.utilities.GeneralValidations;

/**
 *
 * @author PSO
 */
public class AssignmentService {

    static Scanner scanner = new Scanner(System.in);

    /**
     * This method asks the user to fill all the fields of the assignment he/she
     * wants to add.
     *
     * @return assignment
     */
    public Assignment addAssignment() {
        System.out.println("add assignment's id");
        int assId = GeneralValidations.checkNumber(scanner);
        System.out.println("add a title for assignment");
        String title = GeneralValidations.checkString(scanner);
        System.out.println("add a description");
        String description = GeneralValidations.checkString(scanner);
        System.out.println("add subDate in the form of 'dd/MM/yyyy'\"");
        Date subDateTime = GeneralValidations.checkDate(scanner);
        System.out.println("add your oral mark");
        int oralMark = GeneralValidations.checkOralMark(scanner);
        System.out.println("add your total mark");
        int totalMark = GeneralValidations.checkTotalMark(scanner);
        Assignment assignment = new Assignment(assId, title, description, subDateTime, oralMark, totalMark);
        return assignment;
    }

    /**
     * This method saves the assignment object in the general assignment list of
     * the database.
     *
     * @param assignment
     * @return assignment list.
     */
    public List<Assignment> saveAssignment(Assignment assignment) {
        Database.assignmentList.add(assignment);
        return Database.assignmentList;
    }

}
