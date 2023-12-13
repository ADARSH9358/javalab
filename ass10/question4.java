import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class question4 {
    private class Canvas extends JPanel {
        int w, h;
        int r;
        Canvas(int w, int h,int r) {
            this.w = w;
            this.h = h;
            this.r = r;
      
        }

        private void plotPixel(Graphics g) {
           int p=3-2*r;
           int x=0;
           int y=r;
           int p1=0; 
           while(x<y){
            g.fillRect( w / 2 + x, h / 2 + y,1,1); // Adjusted to center
            g.fillRect( w / 2 - x, h / 2 + y,1,1); // Adjusted to center
            g.fillRect( w / 2 + x, h / 2 - y,1,1); // Adjusted to center
            g.fillRect( w / 2 - x, h / 2 - y,1,1); // Adjusted to center
            g.fillRect( w / 2 + y, h / 2 + x,1,1); // Adjusted to center
            g.fillRect( w / 2 - y, h / 2 + x,1,1); // Adjusted to center
            g.fillRect( w / 2 + y, h / 2 - x,1,1); // Adjusted to center
            g.fillRect( w / 2 - y, h / 2 - x,1,1); // Adjus
            if(p<0){

                p1=p+4*x+6;
                p=p1;
                x=x+1;
                y=y-1;

            }
            else{
                p1=p+4*x-4*y+6;
                p=p1;
                x=x+1;

            }
           }
            
        }

        protected void paintComponent(Graphics g) {
                       // g.setColor(Color.GREEN);
            super.paintComponent(g);
              plotPixel(g);
            // This is where your algorithm will appear, call as method
            // such as drawBresenhamCircle(int radius, Graphics g) that will
            // internally call the g.fillRect to plot the pixel. The g.fillRect is
            // already translating the origin of the canvas from top-left corner
            // to center of the panel, so that you can focus on implementing the
            // algorithms only. So, consider the center of the canvas as (0, 0)
        }
    }

    question4(int h, int w,int r) {
        JFrame frm = new JFrame("Paint Demo");
        frm.setSize(w, h);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas(w, h,r);
        frm.add(canvas);
        frm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new question4(500, 500,200);
            }
        });
    }
}

