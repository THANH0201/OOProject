package Task4;

public class Customer {
    private int id;
    private long timeStart;//64 bits
    private long timeEnd;

    public Customer(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public long getTimeStart() {
        return timeStart;
    }
    public void setTimeStart(long timeStart) {
        this.timeStart = timeStart;
    }
    public long getTimeEnd() {
        return timeEnd;
    }
    public void setTimeEnd(long timeEnd) {
        this.timeEnd = timeEnd;
    }
    public double timeSpend() {
        return (timeEnd - timeStart)/1000.0;
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