public class PopThread extends Thread {
    Stack stkObj;

    PopThread(Stack stkObj) {
        this.stkObj = stkObj;
    }

    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println(stkObj.pop() + " popped.");
            try {
                Thread.sleep(100);

            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }
}
