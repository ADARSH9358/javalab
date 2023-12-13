package mycode.mouse;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class mous extends JFrame implements MouseListener {
        JFrame f;
        JLabel label;
        JTextArea ta;
    mous(){
         f = new JFrame("layout");
        f.setBounds(300, 200, 500, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        label=new JLabel("MY LABEL");
        label.setFont(new Font("aerial", Font.BOLD, 15));
        label.setBounds(50,100,100,30);
       f.add(label);
        ta=new JTextArea("HELLO JI");
        ta.setBounds(200,100,300,300);
        f.add(ta);

        label.addMouseListener(this);        
    }
    @Override
    public void mouseClicked(MouseEvent e) {
      ta.setText("mouse is entered");
    }
    @Override
    public void mousePressed(MouseEvent e) {
     ta.setText("mouse is entered");
    }
    @Override
    public void mouseReleased(MouseEvent e) {
           ta.setText("mouse is entered");
    }
    @Override
    public void mouseEntered(MouseEvent e) {
       ta.setText("mouse is entered");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        ta.setText("mouse is entered");
    }
    public static void main(String[] args) {
     new mous();
    }
}
