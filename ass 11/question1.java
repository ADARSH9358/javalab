/*
    1. Create a generic class Calculator<T> to perform arithme8c of two same data type, i.e., 
    Calculator<Integer> should perform arithme8c of two integers, Calculator<Double>
    should perform the same for doubles. Perform +, -, * an / for all. Throw an excep8on 
    in modulus if the passed data type is not an integer, otherwise for Calculator<Integer>
    it must return the modulus.
 */

 import java.util.Scanner;
 public class question1<T extends Number>{
    T a;
    T b;
    public question1(T a,T b){
        this.a=a;
        this.b=b;
    }
        public T add(char c){
            switch (c) {
                case '+':    if(a instanceof Integer){
                              return (T) (Number)  ((Integer)a + (Integer)b);
                             }
                            else if(a instanceof Double){
                                return (T) Double.valueOf(a.intValue()+b.intValue());
                             }
                             return null;
                case '-':    if(a instanceof Integer){
                              return (T) Integer.valueOf(a.intValue()-b.intValue());
                              }
                              else if(a instanceof Double){
                                  return (T) Double.valueOf(a.intValue()-b.intValue());
                              }
                             return null;
                case '*' : if(a instanceof Integer){
                              return (T) Integer.valueOf(a.intValue()*b.intValue());
                              }
                              else if(a instanceof Double){
                                  return (T) Double.valueOf(a.intValue()*b.intValue());
                              }
                             return null;
                case '/' : if(a instanceof Integer){
                              return (T) Integer.valueOf(a.intValue()/b.intValue());
                              }
                              else if(a instanceof Double){
                                  return (T) Double.valueOf(a.intValue()/b.intValue());
                              }
                             return null;
                 case '%' : if(a instanceof Integer){
                              return (T) Integer.valueOf(a.intValue()%b.intValue());
                              }
                              else if(a instanceof Double){
                                  return (T) Double.valueOf(a.intValue()%b.intValue());
                              }
                             return null;

                 default : return null;
            }
      
    }
    
    public static void main(String[] args) {
     question1<Integer> cal = new question1<>(15, 25) ;
     System.out.println("the output "+ cal.add('+'));   
    }
 }


 /*
  *   return (T) (Number)  ((Integer)(Number)a + (Integer)(Number)b); OR
  *   return (T) (Number)  ((Integer)a + (Integer)b);

  *   here a is a T so we canot do any operation 
  *   convert a into integer then their addition convert into number and then to T.
  *   
  */