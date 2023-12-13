public class Concrete2 implements Iface1, Iface2 {
    public void im1() {
        System.out.println("Implemented im1 in Concrete2 class");
    }

    public void im2() {
        System.out.println("Implemented im2 in Concrete2 class");
    }

    public void dm1() {
        System.out.println("Overriden in Concrete2 class");
    }
}

/*
 * This class does not give any error as dm1() has been overriden here.
 */
