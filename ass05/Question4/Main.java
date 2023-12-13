public class Main {
    public static void divide(){
        int a = 3;
        int b = 0;
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        try {
            divide();
        } catch (ArithmeticException e) {
            // System.out.println("Within catch clause");
            System.out.println(e.getStackTrace());
        }
        System.out.println("Successful run");
    }
}

/*
 * If ve don't catch the exception this is printed:
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * at Main.divide(Main.java:5)
 * at Main.main(Main.java:9)
 */