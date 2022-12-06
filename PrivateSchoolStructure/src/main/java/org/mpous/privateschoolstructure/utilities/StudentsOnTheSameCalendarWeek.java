/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.privateschoolstructure.utilities;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import org.mpous.privateschoolstructure.database.Database;
import org.mpous.privateschoolstructure.models.AssignmentPerStudent;

/**
 *
 * @author PSO
 */
public class StudentsOnTheSameCalendarWeek {

    /**
     * This method asks from the user a date and it output a list of students
     * who need to submit one or more assignments on the same calendar week as
     * the given date.
     *
     * @param date
     */
    public static void isInSameWeek(Date date) {
        System.out.println("give a date 'dd/MM/yyyy'");
        Scanner sc = new Scanner(System.in);
        date = GeneralValidations.checkDate(sc);
        LocalDate localDate = date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        Locale locale = Locale.getDefault();
        TemporalField weekOfYear = WeekFields.of(locale).weekOfYear();
        int weekOfYearOfDate = localDate.get(weekOfYear);
        List<AssignmentPerStudent> aps = Database.assignmentPerStudent;
        for (AssignmentPerStudent stu : aps) {
            if (aps.stream().anyMatch(assi -> assi.getAssignment().stream()
                    .anyMatch(assign -> assign.getSubDateTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
                    .equals(weekOfYearOfDate))));
            System.out.println(stu);
        }

    }

}
