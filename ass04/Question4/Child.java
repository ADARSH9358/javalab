public class Child extends Parent {

    public void proc1() {
        System.out.println("From Child proc1");
    }

    // static {
    //     System.out.println("static Child");
    // }

    // {
    //     System.out.println("Non static Child");
    // }

    public Child() {
        super("calling from Child1");
        System.out.println("From Child Constructor");
    }
}