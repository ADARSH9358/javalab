public class Main {
    public static void main(String[] args) {
        Iface1 i1 = Iface1.getIface1("concrete");
        Iface1 i2 = Iface1.getIface1("concrete2");

        i1.im1();
        i1.dm1();

        i2.im1();
        i2.dm1();
    }
}