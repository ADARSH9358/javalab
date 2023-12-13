// 1) Draw a line using DDA algorithm via 
// drawDDALine(int x1, int y1, int x2, int y2, Graphics g)

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class q1 {
    private int x1, y1, x2, y2;

    public q1() {
        JFrame frame = new JFrame("DDA Line Drawing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Set the starting and ending points of the line
        x1 = 50;
        y1 = 50;
        x2 = 300;
        y2 = 300;

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawDDALine(g);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }

    // DDA line drawing algorithm
    private void drawDDALine(Graphics g) {
        g.setColor(Color.BLACK); // Set the line color to black

        int dx = x2 - x1;
        int dy = y2 - y1;

        int steps = Math.max(Math.abs(dx), Math.abs(dy));

        float xIncrement = (float) dx / steps;
        float yIncrement = (float) dy / steps;

        float x = x1;
        float y = y1;

        for (int i = 0; i <= steps; i++) {
            g.fillRect(Math.round(x), Math.round(y), 1, 1); // Draw a pixel at (x, y)
            x += xIncrement;
            y += yIncrement;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new q1());
    }
}

