package ua.com.foxminded.entity;

import java.util.Objects;

public class Audience {

    private int number;
    private int capacity;
    private boolean isAvailable;

    public Audience(int number, int capacity, boolean isAvailable) {
        this.number = number;
        this.capacity = capacity;
        this.isAvailable = isAvailable;
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
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audience audience = (Audience) o;
        return number == audience.number && capacity == audience.capacity && isAvailable == audience.isAvailable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, capacity, isAvailable);
    }
}
