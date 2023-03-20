package ua.com.foxminded.service;

import ua.com.foxminded.entity.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class TeacherService {

    List<Teacher> teachers = new ArrayList<>();

    public void addTeacher(Scanner input) {
        Teacher teacher = new Teacher();
        teacher.setId(teachers.size() + 1);
        System.out.println("First name:");
        teacher.setFirstName(input.next());
        System.out.println("Last name:");
        teacher.setLastName(input.next());
        System.out.println("Email:");
        teacher.setEmail(input.next());
        System.out.println("Phone number:");
        teacher.setPhoneNumber(input.next());
        System.out.println("Birth date:");
        teacher.setBirthDate(LocalDate.parse(input.next()));
        System.out.println("Salary:");
        teacher.setSalary(BigDecimal.valueOf(input.nextInt()));
        System.out.println("Gender:");
        teacher.setGender(Gender.valueOf(input.next()));
        System.out.println("Degree:");
        teacher.setDegree(Degree.valueOf(input.next()));

        System.out.println("Address:");
        Address address = new Address();
        System.out.println("Country:");
        address.setCountry(input.next());
        System.out.println("Postal code:");
        address.setZipCode(input.nextInt());
        System.out.println("Region:");
        address.setRegion(input.next());
        System.out.println("City:");
        address.setCity(input.next());
        System.out.println("Street:");
        address.setStreet(input.next());
        teacher.setAddress(address);

        System.out.println("Faculty name:");
        Faculty faculty = new Faculty();
        faculty.setName(input.next());

        System.out.println("Subjects:");
        List<Subject> subjects = new ArrayList<>();
        while (true) {
            Subject subject = new Subject();
            System.out.println("Enter subject's name:");
            subject.setName(input.next());
            subjects.add(subject);
            System.out.println("Add another subject?");
            if (input.next().equals("no")) {
                break;
            }
        }

        List<Vacation> vacations = new ArrayList<>();
        while (true) {
            Vacation vacation = new Vacation();
            System.out.println("Enter new vacation start date:");
            vacation.setDateStart(LocalDate.parse(input.next()));
            System.out.println("Vacation's end date");
            vacation.setDateEnd(LocalDate.parse(input.next()));
            vacations.add(vacation);
            System.out.println("Add another vacation?");
            if (input.next().equalsIgnoreCase("no")) {
                break;
            }
        }
        System.out.println("New teacher added!");
    }

    public void updateTeacher(Scanner input) {
        if (teachers.isEmpty()) {
            System.out.println("No students here");
        }
        teachers.stream()
                .filter(student -> student.getId() == input.nextInt())
                .findAny()
                .ifPresent(student -> {
                    Teacher teacher = new Teacher();
                    teacher.setId(teachers.size() + 1);
                    System.out.println("First name:");
                    teacher.setFirstName(input.next());
                    System.out.println("Last name:");
                    teacher.setLastName(input.next());
                    System.out.println("Email:");
                    teacher.setEmail(input.next());
                    System.out.println("Phone number:");
                    teacher.setPhoneNumber(input.next());
                    System.out.println("Birth date:");
                    teacher.setBirthDate(LocalDate.parse(input.next()));
                    System.out.println("Salary:");
                    teacher.setSalary(BigDecimal.valueOf(input.nextInt()));
                    System.out.println("Gender:");
                    teacher.setGender(Gender.valueOf(input.next()));
                    System.out.println("Degree:");
                    teacher.setDegree(Degree.valueOf(input.next()));

                    System.out.println("Address:");
                    Address address = new Address();
                    System.out.println("Country:");
                    address.setCountry(input.next());
                    System.out.println("Postal code:");
                    address.setZipCode(input.nextInt());
                    System.out.println("Region:");
                    address.setRegion(input.next());
                    System.out.println("City:");
                    address.setCity(input.next());
                    System.out.println("Street:");
                    address.setStreet(input.next());
                    teacher.setAddress(address);

                    System.out.println("Faculty name:");
                    Faculty faculty = new Faculty();
                    faculty.setName(input.next());

                    System.out.println("Subjects:");
                    List<Subject> subjects = new ArrayList<>();
                    while (true) {
                        Subject subject = new Subject();
                        System.out.println("Enter subject's name:");
                        subject.setName(input.next());
                        subjects.add(subject);
                        System.out.println("Add another subject?");
                        if (input.next().equals("no")) {
                            break;
                        }
                    }

                    List<Vacation> vacations = new ArrayList<>();
                    while (true) {
                        Vacation vacation = new Vacation();
                        System.out.println("Enter new vacation start date:");
                        vacation.setDateStart(LocalDate.parse(input.next()));
                        System.out.println("Vacation's end date");
                        vacation.setDateEnd(LocalDate.parse(input.next()));
                        vacations.add(vacation);
                        System.out.println("Add another vacation?");
                        if (input.next().equalsIgnoreCase("no")) {
                            break;
                        }
                    }
                });
        System.out.println("Teacher updated!");
    }

    public void findById(int id) {
        if (teachers.isEmpty()) {
            System.out.println("No teachers here");
        }
        teachers.stream().filter(s -> s.getId() == id).findAny().ifPresent(s -> {
            System.out.println(s.getFirstName() + " " + s.getLastName());
        });
    }

    public void deleteByID(int id) {
        if (teachers.isEmpty()) {
            System.out.println("No teachers here");
        }
        teachers.removeIf(s -> s.getId() == id);
    }

    public void showAllTeachers() {
        if (teachers.isEmpty()) {
            System.out.println("No teachers here");
        }
        AtomicInteger count = new AtomicInteger(0);
        teachers.forEach(s -> System.out.println(count.incrementAndGet() + ". " + s.getFirstName() + " " + s.getLastName()));
    }
}
