public class Child extends Parent {

    public void proc1() {
        System.out.println("From Child proc1");
    }

    static {
        System.out.println("static Child");
    }

    {
        System.out.println("Non static Child");
    }

    public Child() {
        /*
         * Upon replacing the no parameterised constructor of the parent with
         * parameterised one we will receive the following runtime error if we do not
         * make any
         * changes to the Child class:
         * 
         * Exception in thread "main" java.lang.NoSuchMethodError:
         * Parent: method 'void <init>()' not found
         * at Child.<init>(Child.java:16)
         * at Main.main(Main.java:3)
         * 
         * We need to make an explicut super call to the parameterised constuctor here
         * in the child class or add anon-parameterised contructor as well to resolve
         * this
         */
        super("calling parameterised contructor");
        System.out.println("From Child Constructor");
    }
}