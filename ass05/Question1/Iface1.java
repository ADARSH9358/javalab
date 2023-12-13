public interface Iface1 {
    private void pvt() {
        System.out.println("private interface method");
    }

    default void dm1() {
        System.out.println("Calls private method");
        this.pvt();
    }

    void im1();
}