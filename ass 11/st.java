public class st<T> {
    int size;
    int top;
    Object []arr;
    public st(int size){
        this.size=size;
        top=-1;
        arr =new Object[this.size];
    }
    void push(T val){
        if(top==size){
            System.out.println("canot push");
        }
        else{
            
            arr[++top]=val;
        }
    }
    T pop(){
            if(top==0){
                System.out.println("canot pop");
            }
            else{
                 return (T)arr[top--];// as it is a object
            }
            return null;
    }
    void display(){
        int a=top;
        while(a>=0){
            System.out.println(arr[a]);
            a--;
        }
    }
    public static void main(String[] args) {
        st <Integer> st= new st(10);
        st.push(5);
         st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(7);
       // System.out.println("the pop element is"+st.pop());
       st.display();


    }
}
