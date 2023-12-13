package mycode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class question extends JFrame implements ItemListener, ActionListener {
  JFrame f;
  JRadioButton btn1, btn2;
  JLabel jbl, j3, j4;
  JComboBox cb;
  JButton sub;

  question() {
    f = new JFrame("NEW LAYOUT");
    f.setSize(500, 500);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jbl = new JLabel("your perfered language");

    ButtonGroup group = new ButtonGroup();
    btn1 = new JRadioButton("Java");
    btn2 = new JRadioButton("C");
    group.add(btn1);
    group.add(btn2);
    btn1.addItemListener(this);
    btn2.addItemListener(this);

    JLabel j2 = new JLabel("your perfered OS");

    String country[] = { "Window", "OS", "MAC", "England", "Newzealand" };
    cb = new JComboBox(country);

    j3 = new JLabel("LANGUAGE : ");
    j4 = new JLabel("WINDOWS : ");

    sub = new JButton("SUBMIT");
    sub.addActionListener(this);
    cb.addItemListener(this);

    GridBagConstraints g = new GridBagConstraints();
    f.setLayout(new GridBagLayout());
    g.gridx = 0;
    g.gridy = 0;
    g.fill = GridBagConstraints.HORIZONTAL;
    g.insets = new Insets(40, 20, 40, 20);
    f.add(jbl, g);

    g.gridx = 1;
    g.gridy = 0;
    g.weightx = 2;
    // g.insets=new Insets(0, 20, 0, 20);
    f.add(btn1, g);

    g.gridx = 2;
    g.gridy = 0;
    // g.insets=new Insets(0, 20, 0, 20);
    f.add(btn2, g);

    g.gridx = 0;
    g.gridy = 1;
    // g.insets=new Insets(0, 20, 0, 20);
    f.add(j2, g);

    g.gridx = 1;
    g.gridy = 1;
    // g.insets=new Insets(0, 20, 0, 20);
    f.add(cb, g);

    g.gridx = 0;
    g.gridy = 2;
    // g.insets=new Insets(0, 20, 0, 20);
    f.add(j3, g);

    g.gridx = 1;
    g.gridy = 2;
    // g.insets=new Insets(0, 20, 0, 20);
    f.add(j4, g);

    g.gridx = 0;
    g.gridy = 3;
    g.gridwidth = 3;

    f.add(sub, g);
    f.pack();

  }

  @Override
  public void itemStateChanged(ItemEvent e) {
    if (e.getSource() == btn1) {
      j3.setText("Language java");
    }
    if (e.getSource() == btn2) {
      j3.setText("Language c++");
    }
    if (e.getSource() == cb) {
      j4.setText((String) cb.getSelectedItem());
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("NAME is" + j3.getText());
    System.out.println("country is" + j4.getText());

  }
  
  public static void main(String[] args) {
    new question();
  }

}
