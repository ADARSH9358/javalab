public interface Iface2 {

    default void dm1() {
        System.out.println("dm1 of Iface2");
    }

    void im1();

    void im2();
}
