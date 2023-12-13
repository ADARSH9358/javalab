import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class array2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);  
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(55);  
        arr1.add(55);
        arr1.add(55);
        arr1.add(55);
        arr1.add(55);
        arr1.add(55);
        arr1.add(55);

        arr1.addAll(arr);
        System.out.println(arr1);  //[55, 55, 55, 55, 55, 55, 55, 1, 2, 3, 4, 5, 6, 7]
        arr1.removeAll(arr);
        System.out.println(arr1);  //[55, 55, 55, 55, 55, 55, 55]

        Collections.sort(arr);
        System.out.println(arr);  //[1, 2, 3, 4, 5, 6, 7]
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);  //[7, 6, 5, 4, 3, 2, 1]


        // suffle the element
        Collections.shuffle(arr);
        System.out.println(arr);  //[3, 6, 7, 1, 4, 2, 5]




        // ! CONVERT ARR TO ARRAYLIST
        String arr2[]={"dog","cat","lion"};
        ArrayList al=new ArrayList(Arrays.asList(arr2));
        System.out.println(al);
        al.add("new");
        System.out.println(al);   //[dog, cat, lion, new]



    }
}
