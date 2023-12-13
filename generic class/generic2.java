class Test<T>{
    T A[]=(T[]) new Object[10];
    Object B[]= new Object[10];
    int l=0;

    public void append(int value) {
        A[l++]=(T)(Number)(int)value;
      

    }
    public void display(){
        for(int i=0;i<l;i++){
              System.out.println(A[i]);

        }
    }
}


class other{
        void show(Test obj){
            obj.display();
        }

        // void hide(Test<T> obj){
        //     obj.display();   // show error can not used generic inside arugement
        // }
        // !WILDCARD!
         void fun(Test <?> o){    
            o.display();

        }
        //   void fun(Test <? extends Number> o){     //! show error message
        //     o.display();

        // }

        /*
         * we can use extends,super 
         * 
         */

        
}




public class generic2 {
    public static void main(String[] args) {
        other o=new other();
        o.show(new Integer[]{1,2,3,4,5});
    }
}
