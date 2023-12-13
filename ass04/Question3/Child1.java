public class Child1 extends Parent {
    public void proc1(String arg) {
        /*
         * Now that we have changed the signature of proc1 here, this becomes a case of
         * overloading rather than overriding. Child1 now has two variations for proc1 -
         * One from the parent with no parameters and one of its own with a string as
         * argument.
         * 
         * Both of these can be called with a Child object referenced by a Child
         * variable.
         * 
         * But we will not be able to invoke this proc1 if we use a Child object
         * referenced by a Parent variable. Because here we can only call methods
         * present in Parent class. These might be overriden by the Child class in which
         * case the Child's definition will be invoked.
         * 
         * Doing so will not give any error. It is just that Parent's proc1 will be
         * called here rather than the Child's.
         * 
         * We can resolve this by explictly typecasting parent reference to Child1 and
         * storing it in a Child1 variable. Now Child1 object is refered by a Child1
         * variable so all its methods can be acessed.
         */
        System.out.println("From Child1 proc1 with arg = " + arg);
    }

    static {
        System.out.println("static Child1");
    }

    {
        System.out.println("Non static Child1");
    }

    public Child1() {
        super("calling from Child1");
        System.out.println("From Child1 Constructor");
    }
}
