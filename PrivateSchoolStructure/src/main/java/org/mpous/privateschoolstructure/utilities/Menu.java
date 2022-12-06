 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.privateschoolstructure.utilities;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import org.mpous.privateschoolstructure.models.Assignment;
import org.mpous.privateschoolstructure.models.AssignmentPerCourse;
import org.mpous.privateschoolstructure.models.AssignmentPerStudent;
import org.mpous.privateschoolstructure.models.Course;
import org.mpous.privateschoolstructure.models.Student;
import org.mpous.privateschoolstructure.models.StudentPerCourse;
import org.mpous.privateschoolstructure.models.Trainer;
import org.mpous.privateschoolstructure.models.TrainerPerCourse;
import org.mpous.privateschoolstructure.services.AssignmentPerCourseService;
import org.mpous.privateschoolstructure.services.AssignmentPerStudentService;
import org.mpous.privateschoolstructure.services.AssignmentService;
import org.mpous.privateschoolstructure.services.CourseService;
import org.mpous.privateschoolstructure.services.StudentService;
import org.mpous.privateschoolstructure.services.StudentPerCourseService;
import org.mpous.privateschoolstructure.services.TrainerPerCourseService;
import org.mpous.privateschoolstructure.services.TrainerService;
import org.mpous.privateschoolstructure.utilities.StudentsOnTheSameCalendarWeek;
import org.mpous.privateschoolstructure.utilities.StudentsThatBelongToMoreThanOneCourse;
import org.mpous.privateschoolstructure.utilities.SyntheticData;

//Singleton Class 
public class Menu {

    boolean exit;

    private static Menu menu;

    private Menu() {

    }

    public static Menu getInstance() {
        if (null == menu) {
            menu = new Menu();
        }
        return menu;
    }

    //Method that prints and displays "Welcome to our Private School".
    private void showHeader() {
        System.out.println("+--------------------------+");
        System.out.println("|     Welcome to our       | ");
        System.out.println("|     Private school       |");
        System.out.println("+--------------------------+");
    }

    private void showOptions() {
        System.out.println("\nPlease make a selection");
        System.out.println("1 Add Student");
        System.out.println("2 Add Trainer");
        System.out.println("3 Add Course");
        System.out.println("4 add Assignment ");
        System.out.println("5 add a student in a course");
        System.out.println("6 add a trainer in a course");
        System.out.println("7 add an assignment in a course");
        System.out.println("8 add an assignment in a student");
        System.out.println("9 show all students");
        System.out.println("10 show all trainers");
        System.out.println("11 show all courses");
        System.out.println("12 show all assignments");
        System.out.println("13 show all StudentsPerCourse");
        System.out.println("14 show all trainersPerCourse");
        System.out.println("15 show all assignmentsPerCourse");
        System.out.println("16 show all assignmentsPerStudent");
        System.out.println("17 show students who belong in more than one courses");
        System.out.println("18 give a date ,show students who need to submit one or more assignments");
        System.out.println("0 for exit");
    }

    public void runMenu() {
        showHeader();
        while (!exit) {
            showOptions();
            int choice = getInput();
            optionPerform(choice);
            if(choice==0){
            exit=true;
            }
        }
    }

    private int getInput() {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.print("Please enter your choice");
            String next = sc.next();
            try {
                choice = Integer.parseInt(next);
            } catch (NumberFormatException exp) {
            }
        } while (choice < 0 || choice > 18);

        return choice;
    }

    public void optionPerform(int choice) {
        SyntheticData sd = new SyntheticData();
        switch (choice) {
            case 1:
                StudentService ss = new StudentService();
                Student currentStudent = ss.addStudent();
                List<Student> studList = ss.saveStudent(currentStudent);
                break;
            case 2:
                TrainerService ts = new TrainerService();
                Trainer currentTrainer = ts.addTrainer();
                List<Trainer> trainerList = ts.saveTrainer(currentTrainer);
                break;
            case 3:
                CourseService cs = new CourseService();
                Course currentCourse = cs.addCourse();
                List<Course> courseList = cs.saveCourse(currentCourse);
                break;
            case 4:
                AssignmentService as = new AssignmentService();
                Assignment currentAssignment = as.addAssignment();
                List<Assignment> assignmentList = as.saveAssignment(currentAssignment);
                break;
            case 5:
                StudentPerCourseService spcs = new StudentPerCourseService();
                CourseService css = new CourseService();
                Course addCourseToStudent = css.addCourse();
                StudentPerCourse spc = spcs.addSCourseInStudent(addCourseToStudent);
                List<StudentPerCourse> spcList = spcs.savedSpC(spc);
                break;
            case 6:
                TrainerPerCourseService tpcs = new TrainerPerCourseService();
                CourseService csTrainer = new CourseService();
                Course addCourseToTrainer = csTrainer.addCourse();
                TrainerPerCourse tpc = tpcs.addTrainerInCourse(addCourseToTrainer);
                List<TrainerPerCourse> trainerPerCourseList = tpcs.savedSpC(tpc);
                break;
            case 7:
                AssignmentPerCourseService apcs = new AssignmentPerCourseService();
                CourseService csAssignment = new CourseService();
                Course addCourseInAssignment = csAssignment.addCourse();
                AssignmentPerCourse apc = apcs.addAssignmentInCourse(addCourseInAssignment);
                List<AssignmentPerCourse> assiPerCourseList = apcs.savedApC(apc);
            case 8:
                AssignmentPerStudentService apss = new AssignmentPerStudentService();
                AssignmentService assi = new AssignmentService();
                Assignment addAssignmentInStudent = assi.addAssignment();
                AssignmentPerStudent aps = apss.addAssignmentInStudent(addAssignmentInStudent);
                List<AssignmentPerStudent> assPerStudent = apss.savedApS(aps);
                break;
            case 9:
                sd.showStudents();
                break;
            case 10:
                sd.showTrainers();
                break;
            case 11:
                sd.showCourse();
                break;
            case 12:
                sd.showAssignments();
                break;
            case 13:
                sd.showStudentsPerCourse();
                break;
            case 14:
                sd.showTrainerPerCourse();
                break;
            case 15:
                sd.showAssignmentsPerCourse();
                break;
            case 16:
                sd.showAssignmentsPerStudent();
                break;
            case 17:
                StudentsThatBelongToMoreThanOneCourse.showStudentsThatBelongInMoreThanOneCourse();
                break;
            case 18:
                Date date = new Date();
                StudentsOnTheSameCalendarWeek.isInSameWeek(date);
                break;
        }

    }

}
