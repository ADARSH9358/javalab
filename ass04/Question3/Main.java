public class Main {
    public static void main(String[] args) {
        Parent p = Parent.getChildren("child1");
        Child1 ch=(Child1)Parent.getChildren("child1");
        p.proc1(); // Parent's proc1 called

        Child1 c1 = (Child1) p;
        c1.proc1(); // Parent's proc1 called via Child1 object
        c1.proc1("Child1 proc1 definition");

    }
}
