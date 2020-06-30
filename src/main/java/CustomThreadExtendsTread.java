import java.util.concurrent.atomic.AtomicInteger;

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
        while (counter.getValue().get() < BOUND) {
            AtomicInteger value = counter.getValue();
            value.incrementAndGet();
            counter.setValue(value);
            System.out.println("Value in Tread is " + value);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Tread was interrupted");
            }
        }
        System.out.println("Tread exiting");
    }
}
