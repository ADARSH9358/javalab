abstract class A{
    abstract void display();
} 


class outer{
    public void ans(){
        A a=new A(){
            public void display(){
                System.out.println("yes i am");
            }
        }; 
        a.display();
    }
}

public class anomynous {
    public static void main(String[] args) {
        outer o=new outer();
        o.ans();
    }
}



/*
also do like this for
 *  public void ans(){
        new A(){
            public void display(){
                System.out.println("yes i am");
            }
        }.display(); 
        
 */


 /*
  * also do same things with interface
  */


  abstract interface B{
    abstract void display();
} 


class outer1{
    public void ans(){
        B a=new B(){
            public void display(){
                System.out.println("yes i am");
            }
        }; 
        a.display();
    }
}


/*
 * stactic inner class can only use static methods ,variable only
 */