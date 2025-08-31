package Task3;

import java.util.PriorityQueue;

public class EventList {
    PriorityQueue <Event> events = new PriorityQueue<>();
    public void addEvent(Event e){
        events.add(e);
    }
    public void removeEvent(){
        events.remove();
    }
    public Event getremoveEvent(){
        return events.remove();
    }
    public PriorityQueue<Event> printQueueList() {
            return new PriorityQueue<>(events);
    }


}
