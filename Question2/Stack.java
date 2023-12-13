public class Stack {
    int size;
    int stk[];
    int top;

    public Stack(int size) {
        this.size = size;
        stk = new int[size];
        top = -1;
    }

    public void push(int n) {
        if (top >= size - 1)
            throw new StackException("Stack Overflow!");
        stk[++top] = n;
    }

    public int pop() {
        if (top < 0)
            throw new StackException("Stack Underflow");
        return stk[top--];
    }
}
