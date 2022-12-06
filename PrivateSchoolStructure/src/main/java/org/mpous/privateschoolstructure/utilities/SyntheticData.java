/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.privateschoolstructure.utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.mpous.privateschoolstructure.database.Database;
import org.mpous.privateschoolstructure.models.Assignment;
import org.mpous.privateschoolstructure.models.AssignmentPerCourse;
import org.mpous.privateschoolstructure.models.AssignmentPerStudent;
import org.mpous.privateschoolstructure.models.Course;
import org.mpous.privateschoolstructure.models.Student;
import org.mpous.privateschoolstructure.models.StudentPerCourse;
import org.mpous.privateschoolstructure.models.Trainer;
import org.mpous.privateschoolstructure.models.TrainerPerCourse;

/**
 *
 * @author PSO
 */
public class SyntheticData {

    //Member variables of this class
    public static final List<Student> synthStudentList = Arrays.asList(new Student(1, "xristos", "dimitriou", new Date("10/10/2000"), 5),
            new Student(2, "markos", "markou", new Date("09/09/2001"), 6),
            new Student(3, "Kwstas", "Fillipou", new Date("25/10/2000"), 7),
            new Student(4, "Petros", "Petrou", new Date("15/07/2000"), 5),
            new Student(5, "Xrhstos", "Mpousmpouras", new Date("16/08/2000"), 5));

    public static final List<Trainer> synthTrainerList = Arrays.asList(new Trainer(1, "Dhmhtrhs", "Apostolou", "Java"),
            new Trainer(2, "Georgia", "Dimitropoulou", "Java"),
            new Trainer(3, "Giannis", "Andreou", "JavaScript"),
            new Trainer(4, "Apostolhs", "Thimiou", "JavaScript"),
            new Trainer(5, "Giwrgos", "Mixailidis", "C++"));

    public static final List<Course> synthCourseList = Arrays.asList(new Course(1, "CB8", "Java", "Full-time", new Date("11/02/2000"), new Date("11/02/20001")),
            new Course(2, "CB8", "Java", "Part-time", new Date("10/03/2000"), new Date("10/03/2001")),
            new Course(3, "CB7", "Javascript", "Full-time", new Date("12/04/2000"), new Date("12/04/2001")),
            new Course(4, "CB9", "Javascript", "Part-time", new Date("13/05/2000"), new Date("13/05/2001")));

    public static final List<Assignment> synthAssignmentList = Arrays.asList(new Assignment(1, "Implementation of Web Page layouts", "use Htmml,CSS,Javascript", new Date("10/10/2000"), 20, 30),
            new Assignment(2, "Implementation of a private school", "use java", new Date("11/10/2000"), 20, 30),
            new Assignment(3, "Implementation of a trainer CRUD", "use Spring", new Date("12/10/2000"), 20, 30),
            new Assignment(4, "Implementation of Group Porject", "use Java,Angular,Spring", new Date("10/10/2000"), 20, 30));

    public static final List<StudentPerCourse> synthStudentPerCourse = Arrays.asList(
            new StudentPerCourse(
                    new Course(1, "CB8", "Java", "Full-time", new Date("12/02/2000"), new Date("12/12/2001")), new ArrayList<>(synthStudentList)),
            new StudentPerCourse(
                    new Course(2, "CB7", "Java", "Part-time", new Date("13/02/2000"), new Date("13/02/2001")), new ArrayList<>(synthStudentList)));

    public static final List<TrainerPerCourse> synthTrainerPerCourse = Arrays.asList(
            new TrainerPerCourse(new Course(1, "CB8", "Javascript", "Part-time", new Date("07/07/2000"), new Date("07/07/2001")),
                    new ArrayList<>(synthTrainerList)),
            new TrainerPerCourse(new Course(2, "CB8", "Javascript", "Full-time", new Date("07/06/2000"), new Date("07/06/2001")),
                    new ArrayList<>(synthTrainerList)));

    public static final List<AssignmentPerCourse> synthAssignmentPerCourse = Arrays.asList(
            new AssignmentPerCourse(new Course(1, "CB8", "Javascript", "Part-time", new Date("07/07/2000"), new Date("07/07/2001")),
                    new ArrayList<>(synthAssignmentList)),
            new AssignmentPerCourse(new Course(2, "CB8", "Javascript", "Part-time", new Date("07/07/2000"), new Date("07/07/2001")),
                    new ArrayList<>(synthAssignmentList)));

    public static final List<AssignmentPerStudent> synthAssignmentPerStudent = Arrays.asList(
            new AssignmentPerStudent(
                    new Student(1, "xristos", "dimitriou", new Date("10/10/2000"), 5),
                    new ArrayList<>(synthAssignmentList)),
            new AssignmentPerStudent(
                    new Student(2, "Nikolas", "Dwnhs", new Date("10/11/2001"), 5),
                    new ArrayList<>(synthAssignmentList)));

    /**
     * Methods to display synthetic data if the general lists of the database
     * are empty.
     */
    public void showStudents() {
        if (Database.studentList.isEmpty()) {
            synthStudentList.stream().forEach(System.out::println);
        } else {
            Database.studentList.stream().forEach(System.out::println);
        }

    }

    public void showCourse() {
        if (Database.courseList.isEmpty()) {
            synthCourseList.stream().forEach(System.out::println);
        } else {
            Database.courseList.stream().forEach(System.out::println);
        }

    }

    public void showTrainers() {
        if (Database.trainerList.isEmpty()) {
            synthTrainerList.stream().forEach(System.out::println);
        } else {
            Database.trainerList.stream().forEach(System.out::println);
        }

    }

    public void showAssignments() {
        if (Database.assignmentList.isEmpty()) {
            synthAssignmentList.stream().forEach(System.out::println);
        } else {
            Database.assignmentList.stream().forEach(System.out::println);
        }
    }

    public void showStudentsPerCourse() {
        if (Database.studentsPerCourse.isEmpty()) {
            synthStudentPerCourse.stream().forEach(System.out::println);
        } else {
            Database.studentsPerCourse.stream().forEach(System.out::println);
        }
    }

    public void showTrainerPerCourse() {
        if (Database.trainersPerCourse.isEmpty()) {
            synthTrainerPerCourse.stream().forEach(System.out::println);
        } else {
            Database.trainersPerCourse.stream().forEach(System.out::println);
        }
    }

    public void showAssignmentsPerCourse() {
        if (Database.assignmentPerCourse.isEmpty()) {
            synthAssignmentPerCourse.stream().forEach(System.out::println);
        } else {
            Database.assignmentPerCourse.stream().forEach(System.out::println);
        }

    }

    public void showAssignmentsPerStudent() {
        if (Database.assignmentPerStudent.isEmpty()) {
            synthAssignmentPerStudent.stream().forEach(System.out::println);
        } else {
            Database.assignmentPerStudent.stream().forEach(System.out::println);
        }
    }

}
