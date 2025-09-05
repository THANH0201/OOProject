package task7;

import java.util.List;

public class Test {

    public void runTest() {
        // Khởi tạo bộ sinh sự kiện đến
        long seed = 12345L; // hoặc System.currentTimeMillis() nếu muốn ngẫu nhiên
        ArrivalEventGenerator arrivalGen = new ArrivalEventGenerator(10, seed);
        List<Event> arrivals = arrivalGen.getSortedArrivals();
        System.out.println("Generated arrival events:"+ arrivals);

        // Khởi tạo hàng đợi phục vụ
        ServicePoint servicePoint = new ServicePoint();

        // Tạo khách hàng từ các sự kiện đến và đưa vào hàng đợi
        CustomerGenerator customerGen = new CustomerGenerator(arrivals, servicePoint);
        System.out.println("All customers added to the queue: " + servicePoint.getQueue());


        // Xử lý khách hàng trong hàng đợi và in thời gian ở lại hệ thống
        Clock clock = Clock.getInstance();
        // clock start from time of the last arrival event
        double lastArrivalTime = arrivals.get(arrivals.size() - 1).getEventTime();
        clock.setTime(lastArrivalTime);

        System.out.println("Customer service results:");
        servicePoint.serve(Clock.getInstance());

        // In thời gian cuối cùng của đồng hồ
        System.out.println("Final clock time: " + clock.getTime());
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.runTest();
    }
}