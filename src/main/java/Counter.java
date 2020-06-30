public class Counter {
    private int value;

    public Counter(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void incrementValue() {
        value++;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Tread was interrupted");
        }
    }
}
