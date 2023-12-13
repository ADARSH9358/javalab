public class Stack {
    int size;
    int stk[];
    int top;

    public Stack(int size) {
        this.size = size;
        stk = new int[size];
        top = -1;
    }

    synchronized public void push(int n) {
        if (top >= size - 1) {
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        stk[++top] = n;
        notify();
    }

    synchronized public int pop() {
        if (top < 0) {
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        int val = stk[top--];
        notify();
        return val;
    }
}

/*
 * Using synchronize does not solve the problem as it does not ensure in which
 * order push and pop will be called. It only ensures that one method will not
 * be called while the other is in execution.
 */
