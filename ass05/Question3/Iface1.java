public interface Iface1 {
    private void pvt() {
        System.out.println("private interface method");
    }

    default void dm1() {
        System.out.println("Calls private method");
        this.pvt();
    }

    void im1();

    public static Iface1 getIface1(String type) {
        switch (type) {
            case "concrete":
                return new Concrete();
            case "concrete2":
                return new Concrete2();
            default:
                return null;
        }
    }
}