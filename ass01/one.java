// package ass01;

public class one{
    public static void main(String[] args) {
        // int l=args.length;
        // for(int i=0;i<l;i++){
        //     System.out.println(args[i]);
        // }
        String str=args[0];
        int l=args.length;
        int i=0;
        int j=l-1;
        Boolean f=false;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else {
                f=true;
                break;
            }
        }
        if(f==true){
            System.out.println("wrong");
        }
        else System.out.println("right");
    }
}

/*
 *  javac .\one.java
 * java one 55 12 45 78
 */