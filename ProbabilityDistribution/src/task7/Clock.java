package task7;

public class Clock {
    // only static variable
    private static Clock instance;
    private double currentTime;


    // private constructor to restrict instantiation from other classes
    private Clock() {
        this.currentTime = 0.0;
    }

    // static method to create instance of Singleton class
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    //getter
    public double getTime() {
        return currentTime;
    }

    public void reset() {
        currentTime = 0;
    }

    public void setTime(double newTime) {
        this.currentTime = newTime;
    }

    public void advance(int serviceTime) {
        this.currentTime += serviceTime;

    }
}

