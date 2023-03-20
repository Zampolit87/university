package ua.com.foxminded.service;

import ua.com.foxminded.entity.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LectureService {

    private List<Lecture> lectures = new ArrayList<>();

    public void addLecture(Scanner input) {
        Lecture lecture = new Lecture();
        lecture.setId(lectures.size() + 1);
        System.out.println("What subject?");
        Subject subject = new Subject();
        subject.setName(input.next());
        System.out.println("What audience number?");
        Audience audience = new Audience();
        audience.setNumber(input.nextInt());
        System.out.println("Enter teacher's name");
        Teacher teacher = new Teacher();
        teacher.setFirstName(input.next());
        System.out.println("Enter date");
        lecture.setDate(LocalDate.parse(input.next()));
        System.out.println("Enter lecture's start time");
        LectureTime lectureTime = new LectureTime();
        lectureTime.setTimeBegin(LocalTime.parse(input.next()));
        System.out.println("Enter lecture's end time");
        lectureTime.setTimeEnd(LocalTime.parse(input.next()));
        List<Group> groups = new ArrayList<>();
        while (true) {
            Group group = new Group();
            System.out.println("Enter new group name:");
            group.setName(input.next());
            groups.add(group);
            System.out.println("Add another group?");
            if (input.next().equalsIgnoreCase("no")) {
                break;
            }
        }
    }

    public void updateLecture(Scanner input) {
        if (lectures.isEmpty()) {
            System.out.println("No students here");
        }
        lectures.stream()
                .filter(student -> student.getId() == input.nextInt())
                .findAny()
                .ifPresent(student -> {
                    Lecture lecture = new Lecture();
                    System.out.println("What subject?");
                    Subject subject = new Subject();
                    subject.setName(input.next());
                    System.out.println("What audience number?");
                    Audience audience = new Audience();
                    audience.setNumber(input.nextInt());
                    System.out.println("Enter teacher's name");
                    Teacher teacher = new Teacher();
                    teacher.setFirstName(input.next());
                    System.out.println("Enter date");
                    lecture.setDate(LocalDate.parse(input.next()));
                    System.out.println("Enter lecture's start time");
                    LectureTime lectureTime = new LectureTime();
                    lectureTime.setTimeBegin(LocalTime.parse(input.next()));
                    System.out.println("Enter lecture's end time");
                    lectureTime.setTimeEnd(LocalTime.parse(input.next()));
                    List<Group> groups = new ArrayList<>();
                    while (true) {
                        Group group = new Group();
                        System.out.println("Enter new group name:");
                        group.setName(input.next());
                        groups.add(group);
                        System.out.println("Add another group?");
                        if (input.next().equalsIgnoreCase("no")) {
                            break;
                        }
                    }
                });
        System.out.println("Lecture updated");
    }

    public void deleteByID(int id) {
        if (lectures.isEmpty()) {
            System.out.println("No lectures here");
        }
        lectures.removeIf(s -> s.getId() == id);
    }

    public void showAllLectures() {
        if (lectures.isEmpty()) {
            System.out.println("No lectures here");
        }
        lectures.forEach(l -> System.out.println(l.getId()));
    }
}
