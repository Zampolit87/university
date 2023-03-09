package ua.com.foxminded.entity;

import java.util.Objects;

public class Subject {

    private String name;
    private String description;

    public Subject(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(name, subject.name) && Objects.equals(description, subject.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}
