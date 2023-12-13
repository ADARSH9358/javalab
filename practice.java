import java.awt.*;
import javax.swing.*;


//  c.gridx = 0;  //xdir
//         c.gridy = 0;  // y dir
//         c.gridwidth = 1;  // combine column
//         c.fill = GridBagConstraints.HORIZONTAL;
//         c.insets = new Insets(0, 20, 0, 20);
//         c.weightx = 0;
//         c.weighty = 0.25;
public class practice extends JFrame {
    JLabel j1,j2,j3,j4,j5,j6;
    JTextField jt1,jt2,jt3,jt4,jt5;
    JComboBox jc1;
    JScrollPane sc1;
    practice(){
        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints g=new GridBagConstraints();
        //  g.insets=new Insets(10, 10, 10, 10);

        g.gridx=0;
        g.gridy=0;
        g.weightx=0;
        g.weighty=0.25;
        g.fill=GridBagConstraints.HORIZONTAL;
        g.insets=new Insets(0, 20, 0, 20);

         j1=new JLabel("Name : ");
        add(j1,g); 

         g.gridx=0;
        g.gridy=1;
        g.weightx=0;
        g.weighty=0.25;
        g.fill=GridBagConstraints.HORIZONTAL;
        g.insets=new Insets(0, 20, 0, 20);
        j2=new JLabel("First Name ");

        add(j2,g);

        jt1=new JTextField(40);
       g.gridx=1;
        g.gridy=1;
        g.weightx=1;
        g.weighty=0.25;
        g.fill=GridBagConstraints.HORIZONTAL;
        g.insets=new Insets(0, 20, 0, 20);
        j2=new JLabel("First Name ");
        add(jt1,g);



        j3=new JLabel("Last Name ");
        g.gridx=2;
        g.gridy=1;
        g.weightx=0;
        g.weighty=0.25;
        g.fill=GridBagConstraints.HORIZONTAL;
        g.insets=new Insets(0, 20, 0, 20);
        add(j3,g);

         jt1=new JTextField(40);
         g.gridx=3;
        g.gridy=1;
        g.weightx=1;
        g.weighty=0.25;
        g.fill=GridBagConstraints.HORIZONTAL;
        g.insets=new Insets(0, 20, 0, 20);
        add(jt1,g);


         g.gridx=0;
        g.gridy=2;
        g.weightx=0;
        g.weighty=0.25;
        g.fill=GridBagConstraints.HORIZONTAL;
        g.insets=new Insets(0, 30, 0, 20);
         j4=new JLabel("Title ");
        add(j4,g);


        jt2=new JTextField(40);
         g.gridx=1;
        g.gridy=2;
        g.weightx=1;
        g.weighty=0.25;
        g.fill=GridBagConstraints.HORIZONTAL;
        g.insets=new Insets(0, 10, 0, 20);
        add(jt2,g);

           String [] str={"iteam1","iteam2","iteam3","iteam4","iteam5"};
        JList<String> list = new JList<>(str);

    //    sc1.setPreferredSize(new Dimension(300, 80));

        g.gridx=1;
        g.gridy=4;
        // g.gridwidth=1;
        // g.weightx=0.3;
        // g.weighty=0.25;
         g.fill=GridBagConstraints.BOTH;

        // g.fill=GridBagConstraints.HORIZONTAL;
        // g.insets=new Insets(0, 10, 0, 20);
        sc1=new JScrollPane(list);
         sc1.setPreferredSize(new Dimension(100, 60));
        add(sc1,g);

        j5=new JLabel("jdhjhjk");
           g.gridx=1;
        g.gridy=5;
         g.gridwidth=1;
        g.weightx=0.3;
        g.weighty=0.25;
        add(j5,g);
        // sc1=new JScrollPane(str,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        //  j5=new JLabel("NickName ");
        // j6=new JLabel("Format ");
        // jc1 =new JComboBox(str);
        //     //    add(j2);
        // add(j3);
        // add(j4);
        // add(j5);
        // add(j6);
        // add(jc1);



    }
    public static void main(String[] args) {
        new practice();
    }
}
