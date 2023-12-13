package mycode.eventlistner;

import javax.swing.JFrame;
import javax.swing.*;

import java.awt.event.*;
public class menu extends JFrame implements ActionListener {
    JFrame f;
    JMenuBar menubar;
    JMenu file,edit;
    JMenuItem i1,i2,i3,i4,i5,i6;
    JTextArea ta;
    menu(){
    f = new JFrame("layout");
      
        menubar= new JMenuBar();
        file=new JMenu("File");
        edit=new JMenu("Edit");

        i1=new JMenuItem("NEW");
        i2=new JMenuItem("OPEN");
        i3=new JMenuItem("EDIT");
        i4=new JMenuItem("INSERT");
        i5=new JMenuItem("SAVE");
        i6=new JMenuItem("SELect all");


        // *add event listner

        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        i6.addActionListener(this);


        file.add(i1); file.add(i2); file.add(i3); edit.add(i4);edit.add(i5); edit.add(i6);

        menubar.add(file);        menubar.add(edit);

        f.setJMenuBar(menubar);


        ta=new JTextArea();
        ta.setBounds(10,10,10,10);
        f.add(ta);



    f.setBounds(300, 200, 500, 300);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setTitle("event listner");
  
    f.setLayout(null);
    // f.add(b);

    // b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    //  ta.setText("new file can we added"); //*if only one event listner need to add */
    // * now for multiple
    if(e.getSource()==i1){
        ta.setText("this is for new file ...");
    }
    if(e.getSource()==i2){
        ta.setText("this is for new file ...");
    }if(e.getSource()==i3){
        ta.paste();
    }if(e.getSource()==i4){
        ta.paste();
    }if(e.getSource()==i5){
        ta.copy();
    }
    if(e.getSource()==i6){
        ta.selectAll();
    }
    }
    public static void main(String[] args) {
        new menu();
    }
}
