package task5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Clock {
    // only static variable
    private static Clock instance;
    private LocalDateTime currentTime;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");


    // private constructor to restrict instantiation from other classes
    private Clock() {
        currentTime = LocalDateTime.now();
    }

    // static method to create instance of Singleton class
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    //getter
    public LocalDateTime getTime() {
        return currentTime;
    }
    public String getFormattedTime() {
        return currentTime.format(formatter);
    }

        //setter
    public void setTime(LocalDateTime newTime) {
        if (newTime.isAfter( currentTime)) {
            currentTime = newTime;
        } else {
            throw new IllegalArgumentException("Can not update time in pass.");
        }
    }

    public void reset() {
        currentTime = LocalDateTime.now();
    }
}
