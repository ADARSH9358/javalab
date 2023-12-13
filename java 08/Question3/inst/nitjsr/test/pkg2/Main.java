package inst.nitjsr.test.pkg2;

import inst.nitjsr.test.pkg1.A;

public class Main {
    public static void main(String[] args) {
        A objA = new A() {
            public void m2() {
                B objB = new B();
                objB.m1();
            }
        };

        /*
         * objA.m2() cannot be called as its signature is not present in A which can be
         * overrriden by the anonymous class. To resolve this we need to have a
         * declaration for m2 in A to be overridden here.
         */

        objA.m2();

    }
}
