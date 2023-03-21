package ua.com.foxminded.service;

import ua.com.foxminded.entity.Address;
import ua.com.foxminded.entity.Group;
import ua.com.foxminded.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import static java.time.LocalDate.parse;
import static ua.com.foxminded.entity.Gender.valueOf;

public class StudentService {

    List<Student> students = new ArrayList<>();

    public void addStudent(Scanner input) {
        Student student = new Student();
        student.setId(students.size() + 1);
        System.out.println("First name:");
        student.setFirstName(input.next());
        System.out.println("Last name:");
        student.setLastName(input.next());
        System.out.println("Email:");
        student.setEmail(input.next());
        System.out.println("Phone number:");
        student.setPhoneNumber(input.next());
        System.out.println("Birth date:");
        student.setBirthDate(parse(input.next()));
        System.out.println("Gender:");
        student.setGender(valueOf(input.next()));
        System.out.println("AverageMark:");
        student.setAverageMark(input.nextDouble());

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
        student.setAddress(address);

        System.out.println("Group:");
        Group group = new Group();
        group.setName(input.next());
        student.setGroup(group);
    }

    public void updateStudent(Scanner input) {
        if (students.isEmpty()) {
            System.out.println("No students here");
        }
        students.stream()
                .filter(student -> student.getId() == input.nextInt())
                .findAny()
                .ifPresent(student -> {
                    System.out.println("First name:");
                    student.setFirstName(input.next());
                    System.out.println("Last name:");
                    student.setLastName(input.next());
                    System.out.println("Email:");
                    student.setEmail(input.next());
                    System.out.println("Phone number:");
                    student.setPhoneNumber(input.next());
                    System.out.println("Birth date:");
                    student.setBirthDate(parse(input.next()));
                    System.out.println("Gender:");
                    student.setGender(valueOf(input.next()));
                    System.out.println("AverageMark:");
                    student.setAverageMark(input.nextDouble());

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
                    student.setAddress(address);

                    System.out.println("Group:");
                    Group group = new Group();
                    group.setName(input.next());
                    student.setGroup(group);
                });
        System.out.println("Student updated");
    }

    public void findById(int id) {
        if (students.isEmpty()) {
            System.out.println("No students here");
        }
        students.stream().filter(s -> s.getId() == id).findAny().ifPresent(s -> {
            System.out.println(s.getFirstName() + " " + s.getLastName());
        });
    }

    public void delete(int id) {
        if (students.isEmpty()) {
            System.out.println("No students here");
        }
        students.removeIf(s -> s.getId() == id);
    }

    public void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students here");
        }
        AtomicInteger count = new AtomicInteger(0);
        students.forEach(s -> System.out.println(count.incrementAndGet() + ". " + s.getFirstName() + " " + s.getLastName()));
    }
}
