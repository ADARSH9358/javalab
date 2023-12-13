public class one {
    public static void main(String[] args) {
       Object obj=new String("hii");
      // String str=obj;  // not possible as obj is parent class so type cast
     // String str=(String)obj; 
     //Object obj1=new Integer(10);
      //String st1=(String)obj1;  // *it will show error at run time as canot convert int to string


      Object obj3[]=new Object[3];
      obj3[0]="h1";
     obj3[1]=1;
      obj3[2]=55.32;
        String str;
        for(int i=0;i<3;i++){
            str=(String)obj[i];
            System.out.println(str);
        }



    }
}

/*
 * class object is a main class it inherit integer ,string and all other things
 * it is the mother of every class
 * we can achieve generlixation in it
 * problem -->
 * we can assign integer and other thing also
 * complier not check 
 */