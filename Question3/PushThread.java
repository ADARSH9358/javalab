public class PushThread extends Thread {

    Stack stkObj;

    PushThread(Stack stkObj) {
        this.stkObj = stkObj;
    }

    public void run() {
        for (int i = 0; i < 15; i++) {
            stkObj.push(i + 1);
            System.out.println((i + 1) + " pushed.");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }
}
