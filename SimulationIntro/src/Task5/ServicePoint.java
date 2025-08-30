package Task5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class ServicePoint {
    LinkedList<Customer> queueP1 = new LinkedList <>();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public void addToQueueue(Customer a) {
        queueP1.addLast(a);
    }
    public Customer removeFromQueueue() {
        return queueP1.removeFirst();
    }
    public void serve(){
        while (!queueP1.isEmpty()) {
            Customer movCustomer = removeFromQueueue();
            System.out.printf("Customer %d is on serving at\n", movCustomer.getId());
            double waitTime = movCustomer.timeSpend() / 1000000000;
            long timeEnd = System.nanoTime();
            movCustomer.setTimeEnd(timeEnd);
            LocalDateTime displayEnd = LocalDateTime.now();

            int serviceTime = (int) (Math.random() * 5 + 1);//second
            double responseTime = waitTime + serviceTime;
            System.out.printf("Customer %d done at %s:\nWait Time: %.5f s\nService Time: %d s\nResponse Time: %.5f s\n\n", movCustomer.getId(), displayEnd, waitTime, serviceTime, responseTime);
            try {
                Thread.sleep(serviceTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long timeStart = System.nanoTime()/1000000000;
            customer.setTimeStart(timeStart);
        }
        System.out.println("All customer served.");

    }

}

