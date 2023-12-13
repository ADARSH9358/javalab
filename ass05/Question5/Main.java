public class Main {
    public static void divide() {
        int a = 3;
        int b = 0;
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        try {
            int arr[] = new int[3];
            arr[4] = 7;
            divide();
        } catch (ArithmeticException e) {
            System.out.println("Within catch clause");

        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("Array out of index occured");
        }
        System.out.println("Successful run");
    }
}

/*
 * catch is invoked by the very first exception that is thrown in the try block.
 * And the catch cluse invoked will depend upon the type of exeception that is
 * thrown.
 * 
 * That is why, when divide() is invoked before array access,
 * ArithmenticException is thrown. But, when we swap them in access array first,
 * ArrayIndexOutofBounds in thrown.
 * 
 * Also, if exception is thrown from within a catch clause, it is not caught by
 * a chained catch clause. For that we need to wrap this try-catch block with
 * another try catch block.
 */