package task7;

import eduni.distributions.Negexp;
import java.util.*;

public class ArrivalEventGenerator {
    private final EventList eventList;
    private final Clock clock;
    private final ArrivalProcess arrivalProcess;

    public ArrivalEventGenerator(int numberOfArrivals, long seed) {
        this.clock = Clock.getInstance();
        this.clock.reset();

        this.eventList = new EventList();
        Negexp generator = new Negexp(1.0, seed);
        this.arrivalProcess = new ArrivalProcess(EventType.Arrival, generator);

        generateArrivals(numberOfArrivals);
    }

    private void generateArrivals(int count) {
        for (int i = 0; i < count; i++) {
            arrivalProcess.generateArrival(eventList, clock.getTime());
            Event lastEvent = eventList.getLastEvent();
            clock.setTime(lastEvent.getEventTime());
        }
    }

    public List<Event> getSortedArrivals() {
        PriorityQueue<Event> queue = eventList.getEventList();
        List<Event> sorted = new ArrayList<>(queue);
        sorted.sort(Comparator.comparingDouble(Event::getEventTime));
        return sorted;
    }

    public double getLastArrivalTime() {
        Event lastEvent = eventList.getLastEvent();
        return lastEvent != null ? lastEvent.getEventTime() : 0.0;
    }
}