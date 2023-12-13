package mycode;

// import javax.swing.JButton;
import javax.swing.*;

public class toggle extends JFrame {
    JButton b;
    JFrame f;
    toggle(){
        f=new JFrame("JTOGGLE BUTTON");
        f.setBounds(100,100,500,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        b=new JButton("hoe are you");
        f.add(b);
    }
    public static void main(String[] args) {
        new toggle();
    }
}
