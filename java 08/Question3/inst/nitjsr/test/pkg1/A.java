package inst.nitjsr.test.pkg1;

public class A {
    private int a;
    int b;
    protected int c;
    public int d;

    protected class B {
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

        public void m1() {
            System.out.println("From within inner class B");
        }
    }

    public void m2() {
        System.out.println("override");
    }

    public A() {
        a = 1;
        b = 2;
        c = 3;
        d = 4;
    }

}