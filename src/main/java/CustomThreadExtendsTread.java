public class CustomThreadExtendsTread extends Thread {
    private static final int BOUND = 100;
    private Counter counter;

    public CustomThreadExtendsTread(Counter counter) {
        this.counter = counter;
        System.out.println("Creating Tread");
    }

    @Override
    public void run() {
        System.out.println("Running Tread");
        while (counter.getValue() < BOUND) {
            counter.incrementValue();
            System.out.println("Value in Tread is " + counter.getValue());
        }
        System.out.println("Tread exiting");
    }
}
