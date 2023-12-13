package mycode;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex extends JFrame {
    JFrame f;

    Ex() {
        f = new JFrame();
        f.setTitle("Experiment 2");
        f.setSize(300, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setLayout(null);

        String[] value = {
                "agra", "kanpur", "auriya", "jsk", "apk",
                "agra", "kanpur", "auriya", "jsk", "apk",
                "agra", "kanpur", "auriya", "jsk", "apk"
        };

        JComboBox<String> jc = new JComboBox<>(value);
        JLabel jl = new JLabel("Your preferred language");
        JButton b = new JButton("Submit");

        jc.setBounds(100, 100, 100, 20);
        f.add(jc);
    }

    public static void main(String[] args) {
        new Ex();
    }
}
