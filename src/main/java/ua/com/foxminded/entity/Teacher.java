package ua.com.foxminded.entity;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Teacher extends Person {

    private int id;
    private BigDecimal salary;
    private List<Subject> subjects;
    private String degree;
    private Faculty faculty;
    private List<Vacation> vacations;

    public Teacher(String firstName, String lastName, int id, BigDecimal salary, List<Subject> subjects, String degree, Faculty faculty, List<Vacation> vacations) {
        super(firstName, lastName);
        this.id = id;
        this.salary = salary;
        this.subjects = subjects;
        this.degree = degree;
        this.faculty = faculty;
        this.vacations = vacations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public List<Vacation> getVacations() {
        return vacations;
    }

    public void setVacations(List<Vacation> vacations) {
        this.vacations = vacations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return id == teacher.id && Objects.equals(salary, teacher.salary) && Objects.equals(subjects, teacher.subjects) && Objects.equals(degree, teacher.degree) && Objects.equals(faculty, teacher.faculty) && Objects.equals(vacations, teacher.vacations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, salary, subjects, degree, faculty, vacations);
    }
}
