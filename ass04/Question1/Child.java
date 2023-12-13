public class Child extends Parent {

    /*
     * Default will not work here as the method being overrided in public in the
     * parent.
     * 
     * We can only provide the same or a less restrictive access specifier when
     * overriding.
     * 
     * We have to make this one public to for the code to work.
     */
    public void proc1() {
        System.out.println("From Child proc1");
    }

    public Child() {
        System.out.println("From Child Constructor");
    }
}