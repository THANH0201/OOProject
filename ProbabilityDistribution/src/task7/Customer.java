package task7;

public class Customer {
    private int id;
    private double timeStart;//64 bits
    private double timeEnd;
    private double timeStartServed;
    private double timeEndServed;



    public Customer(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public double getTimeStart() {
        return timeStart;
    }
    public void setTimeStart(double timeStart) {
        this.timeStart = timeStart;
    }
    public double getTimeEndServed() {
        return timeEndServed;
    }
    public double getTimeStartServed() {
        return timeStartServed;
    }
    public void setTimeStartServed(double timeStartServed) {
        this.timeStartServed = timeStartServed;
    }

    public double getTimeEnd() {
        return timeEnd;
    }
    public void setTimeEnd(double timeEnd) {
        this.timeEnd = timeEnd;
    }
    public double timeSpend() {
        return (timeEnd - timeStart);
    }
    @Override
    public String toString() {
        return String.format("Customer{id=%d, arrivalTime=%.3f}", id, timeStart);
    }

    /*public static void main(String[] args) {
        Customer customer = new Customer(1);
        //customer entering
        customer.setTimeStart(System.currentTimeMillis());
        //waiting for one second
        try {
            Thread.sleep(1000);  // 1000 ms = 1s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //customer ready
        customer.setTimeEnd(System.currentTimeMillis());

        System.out.println("Task4.Customer " + customer.id+ " service time: " + customer.timeSpend()+"s");

    }
    */
}