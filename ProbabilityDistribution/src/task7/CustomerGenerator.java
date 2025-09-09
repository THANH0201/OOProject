package task7;

import java.util.ArrayList;

import java.util.List;

public class CustomerGenerator {
    public CustomerGenerator(List<Event> arrivals, ServicePoint servicePoint) {
        for (int i = 0; i < arrivals.size(); i++) {
            Event e = arrivals.get(i);
            Customer customer = new Customer(i + 1);
            customer.setTimeStart(e.getEventTime());
            servicePoint.addToQueueue(customer);
        }
    }


}
