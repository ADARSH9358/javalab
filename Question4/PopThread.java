public class PopThread extends Thread {
    Stack stkObj;
    Thread t;
    PopThread(Stack stkObj) {
        this.stkObj = stkObj;
         t=new Thread(this);
        t.start();
    }

    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println(stkObj.pop() + " popped.");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }
}
