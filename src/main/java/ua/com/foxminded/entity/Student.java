package ua.com.foxminded.entity;

import java.util.Objects;

public class Student extends Person {

    private int id;
    private Group group;
    private Double averageMark;

    public Student(String firstName, String lastName, int id, Group group, Double averageMark) {
        super(firstName, lastName);
        this.id = id;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(Double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(group, student.group) && Objects.equals(averageMark, student.averageMark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, group, averageMark);
    }
}
