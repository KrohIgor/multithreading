import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger value;

    public Counter(AtomicInteger value) {
        this.value = value;
    }

    public AtomicInteger getValue() {
        return value;
    }

    public void setValue(AtomicInteger value) {
        this.value = value;
    }
}
