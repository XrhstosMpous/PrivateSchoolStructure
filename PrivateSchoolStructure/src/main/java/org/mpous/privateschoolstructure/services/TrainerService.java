/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.privateschoolstructure.services;

import java.util.Scanner;
import org.mpous.privateschoolstructure.models.Trainer;
import java.util.List;
import org.mpous.privateschoolstructure.database.Database;
import org.mpous.privateschoolstructure.utilities.GeneralValidations;

/**
 *
 * @author PSO
 */
public class TrainerService {

    static Scanner sc = new Scanner(System.in);

    /**
     * This method asks the user to fill all the fields of the trainer he/she
     * wants to add.
     *
     * @return trainer
     */
    public Trainer addTrainer() {

        System.out.println("give trainer an id");
        int trainerId = GeneralValidations.checkNumber(sc);
        System.out.println("give trainer name");
        String fname = GeneralValidations.checkString(sc);
        System.out.println("give trainer lastname");
        String lname = GeneralValidations.checkString(sc);
        System.out.println("give subject");
        String subject = GeneralValidations.checkString(sc);
        Trainer trainer = new Trainer(trainerId, fname, lname, subject);
        return trainer;
    }

    /**
     * This method saves the trainer object in the general trainer list of the
     * database.
     *
     * @param trainer
     * @return trainer list.
     */
    public List<Trainer> saveTrainer(Trainer trainer) {
        Database.trainerList.add(trainer);
        return Database.trainerList;
    }

}
