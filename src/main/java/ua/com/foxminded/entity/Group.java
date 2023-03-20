package ua.com.foxminded.entity;

import java.util.List;
import java.util.Objects;

public class Group {

    private String name;
    private Student monitor;
    private Faculty faculty;
    private List<Student> students;

    public Group(String name, Student monitor, Faculty faculty, List<Student> students) {
        this.name = name;
        this.monitor = monitor;
        this.faculty = faculty;
        this.students = students;
    }

    public Group() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getMonitor() {
        return monitor;
    }

    public void setMonitor(Student monitor) {
        this.monitor = monitor;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(name, group.name) && Objects.equals(monitor, group.monitor) && Objects.equals(faculty, group.faculty) && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, monitor, faculty, students);
    }
}
