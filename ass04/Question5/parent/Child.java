package parent;

public class Child extends Parent {

    public void proc1() {
        System.out.println("From Child proc1");
        /*
         * System.out.println(v1);
         * This will not work as v1 is private in Parent so is not accessible by
         * subclass
         */
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
    }

    public Child() {
        System.out.println("From Child Constructor");
    }
}