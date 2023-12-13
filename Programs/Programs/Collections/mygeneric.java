// public class mygeneric <T>{

//     T data[]=(T[]) new Object[3];
// public static void main(String[] args) {
//     mygeneric<String> gd=new mygeneric<>();
//     gd.data[0]="hi";
//     gd.data[1]="abc";
//     gd.data[2]=5;  //cannot store

// }
    
// }


// class data<T>
// {
//     T obj;
//     public void set(T v){
//         obj=v;
//     }
//     public T get(){
//         return obj;
//     }
//     public static void main(String[] args) {
//         data<Integer> d=new data();
//         d.set(5);
//         System.out.println(d.get());
//     }
// }



// class data<T>
// {
//     T obj[]=(T[])new Object[10];
//     int i=0;
//     public void set(T x){
//         obj[i++]=x;
//     }
//     public T get(){
//         return (T)obj;
//     }
//     public static void main(String[] args) {
//         data<Integer> d=new data();
//         d.set(5);
//         System.out.println(d.get());
//     }
// }



// MULTIPLE PARAMETER

// class data<T,K>
// {
//     T obj[]=(T[])new Object[10];
//     int i=0;
//     public void set(T x){
//         obj[i++]=x;
//     }
//     public T get(){
//         return (T)obj;
//     }
//     public static void main(String[] args) {
//         data<Integer,String> d=new data();
//         d.set(5);
//         System.out.println(d.get());
//     }
// }


// EXTENDS 
// class data<T>
// {
//     T obj[]=(T[])new Object[10];
//     int i=0;
//     public void set(T x){
//         obj[i++]=x;
//     }
//     public T get(){
//         return (T)obj;
//     }
   
   
// }
//  class myarr2 extends data<String>{

// }   
// class p{
//     public static void main(String[] args) {
//         myarr2<String> d=new myarr2();
//         d.set("5");
//         System.out.println(d.get());
//     }
// }


// Bounded types
class data<T extends Number>
{
    T obj[]=(T[])new Object[10];
    int i=0;
    public void set(T x){
        obj[i++]=x;
    }
public static void main(String[] args) {
    data<Integer> dt=new data(); //not allow strings
}   
}


/*
 * NUmber has byte,short,integer,long,float,double
 */

// class generic{
//      <T>void show(T... list){
//             for(T x : list){
//                 System.out.println(x);
//             }
//     }
//     public static void main(String[] args) {
//         generic g=new generic();
//         String [] str={"sxv","djh"};
//         g.show(str);

//         g.show(new String []{"dj","ednj"});
//         g.show(new Integer [] {5,6,2,3,});
//                 g.show(5,6,2,3);

//     }
// }




// ! WILDCARD
 class generic{
     <T>void show(T... list){
            for(T x : list){
                System.out.println(x);
            }
    }
    public static void main(String[] args) {
        generic g=new generic();
        String [] str={"sxv","djh"};
        g.show(str);

        g.show(new String []{"dj","ednj"});
        g.show(new Integer [] {5,6,2,3,});
                g.show(5,6,2,3);

    }
}

