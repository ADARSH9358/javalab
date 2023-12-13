package pkg2;

import pkg1.A;
import pkg1.A.B;

public class Main {
    public static void main(String[] args) {
        A.B objB = new A.B();
        // System.out.println("B.a1: " + objB.a1);
        // System.out.println("B.b1: " + objB.b1);
        // System.out.println("B.c1: " + objB.c1);
        System.out.println("B.d1: " + objB.d1);
        // A.B objb=new A().new B();
        // A.B obj2=new A.B();
    }
}
/*
 * Private values cannot be accessed through objects when classes are in the
 * same package
 * 
 * only public members can be accessed when classes are in different packages.
 * 
 * When B is made static, object of B created as follows:
 * A.B objB = new A.B();
 * else A.B objB=new A().new B();
 */
