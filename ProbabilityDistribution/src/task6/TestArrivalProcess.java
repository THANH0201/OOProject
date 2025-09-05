package task6;
import eduni.distributions.Negexp;

import java.util.*;

public class TestArrivalProcess {
    public static void main(String[] args) {
        // set up the clock
        Clock clock = Clock.getInstance();
        clock.reset();

        // Initialize an empty event list
        EventList eventList = new EventList();
        // Create a negative exponential generator with mean 1.0
        long seed = new Random(System.currentTimeMillis()).nextLong();
        Negexp generator = new Negexp(1.0,  seed);
        System.out.println("Seed used: " + seed);

        // Initialize an arrival process
        ArrivalProcess arrivalProcess = new ArrivalProcess(EventType.Arrival, generator);

        // 10 iterations to generate arrivals
        for (int i = 0; i < 10; i++) {

            arrivalProcess.generateArrival(eventList, clock.getTime());

            // get time of last event

            Event lastEvent = eventList.getLastEvent();

            double newTime = lastEvent.getEventTime();

            // update the clock
            clock.setTime(newTime);
        }

        // Print the event list
        System.out.println("Event list:");
        PriorityQueue<Event> queue = eventList.getEventList();
        List<Event> sortedEvents = new ArrayList<>(queue);
        sortedEvents.sort(Comparator.comparingDouble(Event::getEventTime));

        for (Event e : sortedEvents) {
            System.out.println(e);
        }

        }
}