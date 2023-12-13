import parent.Child;
import pkg.Child1;

public class Main {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child c = new Child();

        c1.proc1();
        c.proc1();
    }
}
