public class Child1 extends Parent {
    /*
     * Upon making Parent and its proc1 abstract, we recieve an error here in Child1
     * as now me mandatorily need to override proc1.
     */
    public void proc1() {
        System.out.println("From Child1 overriden proc1");
    }

    public void proc1(String arg) {
        System.out.println("From Child1 proc1 with arg = " + arg);
    }

    // static {
    //     System.out.println("static Child1");
    // }

    // {
    //     System.out.println("Non static Child1");
    // }

    public Child1() {
        super("calling from Child1");
        System.out.println("From Child1 Constructor");
    }
}
