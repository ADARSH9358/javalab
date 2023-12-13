package mycode.eventlistner;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Textfield extends JFrame implements ActionListener{
    JTextField t1;
    Textfield(){
        JFrame f = new JFrame("layout");
        f.setBounds(300, 200, 500, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("event listner");

        t1=new JTextField();
        t1.setBounds(100,100,100,30);
        f.setLayout(null);
        f.add(t1);

        t1.setFont(new Font("arial", Font.BOLD, 15));

        t1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str=t1.getText();
        t1.setText(str.toUpperCase());
    }
    public static void main(String[] args) {
        new Textfield(); 
    }
}
