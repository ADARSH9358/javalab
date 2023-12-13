package pkg1;

public class A {
    private int a;
    int b;
    protected int c;
    public int d;

    public static class B {
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
            System.out.println("a1: " + a1);
            System.out.println("b1: " + b1);
            System.out.println("c1: " + c1);
            System.out.println("d1: " + d1);
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
    }

}