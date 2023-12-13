package mycode;

import java.awt.*;
import javax.swing.*;
public class Gridbag extends JFrame {

    Gridbag(){
    JFrame f = new JFrame("layout");
    f.setBounds(100, 200, 500, 300);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");

    GridBagConstraints g=new GridBagConstraints();
    f.setLayout(new GridBagLayout());
    
    g.fill=GridBagConstraints.HORIZONTAL;  // take complete space for which we apply extra space

      g.weightx=0.2;  // request for extra space in x axis
    g.gridx=0;
    g.gridy=0;
  
    f.add(b1,g);

     g.weightx=0.2;
     g.gridx=1;
    g.gridy=0;
    f.add(b2,g);

     g.weightx=0;

     g.gridx=2;
    g.gridy=0;
    f.add(b3,g);

     g.gridwidth=3;   // to combine col uptu 3 button
     //g.gridheight=5;  // to combine row upto 5
     g.gridx=0;
    g.gridy=1;
   // g.ipadx=12; // height increase in x-dir
    g.ipady=5; // height increase in y -dir
    f.add(b4,g);

    g.gridwidth=2;
    g.weighty=1;
    g.ipadx=1;
    g.ipady=1;
    g.gridx=1;
    g.gridy=2;
     g.anchor=GridBagConstraints.LINE_END; // alway come to last
    f.add(b5,g);
     pack();  
    }
    public static void main(String[] args) {
        new Gridbag();
    }
}
