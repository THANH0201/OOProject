package Task2;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        EventList eventList = new EventList();
        eventList.addEvent(new Event("F1", 5));
        eventList.addEvent(new Event("F2", 10));
        eventList.addEvent(new Event("F3", 15));
        eventList.addEvent(new Event("M1", 10));
        eventList.addEvent(new Event("M2", 20));
        System.out.println("All events are in queue\n");
        System.out.println("The contents of the Task2.EventList");
        PriorityQueue<Event> print = eventList.printQueueList();
        while (!print.isEmpty()) {
            System.out.println(print.poll());
        }
        System.out.println();
        System.out.println("Next event: " + eventList.getremoveEvent());
    }
}
