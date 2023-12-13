public class Main {
    public static void main(String[] args) throws InterruptedException {
    /*    Thread t = Thread.currentThread();

        Thread t1 = new MyThread();
        t1.start();

        MyThread1 t2 = new MyThread1(t1);
       
        for(int i=1; i <= 10; i++) {
            System.out.println("From " + Thread.currentThread().getName() + " : " + i);
            Thread.sleep(500);
        }

        if(t1.isAlive()) {
            System.out.println(t1.getName() + " is still alive");
        }

        if(t2.isAlive()) {
            System.out.println("Second thread is still alive");
        }

        t1.join();
        t2.join();
        System.out.println("Main thread terminated");

        if(!t1.isAlive()) {
            System.out.println(t1.getName() + " is not alive");
        }

        if(!t2.isAlive()) {
            System.out.println("Second thread is not alive");
        } */

        Demo demo = new Demo();
        MyThread t1 = new MyThread(demo, "Java", true);
        MyThread t2 = new MyThread(demo, "C++", false);
        MyThread t3 = new MyThread(demo, "Python", true);

        t1.start();
        t2.start();
        t3.start();
    }
    
}
