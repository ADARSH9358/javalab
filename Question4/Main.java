
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Stack stk = new Stack(15);
        PushThread t1 = new PushThread(stk);
        PopThread t2 = new PopThread(stk);
        // t1.start();
        // t2.start();
    }

}