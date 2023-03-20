package ua.com.foxminded.entity;

import java.util.List;
import java.util.Objects;

public class Faculty {

    private String name;
    private Teacher dean;
    private List<Audience> audiences;
    private List<Teacher> teachers;
    private List<Group> groups;

    public Faculty(String name, Teacher dean, List<Audience> audiences, List<Teacher> teachers, List<Group> groups) {
        this.name = name;
        this.dean = dean;
        this.audiences = audiences;
        this.teachers = teachers;
        this.groups = groups;
    }

    public Faculty() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getDean() {
        return dean;
    }

    public void setDean(Teacher dean) {
        this.dean = dean;
    }

    public List<Audience> getAudiences() {
        return audiences;
    }

    public void setAudiences(List<Audience> audiences) {
        this.audiences = audiences;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(name, faculty.name) && Objects.equals(dean, faculty.dean) && Objects.equals(audiences, faculty.audiences) && Objects.equals(teachers, faculty.teachers) && Objects.equals(groups, faculty.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dean, audiences, teachers, groups);
    }
}
