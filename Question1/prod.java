public class prod implements Runnable {
    Thread t;
    push p;
    prod(push p){
        t=new Thread(this);
        this.p=p;
    }
    public void run(){
        for(int i=1;i<10;i++){
            p.produce(i);
        }
    }
    
}
