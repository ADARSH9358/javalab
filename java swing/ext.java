import javax.swing.*;

/*
public class ex{
    public static void main(String[] args) {
        JFrame jf=new JFrame("swing example");
        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

*/

public class ext extends JFrame{
    ext(String s){
        super(s);
    }
    public static void main(String[] args) {
        ext ex=new ext("adarsh");
          ex.setSize(300,300);
        ex.setVisible(true);
    }
}