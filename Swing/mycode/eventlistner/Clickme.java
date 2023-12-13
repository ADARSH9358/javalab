package mycode.eventlistner;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/* 
public class Clickme extends JFrame implements ActionListener{
    JButton b;
    Clickme(){
        JFrame f = new JFrame("layout");
        f.setBounds(300, 200, 500, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("event listner");
        b=new JButton("click me");
        b.setBounds(100,100,100,30);
        f.setLayout(null);
        f.add(b);

        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str=b.getText();
        b.setText(str.toUpperCase());
    }
    public static void main(String[] args) {
        new Clickme(); 
    }
}

 */

public class Clickme extends JFrame implements ActionListener{
    JButton b;
    Clickme(){
        JFrame f = new JFrame("layout");
        f.setBounds(300, 200, 500, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setTitle("event listner");
        b =new JButton("I am adarsh kumar");
        b.setBounds(100,100,250,50);
        b.addActionListener(this);
        f.add(b);
    }
    public void actionPerformed(ActionEvent e){
        b.setText(b.getText().toUpperCase());
    }
    public static void main(String[] args) {
        new Clickme();
    }
}
