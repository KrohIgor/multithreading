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
        while (counter.getValue() < BOUND) {
            counter.incrementValue();
            System.out.println("Value in Runnable is " + counter.getValue());
        }
        System.out.println("Runnable exiting");
    }
}
