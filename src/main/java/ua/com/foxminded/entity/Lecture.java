package ua.com.foxminded.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Lecture {

    private int id;
    private Subject subject;
    private Audience audience;
    private Teacher teacher;
    private LectureTime lectureTime;
    private List<Group> groups;
    private LocalDate date;

    public Lecture(int id, Subject subject, Audience audience, Teacher teacher, LectureTime lectureTime, List<Group> groups, LocalDate date) {
        this.id = id;
        this.subject = subject;
        this.audience = audience;
        this.teacher = teacher;
        this.lectureTime = lectureTime;
        this.groups = groups;
        this.date = date;
    }

    public Lecture() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Audience getAudience() {
        return audience;
    }

    public void setAudience(Audience audience) {
        this.audience = audience;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public LectureTime getLectureTime() {
        return lectureTime;
    }

    public void setLectureTime(LectureTime lectureTime) {
        this.lectureTime = lectureTime;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lecture lecture = (Lecture) o;
        return id == lecture.id && Objects.equals(subject, lecture.subject) && Objects.equals(audience, lecture.audience) && Objects.equals(teacher, lecture.teacher) && Objects.equals(lectureTime, lecture.lectureTime) && Objects.equals(groups, lecture.groups) && Objects.equals(date, lecture.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subject, audience, teacher, lectureTime, groups, date);
    }
}
