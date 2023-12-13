public class Main {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.proc1();
        c1.proc1("Child1 proc1 definition");
        /*
         * Yes, the initializers of parent class will still be invoked even if it is an
         * abstract class.
         */
    }
}
