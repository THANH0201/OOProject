package Task6;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
        ArrayList<Integer> serviceTimes = new ArrayList<>();
        while (!queueP1.isEmpty()) {
            Customer movCustomer = removeFromQueueue();
            movCustomer.setTimeStartServed(System.nanoTime());
            System.out.printf("Customer %d is on serving at\n", movCustomer.getId());
            double waitTime = (movCustomer.getTimeStartServed()-movCustomer.getTimeStart())/1000000000.0;

            int serviceTime = (int) (Math.random() * 3 + 1);//second
            serviceTimes.add(serviceTime);
            try {
                Thread.sleep(serviceTime* 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            movCustomer.setTimeEnd(System.nanoTime());
            LocalDateTime displayEnd = LocalDateTime.now();
            double responseTime = waitTime + serviceTime;
            System.out.printf("Customer %d done at %s:\nWait Time: %.5f s\nService Time: %d s\nResponse Time: %.5f s\n\n", movCustomer.getId(), displayEnd, waitTime, serviceTime, responseTime);
        }
        System.out.println("All customer served.");
        int sum = 0;
        for (int i = 0; i < serviceTimes.size();i++){
            sum += serviceTimes.get(i);
        }
        System.out.println("Average service time: " + (double)sum/serviceTimes.size() + "seconds");
    }
}
