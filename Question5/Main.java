
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Stack stk = new Stack(15);
        Thread push = new Thread() {
            public void run() {
                for (int i = 0; i < 15; i++) {
                    stk.push(i + 1);
                    System.out.println((i + 1) + " pushed.");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }

            }
        };
        Thread pop = new Thread() {

            public void run() {
                for (int i = 0; i < 15; i++) {
                    System.out.println(stk.pop() + " popped.");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }

            }
        };
        push.start();
        pop.start();
    }

}