public class Concrete implements Iface1, Iface2 {

    public void im1() {
        System.out.println("Implemented im1 in Concrete class");
    }

    public void im2() {
        System.out.println("Implemented im2 in Concrete");
    }
}

/*
 * This class fails to compile. This class implements both Iface1 and Iface2.
 * Both of these interfaces have a default method dm1(). This creates abiguity
 * for this concrete class as Java fails to decide which implentation to use.
 * Thus the error. To resolve this we need to override dm1().
 */