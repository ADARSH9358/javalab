
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


public class gener1 {
    public static void main(String[] args) {
        Test<Integer> t=new Test();
        t.append(5);
                t.append(5);
        t.append(6);
        t.append(6);
        t.append(7);
        t.display();

        other ta=new other();
        ta.show(5);
        other.dis(1,2,3,4,5 );
       // ta.showbound("abc","fgh");  //show error message

    }
}

class other{
    <T> void show(T t) {
        System.out.println(t);
    }
    static <T> void dis(T... arr) {
        for (T t : arr) {
            System.out.println(t);
            
        }
    }
       <T extends Number> void showbound(T t) {
        System.out.println(t);
    }
}


/*
 * if our class is not generic then we need to define <T> before we return type
 */
