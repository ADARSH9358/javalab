public class Main {
    public static void main(String[] args) {
        // A objA = new A();
         A.B objA = new A().new B();
         A objA2 = new A();
        objA2
        
        
    }
}

/*
 * B can access all members of A directly as well via Object of A.
 * A can access all members of B via Object of B but not Directly.
 */