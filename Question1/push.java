public class push {
    int n;
    boolean b=false;
    synchronized void produce(int i){
        if(b==true){
            try{
            wait();
            }
            catch(Exception e){

            }
        }
        b=true;
        n=i;
        System.out.println("produced");
        notifyAll();

    }
    synchronized int  consume(){
        if(b==false){
            try{
            wait();
            }
            catch(Exception e){

            }
        }
        b=false;
        System.out.println("consume = "+n);
        notifyAll();
        return n;

    }
}
