import java.util.*;
public class Array{
    public static void main(String[] args) {
        ArrayList arr=new ArrayList();
        arr.add(100);
        arr.add(100.5);
        arr.add(true);
        arr.add(false);
        arr.add("adarsh");
        arr.add(100);
        System.out.println(arr);   //  [100, 100.5, true, false, adarsh, 100]
        arr.size();  //print size of array
        arr.remove(3); // 3 is an index
        arr.remove("adarsh"); // it has an object
        System.out.println(arr);

        // ! to add in middile

        arr.add(2,"welcome"); // add at position 2

        // reterive a specific value
    //    Boolean ans= arr.get(2);  // cannot write in this form at complier donot know the return type as it is hetro array
                 arr.get(2);
        System.out.println(arr.get(3));

        arr.set(2,"know"); //change or replace
        System.out.println(arr.isEmpty());  // false if not empty else return true






        // for loop
        for(int i=0;i<arr.size();i++){
            //System.out.println(arr[i]); //not run
            System.out.println(arr.get(i));
        }

        // for each
        for (Object e : arr) {
            System.out.println(e);
        }

        // iterator
        Iterator it=arr.iterator();

        while (it.hasNext()) {   // return true if it has value else false
            System.out.println(it.next());
        }
        

    }
}