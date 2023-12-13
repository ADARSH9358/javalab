import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CardLayoutCode {
    CardLayoutCode() {
        JFrame frame = new JFrame("CardLayout Example");
        frame.setLayout(new BorderLayout());

        JPanel comboBoxPane = new JPanel();
        final String str1 = "Click to see Buttons";
        final String str2 = "Click to see Text";
        String items[] = {str1, str2};
        // JComboBox<String> cb = new JComboBox<>(items);
        // comboBoxPane.add(cb);
        JComboBox<String> com=new JComboBox(items);
        comboBoxPane.add(com);
        // frame.add(comboBoxPane, BorderLayout.PAGE_START);

        JPanel p1 = new JPanel();
        p1.add(new JButton("Button 1"));
        p1.add(new JButton("Button 2"));

        JPanel p2 = new JPanel();
        p2.add(new JLabel("We are using Card Layout"));

        JPanel m_pan = new JPanel(new CardLayout());
        m_pan.add(p1, "button1");
        m_pan.add(p2, "we  are using Card Layout");

        com.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                CardLayout layout = (CardLayout)m_pan.getLayout();
                layout.show(m_pan, (String)e.getItem());
            }
        });

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(comboBoxPane, BorderLayout.PAGE_START);
        frame.add(m_pan, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CardLayoutCode();
            }
        });
    }
}

