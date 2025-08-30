package Task5;
import java.util.LinkedList;

public class CustomerGenerator {
    public CustomerGenerator(int quantity, ServicePoint servicePoint) {
        for (int i = 1; i <= quantity; i++) {
            Customer customer = new Customer(i);
            customer.setTimeStart(System.nanoTime());
            servicePoint.addToQueueue(new Customer(i));
        }
    }
}
