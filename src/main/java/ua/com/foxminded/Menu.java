package ua.com.foxminded;

import ua.com.foxminded.service.LectureService;
import ua.com.foxminded.service.StudentService;
import ua.com.foxminded.service.TeacherService;

import java.util.Scanner;

public class Menu {

    private TeacherService teacherService = new TeacherService();
    private StudentService studentService = new StudentService();
    private LectureService lectureService = new LectureService();

    public void start() {
        Scanner input = new Scanner(System.in);
        int option, subOption;
        do {
            startMainMenu();
            option = input.nextInt();
            switch (option) {
                case 1: {
                    do {
                        startSubMenuForTeachers();
                        subOption = input.nextInt();
                        chooseSubOptionsForTeacher(input, subOption);
                    } while (subOption != 6);
                    break;
                }

                case 2: {
                    do {
                        startSubMenuForStudents();
                        subOption = input.nextInt();
                        chooseSubOptionsForStudent(input, subOption);
                    } while (subOption != 6);
                    break;
                }

                case 3: {
                    do {
                        startSubMenuForLectures();
                        subOption = input.nextInt();
                        chooseSubOptionsForLecture(input, subOption);
                    } while (subOption != 5);
                    break;

                }
            }
        } while (option != 4);
    }

    public void startMainMenu() {
        System.out.println("Main Menu:");
        System.out.println("1. Manage Teachers");
        System.out.println("2. Manage Students");
        System.out.println("3. Manage Lectures");
        System.out.println("4. Exit");
    }

    public void startSubMenuForTeachers() {
        System.out.println("Teachers Sub-Menu:");
        System.out.println("1. Create a Teacher");
        System.out.println("2. Update a Teacher");
        System.out.println("3. Delete a Teacher");
        System.out.println("4. Show All Teachers");
        System.out.println("5. Search a Teacher by ID");
        System.out.println("6. Exit");
    }

    public void startSubMenuForStudents() {
        System.out.println("Students Sub-Menu:");
        System.out.println("1. Create a Student");
        System.out.println("2. Update a Student");
        System.out.println("3. Delete a Student");
        System.out.println("4. Show All Students");
        System.out.println("5. Get a Student by ID");
        System.out.println("6. Exit");
    }

    public void startSubMenuForLectures() {
        System.out.println("Lectures Sub-Menu:");
        System.out.println("1. Add lecture ");
        System.out.println("2. Update lecture ");
        System.out.println("3. Delete lecture ");
        System.out.println("4. Show All Lectures");
        System.out.println("5. Exit");
    }

    public void chooseSubOptionsForTeacher(Scanner input, int subOption) {
        switch (subOption) {
            case 1: {
                System.out.println("Create a Teacher");
                teacherService.addTeacher(input);
                break;
            }
            case 2: {
                System.out.println("Update a Teacher");
                teacherService.updateTeacher(input);
                break;
            }
            case 3: {
                System.out.println("Delete a Teacher");
                teacherService.delete(input.nextInt());
            }
            case 4: {
                System.out.println("Read All Teachers");
                teacherService.showAllTeachers();
                break;
            }
            case 5: {
                System.out.println("Search a Teacher");
                teacherService.findById(input.nextInt());
                break;
            }
            case 6: {
                System.out.println("Exit");
                break;
            }
        }
    }

    public void chooseSubOptionsForStudent(Scanner input, int subOption) {
        switch (subOption) {
            case 1: {
                System.out.println("Create a Student");
                studentService.addStudent(input);
                break;
            }
            case 2: {
                System.out.println("Update a Student");
                studentService.updateStudent(input);
                break;
            }
            case 3: {
                System.out.println("Delete a Student");
                studentService.delete(input.nextInt());
                break;
            }
            case 4: {
                System.out.println("Read All Students");
                studentService.showAllStudents();
                break;
            }
            case 5: {
                System.out.println("Search a Student");
                studentService.findById(input.nextInt());
                break;
            }
            case 6: {
                System.out.println("Exit");
                break;
            }
        }
    }

    public void chooseSubOptionsForLecture(Scanner input, int subOption) {
        switch (subOption) {
            case 1: {
                System.out.println("Add a lecture");
                lectureService.addLecture(input);
                break;
            }
            case 2: {
                System.out.println("Update lecture");
                lectureService.updateLecture(input);
                break;
            }
            case 3: {
                System.out.println("Delete lecture");
                lectureService.deleteByID(input.nextInt());
                break;
            }
            case 4: {
                System.out.println("Show all lectures");
                lectureService.showAllLectures();
                break;
            }
            case 5: {
                System.out.println("Exit");
                break;
            }
        }
    }
}
