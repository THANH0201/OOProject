package task6;

import eduni.distributions.Negexp;

public class ArrivalProcess {
    private EventType eventType;
    private Negexp generator; //(negative exponential)

    public ArrivalProcess(EventType eventType, Negexp generator) {
        this.eventType = eventType;
        this.generator = generator;
    }
    public void generateArrival(EventList list, double currentTime) {
        double interval = generator.sample();
        //System.out.println("Interval: " + interval);
        double nextTime = currentTime + interval; // corrected from addition
        Event newEvent = new Event(nextTime, eventType); // updated to use the seconds for Event
        list.addEvent(newEvent);

    }
}

