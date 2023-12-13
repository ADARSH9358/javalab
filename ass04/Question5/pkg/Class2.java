package pkg;

import parent.Parent;

public class Class2 {
    void proc1() {
        Parent p = new Parent();
        /*
         * System.out.println(p.v1);
         * This will not work as v1 is private in Parent so is not accessible by
         * subclass
         * 
         * System.out.println(p.v2);
         * This will not work here as Child1 is in a different package and v2 is
         * default in Parent. So cannot be accessed.
         * 
         * System.out.println(p.v3);
         * This will as v3 is protected in Parent. So cannot be accessed via object.
         */

        System.out.println(p.v4);
    }
}
