package parent;

public class Class1 {
    void proc1() {
        Parent p = new Parent();
        /*
         * System.out.println(p.v1);
         * This will not work as v1 is private in Parent so is not accessible by
         * subclass
         */

        System.out.println(p.v2);
        System.out.println(p.v3);
        /*
         * Even though v3 is protected it is accessible through object as Class1 is in
         * the same package as parent
         */
        System.out.println(p.v4);
    }
}
