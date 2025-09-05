package task5;

import java.time.LocalDateTime;
public class ClockTest {

    public static void main(String[] args) {
        // get the singleton instance of Clock
        System.out.println("Starting Clock Test");
        Clock clock = Clock.getInstance();

        // Test initial time
        System.out.println("Time now: " + clock.getFormattedTime());

        // update time
        LocalDateTime newTime = clock.getTime().plusMinutes(5);
        clock.setTime(newTime);
        System.out.println("Time after updating 5 minutes: " + clock.getFormattedTime());

        try {
            LocalDateTime earlierTime = clock.getTime().minusMinutes(3);
            clock.setTime(earlierTime);
        } catch (IllegalArgumentException e) {
            System.out.println("error: " + e.getMessage());
        }

        // Reset
        clock.reset();
        System.out.println("Time after reseting: " + clock.getFormattedTime());

        // Test singleton property
        Clock anotherClock = Clock.getInstance();
        anotherClock.setTime(clock.getTime().plusMinutes(10));
        System.out.println("Time from another instance: " + clock.getFormattedTime());
        System.out.println("Ending Clock Test");
    }
}
