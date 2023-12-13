package mycode;
import java.awt.*;    
import javax.swing.*;
public class layout extends JFrame{

    layout(){
        // JFrame f=new JFrame("layout");
        setBounds(300,200,500,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1 = new JButton("1");    
        JButton b2 = new JButton("2");    
        JButton b3 = new JButton("3");    
        JButton b4 = new JButton("4");    
        JButton b5 = new JButton("5");  
        JButton b6 = new JButton("6");    

        add(b1, BorderLayout.NORTH); // b1 will be placed in the North Direction    
        add(b2, BorderLayout.SOUTH);  // b2 will be placed in the South Direction    
        add(b3, BorderLayout.EAST);  // b2 will be placed in the East Direction    
        add(b4, BorderLayout.WEST);  // b2 will be placed in the West Direction    
        add(b5, BorderLayout.CENTER);  // b2 will be placed in the Center  


        // f.add(b1,BorderLayout.PAGE_START);
        //  f.add(b2,BorderLayout.PAGE_END);
        // f.add(b3,BorderLayout.LINE_START);
        // f.add(b4,BorderLayout.CENTER);
        // f.add(b5,BorderLayout.LINE_END);

        
        add(b6);  //come in centre no value given
    }
    public static void main(String[] args) {
        new layout();
    }
    
}
