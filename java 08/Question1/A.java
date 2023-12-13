
public class A {
    private int a;
    int b;
    protected int c;
    public int d;

    private class B {
        private int a1;
        int b1;
        protected int c1;
        public int d1;

        public B() {
            a1 = 11;
            b1 = 12;
            c1 = 13;
            d1 = 14;
        }

        public void printB() {
            // A objA = new A();
            printA();
            System.out.println("a1: " + a1);
            System.out.println("b1: " + b1);
            System.out.println("c1: " + c1);
            System.out.println("d1: " + d1);
            System.out.println(a);
        }
    }

    public void printA() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
    }

    public A() {
        a = 1;
        b = 2;
        c = 3;
        d = 4;

        B objB = new B();
        objB.printB();
        System.out.println("Directly");
        System.out.println("via objectB in A: a1: " + objB.a1);
        System.out.println("via objectB in A: b1: " + objB.b1);
        System.out.println("via objectB in A: c1: " + objB.c1);
        System.out.println("via objectB in A: d1: " + objB.d1);
        // System.out.println(a1);
    }

}