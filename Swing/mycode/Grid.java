package mycode;

import java.awt.*;
import javax.swing.*;

public class Grid {
    Grid() {
        JFrame f = new JFrame("layout");
        f.setBounds(300, 200, 500, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");

        // GridLayout g= new GridLayout();
        // GridLayout g= new GridLayout(2,3); used to pass no of row and col in which
        // grid divide
        // g.setHgap(5); //gap between two rows
        // g.setVgap(6); //gap between two col

        // !or directly pass into constructor

        GridLayout g = new GridLayout(4, 2, 5, 6);

        f.setLayout(g);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b4);
        f.add(b5);
        // f.add(b6);
          f.add(b6,2);  // index is pass with it and then all component sift to right

    }

    public static void main(String[] args) {
        new Grid();
    }
}

/*
 * set comonent left to right
 * all avalibale sapce is consume
 * divided in the form of rows and column
 * all comonent have same size
 */