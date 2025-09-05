package Task3;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        EventList eventList = new EventList();
        eventList.addEvent(new Event("B1", 5, EventType.Arrival));
        eventList.addEvent(new Event("B3", 6, EventType.Transfer));
        eventList.addEvent(new Event("B1", 10, EventType.Arrival));
        eventList.addEvent(new Event("B4", 10, EventType.Exit));
        eventList.addEvent(new Event("B3", 11, EventType.Transfer));
        eventList.addEvent(new Event("B1", 15, EventType.Arrival));
        eventList.addEvent(new Event("B3", 16, EventType.Transfer));
        eventList.addEvent(new Event("B2", 10, EventType.Arrival));
        eventList.addEvent(new Event("B3", 12, EventType.Exit));
        eventList.addEvent(new Event("B5", 18, EventType.Transfer));
        eventList.addEvent(new Event("B2", 20, EventType.Arrival));
        eventList.addEvent(new Event("B4", 20, EventType.Exit));
        System.out.println("All events are in queue\n");
        System.out.println("The contents of the Task2.EventList");
        PriorityQueue<Event> print = eventList.printQueueList();
        while (!print.isEmpty()) {
            System.out.println(print.poll());
        }
        System.out.println();
        Event nextEvent = eventList.getremoveEvent();
        //Clock.getInstance().setTime(nextEvent.getTime());
        System.out.println("Next event: " + nextEvent);
        //System.out.println("Current time: " + Clock.getInstance().getTime());

    }
}
