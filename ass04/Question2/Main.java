public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        p.proc1(); // Childs proc1 called

        /*
         * Order of Invocation:
         * 
         * static Parent
         * static Child
         * Non static Parent
         * From Parent Contructor with arg = calling parameterised contructor
         * Non static Child
         * From Child Constructor
         * From Child proc1
         * 
         */
    }
}
