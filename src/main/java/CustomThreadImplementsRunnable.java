import java.util.concurrent.atomic.AtomicInteger;

public class CustomThreadImplementsRunnable implements Runnable {
    private static final int BOUND = 100;
    private Counter counter;

    public CustomThreadImplementsRunnable(Counter counter) {
        this.counter = counter;
        System.out.println("Creating Runnable");
    }

    @Override
    public void run() {
        System.out.println("Running Runnable");
        while (counter.getValue().get() < BOUND) {
            AtomicInteger value = counter.getValue();
            value.incrementAndGet();
            counter.setValue(value);
            System.out.println("Value in Runnable is " + value);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Runnable was interrupted");
            }
        }
        System.out.println("Runnable exiting");
    }
}
