package Exercises1_2;

public class VisualCounter {
    private int Counter = 0;
    private int nCounter = 0;
    final private int N;
    final private int max;

    public VisualCounter (int N, int max) {
        this.N = N;
        this.max = max;
    }

    public void increment() {
        if (nCounter < N && Counter < max)
            Counter += 1;
            nCounter += 1;
    }

    public void decrement() {
        if (nCounter < N)
            Counter -= 1;
            nCounter += 1;
    }

    @Override
    public String toString() {
        return "VisualCounter{" +
                "Counter=" + Counter +
                ", nCounter=" + nCounter +
                ", N=" + N +
                ", max=" + max +
                '}';
    }

    public static void main(String[] args) {
        VisualCounter counter = new VisualCounter(10,10);
        counter.increment();
        System.out.println(counter);
        counter.increment();
        System.out.println(counter);
        counter.decrement();
        System.out.println(counter);
    }
}
