
import java.util.HashMap;

public class two {
    public static void main(String[] args) {
        HashMap<Integer,String> m=new HashMap<Integer,String>();
         HashMap m1=new HashMap<>();
         m1.put(101, "abc");
         m1.put(101, "ab");
         m1.put(103, "abc");
         m1.put(104, "abc");
         m1.put(105, "abc");
         m1.put(106, "abc");
         m1.put(107, "abc");
         System.out.println(m1);
        System.out.println(m1.get(101));


        System.out.println(m1.containsKey(106)); // return true,false
        System.out.println(m1.containsValue("abc")); // return true,false
        System.out.println(m1.isEmpty());
        System.out.println();



        // for loop
        for(Object i :m1.keySet()){
            System.out.println(i  + " " + m1.get(i));
        }
        for(Object i :m1.values()){
            System.out.println(i+" " + i.(i));
        }
    }
}
