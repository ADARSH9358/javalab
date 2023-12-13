public class Main {

    public static void main(String[] args) {
        MyThread myThread = new MyThread("Thread1");
        // Thread currThread = Thread.currentThread();
        myThread.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println(myThread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

}