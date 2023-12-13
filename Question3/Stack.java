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
        if (top >= size - 1)
            throw new StackException("Stack Overflow!");
        stk[++top] = n;
    }

    synchronized public int pop() {
        if (top < 0)
            throw new StackException("Stack Underflow");
        return stk[top--];
    }
}

/*
 * Using synchronize does not solve the problem as it does not ensure in which
 * order push and pop will be called. It only ensures that one method will not
 * be called while the other is in execution.
 */
