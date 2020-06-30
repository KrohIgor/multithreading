import java.util.concurrent.atomic.AtomicInteger;

public class ThreadMain {
    public static void main(String[] args) {
        Counter counter = new Counter(new AtomicInteger(0));
        CustomThreadExtendsTread threadExtendsTread = new CustomThreadExtendsTread(counter);
        Runnable runnable = new CustomThreadImplementsRunnable(counter);
        Thread threadImplementsRunnable = new Thread(runnable);
        threadExtendsTread.start();
        threadImplementsRunnable.start();
    }
}
