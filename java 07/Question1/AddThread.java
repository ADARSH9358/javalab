
public class AddThread implements Runnable {
    private Thread t;
    private int start;
    private int end;
    private int sum;

    public AddThread(int start, int end) {
        this.start = start;
        this.end = end;
        sum = 0;
        t = new Thread(this);
        t.start();
    }

    public void join() throws InterruptedException {
        t.join();
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }

    public int getSum() {
        return sum;
    }
}