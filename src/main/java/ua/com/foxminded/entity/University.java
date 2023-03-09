package ua.com.foxminded.entity;

import java.util.List;

public class University {

    private String name;
    private List<Faculty> faculties;
    private List<Holiday> holidays;

    public University(String name, List<Faculty> faculties, List<Holiday> holidays) {
        this.name = name;
        this.faculties = faculties;
        this.holidays = holidays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public List<Holiday> getHolidays() {
        return holidays;
    }

    public void setHolidays(List<Holiday> holidays) {
        this.holidays = holidays;
    }


}
