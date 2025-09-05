package task6;

import java.util.PriorityQueue;

public class EventList {
    PriorityQueue <Event> events = new PriorityQueue<>();
    public void addEvent(Event e){
        events.add(e);
    }
    public Event getLastEvent() {
        return events.peek();


    }
    public void removeEvent(){
        events.remove();
    }
    public Event getremoveEvent(){
        return events.remove();
    }
    public PriorityQueue<Event> getEventList() {
        return new PriorityQueue<>(events);
    }

    public int size() {
        return events.size();
    }


}
