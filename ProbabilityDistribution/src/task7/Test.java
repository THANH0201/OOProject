package task7;

import java.util.List;

public class Test {

    public void runTest() {
        // create arrival events
        long seed = 5;
        ArrivalEventGenerator arrivalGen = new ArrivalEventGenerator(10, seed);
        List<Event> arrivals = arrivalGen.getSortedArrivals();
        System.out.println("Generated arrival events:"+ arrivals);

        // create service point
        ServicePoint servicePoint = new ServicePoint();

        // create customers and add them to the service point queue
        CustomerGenerator customerGen = new CustomerGenerator(arrivals, servicePoint);
        System.out.println("All customers added to the queue: " + servicePoint.getQueue());
        // initialize the clock
        Clock clock = Clock.getInstance();
        // clock start from time of the last arrival event
        double lastArrivalTime = arrivals.get(arrivals.size() - 1).getEventTime();
        clock.setTime(lastArrivalTime);
        // serve customers
        System.out.println("Customer service results:");
        servicePoint.serve(Clock.getInstance());

        // print final clock time
        System.out.println("Final clock time: " + clock.getTime());
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.runTest();
    }
}