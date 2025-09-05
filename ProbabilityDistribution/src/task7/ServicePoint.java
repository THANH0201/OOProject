package task7;

import java.util.ArrayList;
import java.util.LinkedList;

public class ServicePoint {
    LinkedList<Customer> queue = new LinkedList <>();
    Clock clock = Clock.getInstance();
    public void addToQueueue(Customer a) {
        queue.addLast(a);
    }
    public Customer removeFromQueueue() {
        return queue.removeFirst();
    }

    public void serve(Clock clock) {
        ArrayList<Integer> serviceTimes = new ArrayList<>();
        while (!queue.isEmpty()) {
            Customer movCustomer = removeFromQueueue();
            movCustomer.setTimeStartServed(clock.getTime());
            System.out.printf("Customer %d is on serving at %f\n", movCustomer.getId(), clock.getTime());
            double waitTime = (movCustomer.getTimeStartServed()-movCustomer.getTimeStart());

            int serviceTime = (int) (Math.random() * 3 + 1);//second
            serviceTimes.add(serviceTime);
            clock.advance(serviceTime);
            movCustomer.setTimeEnd(clock.getTime());
            //try {
            //    Thread.sleep(serviceTime);
            //} catch (InterruptedException e) {
            //    e.printStackTrace();
            //}
            //movCustomer.setTimeEnd(System.nanoTime());

            double responseTime = waitTime + serviceTime;
            System.out.printf("Customer %d done at %f:\nWait Time: %.5f s\nService Time: %d s\nResponse Time: %.5f s\n\n",  movCustomer.getId(), clock.getTime(), waitTime, serviceTime, responseTime);
        }
        System.out.println("All customer served.");
        int sum = 0;
        for (int i = 0; i < serviceTimes.size();i++){
            sum += serviceTimes.get(i);
        }
        System.out.println("Average service time: \n " + (double)sum/serviceTimes.size() + "seconds");
    }

    public String getQueue() {
        return queue.toString();
    }

}
