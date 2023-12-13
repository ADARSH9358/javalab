import java.util.*;

public class queuelink {
    public static void main(String[] args) {
        // PriorityQueue<Integer> q=new PriorityQueue<Integer>();
         LinkedList q=new LinkedList<>();

         q.add(1);
         q.add(3);
         q.offer(5);
         q.add("A");
         q.add(55.12);


     
         System.out.println(q); //[1, 3]
         /* 
         System.out.println(q.element());
         System.out.println(q.peek());
         System.out.println(q.remove());
         System.out.println(q.poll());
         System.out.println(q.remove());
        */

        System.out.println(q.peek());

        //   System.out.println(q.element());


        // for each
        for (Object e : q) {
            System.out.println(e);
        }

        // iterator
        Iterator it=q.iterator();

        while (it.hasNext()) {   // return true if it has value else false
            System.out.println(it.next());
        }
        



    }
}

