import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferSum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 2 space separated numbers ");
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        System.out.println(a + "+" + b + " = " + (a + b));
    }

}
