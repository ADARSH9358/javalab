public class Parent {

    public void proc1() {
        System.out.println("From Parent proc1.");
    }

    static {
        System.out.println("static Parent");
    }

    {
        System.out.println("Non static Parent");
    }

    public static Parent getChildren(String type) {
        switch (type) {
            case "child":
                return new Child();
            case "child1":
                return new Child1();
            default:
                return null;
        }
    }

    public Parent(String arg) {
        System.out.println("From Parent Contructor with arg = " + arg);
    }
}