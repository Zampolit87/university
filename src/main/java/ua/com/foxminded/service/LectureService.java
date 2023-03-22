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

        System.out.println("Groups:");
        addGroups(input);

        lectures.add(lecture);
        System.out.println("Lecture added!");
    }

    private static List<Group> addGroups(Scanner input) {
        List<Group> groups = new ArrayList<>();
        do {
            Group group = new Group();
            System.out.println("Enter new group name:");
            group.setName(input.next());
            groups.add(group);
            System.out.println("Add another group?");
        } while (input.next().equals("yes"));
        return groups;
    }

    public void updateLecture(Scanner input) {
        if (lectures.isEmpty()) {
            System.out.println("No lectures here");
        }
        lectures.stream()
            .filter(l -> l.getId() == input.nextInt())
            .findAny()
            .ifPresent(l -> {
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

                addGroups(input);
            });
        System.out.println("Lecture updated");
    }

    public void delete(int id) {
        if (lectures.isEmpty()) {
            System.out.println("No lectures here");
        }
        lectures.removeIf(l -> l.getId() == id);
    }

    public void showAllLectures() {
        if (lectures.isEmpty()) {
            System.out.println("No lectures here");
        }
        lectures.forEach(l -> System.out.println(l.getId()));
    }
}
