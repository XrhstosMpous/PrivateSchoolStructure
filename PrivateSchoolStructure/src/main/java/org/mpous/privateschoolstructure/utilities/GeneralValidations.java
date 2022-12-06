/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.privateschoolstructure.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author PSO
 */
public class GeneralValidations {

    static Scanner sc = new Scanner(System.in);

    // Method to check, that the user will type only strings.
    public static String checkString(Scanner sc) {
        String input = "";
        boolean flag = false;
        while (!flag) {
            input = sc.next();
            if (input.matches(".*\\D.*")) {
                flag = true;
            } else {
                System.out.println("type only characters");
            }
        }
        return input;
    }

    //Method to check tha user will type the given pattern of the date.
    public static Date checkDate(Scanner sc) {

        String pattern = "dd/MM/yyyy";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        Date d = new Date();
        String endDate = sc.next();
        while (true) {
            if (!endDate.matches("(0[1-9]|1[0-9]|2[0-9]|3[0-1]|[1-9])/(0[1-9]|1[0-2]|[1-9])/([0-9]{4})")) {
                System.out.println("Not a valid date");
                endDate = sc.next();

            } else {
                try {
                    d = format.parse(endDate);
                    break;

                } catch (ParseException e) {
                    e.printStackTrace();

                }
            }
        }

        return d;
    }

    //Method to check that the user will type only numbers.
    public static int checkNumber(Scanner scanner) {
        int id;
        while (true) {
            try {
                String input = scanner.next();
                int number = Integer.parseInt(input);
                id = number;
                break;
            } catch (NumberFormatException e) {
                System.out.println("type only numbers");
            }
        }
        return id;
    }

    //Method to check that the number is between the bounds.
    public static int checkTotalMark(Scanner sc) {
        int intValue = -1;
        do {
            System.out.print("Please enter a integer value between 0 -100");
            String next = sc.next();
            try {
                intValue = Integer.parseInt(next);
            } catch (NumberFormatException exp) {
            }
        } while (intValue < 0 || intValue > 100);

        return intValue;

    }

    //Method to check that the number is between the bounds.
    public static int checkOralMark(Scanner sc) {
        int intValue = -1;
        do {
            System.out.print("Please enter a integer value between 0 -20");
            String next = sc.next();
            try {
                intValue = Integer.parseInt(next);
            } catch (NumberFormatException exp) {
            }
        } while (intValue < 0 || intValue > 20);

        return intValue;

    }

    //Method to check that the number is between the bounds.
    public static int checkTuition(Scanner sc) {
        int intValue = -1;
        do {
            System.out.print("Please enter a integer value between 0 -1000");
            String next = sc.next();
            try {
                intValue = Integer.parseInt(next);
            } catch (NumberFormatException exp) {
            }
        } while (intValue < 0 || intValue > 1000);

        return intValue;

    }

}
