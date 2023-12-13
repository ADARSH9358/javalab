import java.util.HashSet;

import java.util.*;

public class haset {

    public static void main(String[] args) {
        HashSet h = new HashSet<>(); // default capacity=16 and load factor=0.75
        HashSet h2 = new HashSet<>(100, (float) 0.95); // capacity=100 and load factor=0.95

        HashSet<Integer> h3 = new HashSet<Integer>(100, (float) 0.95); // capacity=100 and load factor=0.95
        h3.add(45);
        h3.add(5);
        h3.add(7);
        System.out.println(h3);
        // h3.remove(5);
        System.out.println("ATRE REMOVING DATA : " + h3);

        // contains or not
        System.out.println(h3.contains(45)); // return true
        System.out.println(h3.isEmpty());

        // to read object/elements
        for (var e : h3)
        {
        if(e.equals(5)){
            System.out.println("YES");
        }
            System.out.println(e);
    }

        Iterator it = h3.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        //add all
        h3.addAll(h3);  //inside it using another collection


        // removeALL
        h3.removeAll(h3);


        //intersection or commom elements
        h3.retainAll(h3);

        //differenecr
        h3.removeAll(h3);


        //contain all
        //subset
        System.out.println(h3.containsAll(h3));


    }
}


class linkhas{
    public static void main(String[] args) {
        LinkedHashSet <Integer> set=new LinkedHashSet<Integer>();
        
        LinkedHashSet  set1=new LinkedHashSet();
        set1.add(100);        set1.add(90);
        set1.add(50);
        set1.add(99);
        set1.add(45);
        set1.add(30);
        System.out.println(set1);   // print in same order


    }
}

/*
 * part2--linkhastset
 * can not have duplicate 
 * insertion order preserve
 * it have hasttable + linklist
 * both has same function (linkhaset and hashmap)
 */