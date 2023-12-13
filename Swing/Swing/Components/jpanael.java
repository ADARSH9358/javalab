import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class jpanael extends JPanel {
     JFrame f;
    JTabbedPane jtp;
    jpanael(){
        f=new JFrame("panel");
        f.setSize(100,200);
        // f.setLayout(new LayoutManager());
        f.setLayout(new FlowLayout());
        lan l=new lan();
        jtp=new JTabbedPane();
        jtp.addTab("language", l);
        f.setVisible(true);
        f.add(jtp);
        

    }

    class lan extends JPanel implements ItemListener{
            JRadioButton b1,b2,b3;
            JLabel jl;
            lan(){
                b1=new JRadioButton("c++");
                b2=new JRadioButton("java");
                b3=new JRadioButton("swing");
                 jl=new JLabel();
                add(jl);
                add(b1);add(b2);add(b3);
                b1.addItemListener(this);
                b2.addItemListener(this);
                b3.addItemListener(this);
                setLayout(new FlowLayout());
               
            }
        @Override
        public void itemStateChanged(ItemEvent e) {
            // jl.setText((String)e.getSource());
            if(e.getSource()==b1){
                jl.setText("jfdhjvmnmcx");
            }
        }

    };

   public static void main(String[] args) {
    new jpanael();
   }
    
}
