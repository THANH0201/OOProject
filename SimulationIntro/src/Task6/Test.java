package Task6;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        ServicePoint servicePoint = new ServicePoint();
        for (int i = 0; i < 5; i++) {
            System.out.println("TEST " + (i+1));
            new CustomerGenerator((int) Math.random()*5+1, servicePoint);
            LocalDateTime displayStart = LocalDateTime.now();
            System.out.printf("All Customer have been added to the queue at %s\n\n", displayStart.format(format));
            servicePoint.serve();
        }
    }
}
