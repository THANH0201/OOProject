package Task4;
import java.util.LinkedList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class QueueDequeue {
    public static void main(String[] args) {
        LinkedList<Customer> listQueue = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        while(true) {
            try {
                System.out.println("Take action");
                System.out.println("1. Queue");
                System.out.println("2. Dequeue");
                System.out.println("3. Exit");
                int choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Enter Customer ID: ");
                        int id = Integer.parseInt(input.nextLine());
                        Customer customer = new Customer(id);
                        listQueue.addFirst(customer);
                        long timeStart = System.nanoTime();
                        customer.setTimeStart(timeStart);
                        LocalDateTime displayStart = LocalDateTime.now();
                        System.out.printf("Customer ID: %d has been added to the queue at %s\n", id, displayStart.format(format));
                        break;
                    case 2:
                        Customer movCustomer = listQueue.removeLast();
                        long timeEnd = System.nanoTime();
                        movCustomer.setTimeEnd(timeEnd);
                        LocalDateTime displayEnd = LocalDateTime.now();
                        double timeSpend = movCustomer.timeSpend();
                        System.out.printf("Customer ID: %s has been removed from the queue at %s\n",movCustomer.getId() ,displayEnd.format(format));
                        System.out.printf("Time in queue: %.2f nanoseconds(%.5f seconds)\n", timeSpend, timeSpend/1000000000);
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Error.");
                }
            }catch (Exception e) {
                System.out.println("Invalid input.");
            }
        }
    }
}
