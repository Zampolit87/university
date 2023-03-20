package ua.com.foxminded.entity;

import java.util.Objects;

public class Audience {

    private int number;
    private int capacity;
    private boolean available;

    public Audience(int number, int capacity, boolean available) {
        this.number = number;
        this.capacity = capacity;
        this.available = available;
    }

    public Audience() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audience audience = (Audience) o;
        return number == audience.number && capacity == audience.capacity && available == audience.available;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, capacity, available);
    }
}
