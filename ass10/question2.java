import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class question2 {
    private class Canvas extends JPanel {
        int w, h;
        int x,y,x1,y1;
        Canvas(int w, int h,int x,int y,int x1,int y1) {
            this.w = w;
            this.h = h;
            this.x = x;
            this.y = y;
            this.x1 = x1;
            this.y1 = y1;
        }

        private void plotPixel(Graphics g) {
            int dx = x1 - x;
            int dy = y1 - y;
            double slope=(dy*1.0)/dx;
            int steps = Math.max(Math.abs(dx), Math.abs(dy));
    
            float xIncrement = (float) dx / steps;
            float yIncrement = (float) dy / steps;
    
            float p = x;
            float q = y;
            for (int i = 0; i <= steps; i++) {
                g.fillRect(Math.round(p), Math.round(q), 1, 1); // Draw a pixel at (x, y)
                if(slope<1){
                p += 1;
                q += slope;
                }
                else{
                
                q += (1*1.0/slope); 
                p += 1;
                }
            }
            
        }

        protected void paintComponent(Graphics g) {
                       // g.setColor(Color.GREEN);
            super.paintComponent(g);
              plotPixel(g);
            // This is where your algorithm will appear, call as method
            // such as drawBresenhamCircle(int radius, Graphics g) that will
            // internally call the plotPixel to plot the pixel. The plotPixel is
            // already translating the origin of the canvas from top-left corner
            // to center of the panel, so that you can focus on implementing the
            // algorithms only. So, consider the center of the canvas as (0, 0)
        }
    }

    question2(int h, int w,int x,int y,int x1,int y1) {
        JFrame frm = new JFrame("Paint Demo");
        frm.setSize(w, h);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas(w, h,x,y,x1,y1);
        frm.add(canvas);
        frm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new question2(500, 500,100,100,150,400);
            }
        });
    }
}
