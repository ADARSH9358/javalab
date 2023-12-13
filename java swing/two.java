import javax.swing.*;

public class two extends JFrame {
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;
  public two(String s){
    super(s);
  }  
  public void setComponents(){
    l1=new JLabel("addition of number");
    l2=new JLabel("Fist number");
    l3=new JLabel("Second number");
    l4=new JLabel();
    t1=new JTextField();
    t2=new JTextField();
    b1=new JButton("ADD");
    setLayout(null);

    l1.setBounds(50, 50, 200, 20);
    l2.setBounds(50, 80, 100, 20);
    t1.setBounds(150, 80, 100, 20);
    l3.setBounds(50, 130, 100, 20);
    t2.setBounds(150, 130, 100, 20);
    b1.setBounds(80, 180, 100, 20);
    l4.setBounds(50, 240, 200, 20);

    add(l1);add(l2);add(l3);add(l4);add(t1);add(t2);add(b1);
    class handle implements ActionListener{
        public void actionperformed(ActionListener e){
            

        }

    }
  }
  public static void main(String[] args) {
    two tf=new two("addition");
    tf.setComponents();
    tf.setSize(300,300);
    tf.setVisible(true);
  }
    
}
