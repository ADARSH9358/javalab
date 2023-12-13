package mycode.keylis;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class key extends JFrame implements KeyListener {
    JFrame f;
    JTextArea ta;

    public key(){
        f=new JFrame();
        ta=new JTextArea();
        f.setBounds(300, 200, 500, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ta.setBounds(10,10,100,100);
        f.add(ta);
        ta.addKeyListener(this);
    }
    public static void main(String[] args) {
        new key();
    }
    @Override
    public void keyTyped(KeyEvent e) {
    ta.setText(ta.getText()+'\n'+"key is keytyped : " + e.getKeyChar());

    }
    @Override
    public void keyPressed(KeyEvent e) {
             ta.setText(ta.getText()+'\n'+"key is key event : "  + e.getKeyChar());

    }
    @Override
    public void keyReleased(KeyEvent e) {
        ta.setText(ta.getText()+'\n'+"key is released : " + e.getKeyChar());
    }
}

/*
 * it listen key listner
 * void keyPressed()-->1
 * void keyTyped()-->2
 * void keyReleased()-->3
 * addKeyListener  

 */
