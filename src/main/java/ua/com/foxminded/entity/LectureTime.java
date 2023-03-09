package ua.com.foxminded.entity;

import java.time.LocalTime;

public class LectureTime {

    private LocalTime timeBegin;
    private LocalTime timeEnd;

    public LectureTime(LocalTime timeBegin, LocalTime timeEnd) {
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
    }

    public LocalTime getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(LocalTime timeBegin) {
        this.timeBegin = timeBegin;
    }

    public LocalTime getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(LocalTime timeEnd) {
        this.timeEnd = timeEnd;
    }
}
