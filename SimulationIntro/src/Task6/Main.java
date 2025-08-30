package Task6;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        ServicePoint servicePoint = new ServicePoint();
        new CustomerGenerator(5, servicePoint);
        LocalDateTime displayStart = LocalDateTime.now();
        System.out.printf("All Customer have been added to the queue at %s\n\n", displayStart.format(format));
        servicePoint.serve();
    }
}
