public class main2 {
    public static void main(String[] args) {
        int sum=0;
       one th1=new one(1,8);
       one th2=new one(9,16);
       try{
        th1.join();
        th2.join();
       } 
       catch(Exception e){

       }
       sum+=th1.get();
        sum+=th2.get();
        System.out.println(sum);
    }
}
