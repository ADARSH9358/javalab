public class one implements Runnable {
    Thread t;
    int start;
    int end;
    int sum=0;

    one(int start,int end){
        this.start=start;
        this.end=end;
        t=new Thread(this);
        t.start();
    }
    public void run(){
        for(int i=start;i<=end;i++){
                sum+=i;
        }
    }
    public void join()throws Exception{
        t.join();
    }
    public int get(){
        return sum;
    }
    
}
