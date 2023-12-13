import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class next4 {
    private int centerX, centerY, radius;

    public next4() {
        JFrame frame = new JFrame("Bresenham's Circle Drawing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Set the center and radius of the circle
        centerX = 200;
        centerY = 200;
        radius = 100;

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawBresenhamCircle(g);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }

    // Bresenham's Circle drawing algorithm
    private void drawBresenhamCircle(Graphics g) {
        g.setColor(Color.BLACK); // Set the color to black

        int x = 0;
        int y = radius;
        int d = 3 - 2 * radius;

        while (x <= y) {
            plotCirclePoints(g, centerX, centerY, x, y);
            x++;

            if (d > 0) {
                y--;
                d = d + 4 * (x - y) + 10;
            } else {
                d = d + 4 * x + 6;
            }

            plotCirclePoints(g, centerX, centerY, x, y);
        }
    }

    // Helper method to plot circle points by drawing pixels
    private void plotCirclePoints(Graphics g, int cx, int cy, int x, int y) {
        g.fillRect(cx + x, cy + y, 1, 1);
        g.fillRect(cx - x, cy + y, 1, 1);
        g.fillRect(cx + x, cy - y, 1, 1);
        g.fillRect(cx - x, cy - y, 1, 1);
        g.fillRect(cx + y, cy + x, 1, 1);
        g.fillRect(cx - y, cy + x, 1, 1);
        g.fillRect(cx + y, cy - x, 1, 1);
        g.fillRect(cx - y, cy - x, 1, 1);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new next4());
    }
}
