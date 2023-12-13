package mycode;

import java.awt.FlowLayout;

import javax.swing.*;

public class flow {
    JButton jb,jb1,jb2,jb3,jb4;
    JFrame f;
    flow(){
        f=new JFrame();
        jb=new JButton("button1");
        jb1=new JButton("button1");
        jb2=new JButton("button1");
        jb3=new JButton("button1");
        jb4=new JButton("button1");
        f.add(jb);        f.add(jb1);
        f.add(jb2);
        f.add(jb3);
        f.add(jb4);
        f.setBounds(300, 200, 500, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // FlowLayout fl=new FlowLayout();
        f.setLayout(new FlowLayout());
     

      

    }
    public static void main(String[] args) {
        new flow();
    }
}
