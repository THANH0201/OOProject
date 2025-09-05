package task6;

public class Event implements Comparable<Event> {
    private double eventTime;
    private EventType eventType;


    public Event(double eventTime, EventType eventType) {
        this.eventTime = eventTime;
        this.eventType = eventType;
    }

    public double getEventTime() {
        return eventTime;
    }

    public void setEventTime(int eventTime) {
        this.eventTime = eventTime;
    }
    public EventType getEventType() {
        return eventType;
    }
    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    @Override
    public int compareTo(Event event) {
        return Double.compare(this.eventTime, event.eventTime);
        /*if (eventTime > event.eventTime) {
            return 1;
        } else if (eventTime < event.eventTime) {
            return -1;
        } else {
            return 0;
        }
         */
    }

    @Override
    public String toString() {
        return String.format("The event type: %s, time: %f", eventType, eventTime);
    }


    public double getEventDuration() {
        return eventTime;
    }

    public void setEventDuration(double eventDuration) {
        this.eventTime = eventDuration;
    }

    public double getEventTimeInSeconds() {
        return eventTime;
    }
}