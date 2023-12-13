import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class q5 {
    private class Canvas extends JPanel {
        int w, h;
        int r;

        Canvas(int w, int h, int r) {
            this.w = w;
            this.h = h;
            this.r = r;
        }

        private void plotPixel(Graphics g, int x, int y) {
            g.fillRect(x, y, 1, 1);
        }

        private void drawBresenhamCircle(int r, Graphics g) {
            int x = 0;
            int y = r;
            double p = (5*1.0/4)- r;

            while (x <= y) {
                plotPixel(g, w / 2 + x, h / 2 + y); // Adjusted to center
                plotPixel(g, w / 2 - x, h / 2 + y); // Adjusted to center
                plotPixel(g, w / 2 + x, h / 2 - y); // Adjusted to center
                plotPixel(g, w / 2 - x, h / 2 - y); // Adjusted to center
                plotPixel(g, w / 2 + y, h / 2 + x); // Adjusted to center
                plotPixel(g, w / 2 - y, h / 2 + x); // Adjusted to center
                plotPixel(g, w / 2 + y, h / 2 - x); // Adjusted to center
                plotPixel(g, w / 2 - y, h / 2 - x); // Adjusted to center

                if (p < 0) {
                    p = p + 2 * x + 3;
                } else {
                    p = p + 2 * (x - y) + 5;
                    y--;
                }
                x++;
            }
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawBresenhamCircle(r, g);
        }
    }

    q5(int h, int w, int r) {
        JFrame frm = new JFrame("Bresenham's Circle Drawing");
        frm.setSize(w, h);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas(w, h, r);
        frm.add(canvas);
        frm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new q5(500, 500,200);
            }
        });
    }
}

