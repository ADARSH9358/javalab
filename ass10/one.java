import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class one {
    private class Canvas extends JPanel {
        int a,b,c,d;
        
        Canvas(int a, int b,int c,int d) {
           this.a=a;
           this.b=b;
           this.c=c;
           this.d=d;

        }

        private void plotPixel(Graphics g, int x, int y) {
            g.fillRect(x, y, 1, 1);
        }

        void drawine(Graphics g) {
            int x, y, d;
            int dx=c-a;
            int dy=d-b;
            d=2*dy-dx;
            while(a<c){
                if(d<0){
                    d=d+2*dy;
                    a=a+1;
                }
                else{
                    d=d+2*(dy-dx);
                    a=a+1;
                    b=c+1;

                }
                plotPixel(g, a, b);
            }
            
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawine(g);
            // drawBresenhamsCircle(0, 0, 50, g);
            // drawBresenhamsCircle(-30, 10, 50, g);
        }
    }

    one(int h, int w) {
        JFrame frm = new JFrame("Paint Demo");
        frm.setSize(w, h);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Canvas canvas = new Canvas(10,10,20,20);
        frm.add(canvas);
        frm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new one(600, 600);
            }
        });
    }
}