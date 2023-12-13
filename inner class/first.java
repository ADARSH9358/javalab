class outer{
    int a;
    //  also do like those in
    //    inner obj=new inner();
    class inner{
        int x;
        void display(){
            System.out.println("outer obj : "+a);  //outer
             System.out.println("inner obj : "+x);  //inner

        }
    }
    void outer_disaplay(){
        System.out.println("outer obj : "+a);    //outer
        // System.out.println("inner obj : "+x);  // ? show error message 1
        inner obj = new inner();
        obj.display();
        obj.x=15;
        // obj.a=45;                              //? show error message 2
    }
}






public class first {
    public static void main(String[] args) {
        outer o=new outer();
        o.outer_disaplay();

        outer.inner i=new outer().new inner();
        i.display();
        i.x=15;
        // i.a=45;                              //? show error message 2
        // as i is the object of inner class only

    }
}

/*
 * ineer class are four types of
  ? nested inner class
 */


 /*
  * errors
  * 1. outer class cannot access inner class methods,variable as it is inside their scope
  * 2. inner class object cannot access outer class

  */


  /*
   * 4 class will be creates 
   * 1.first.class
   * 2. outer class
   * 3.outer$inner class  --represent inner class
   */