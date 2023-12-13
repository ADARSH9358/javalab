// import java.awt.*;
// import javax.swing.JFrame;
// import javax.swing.JPanel;
// import javax.swing.SwingUtilities;

// public class Test2 {
//     private class Canvas extends JPanel {
//         int w, h;
        
//         Canvas(int w, int h) {
//             this.w = w;
//             this.h = h;
//         }

//         private void plotPixel(Graphics g, int x, int y) {
//             g.fillRect(x+(w/2), y+(h/2), 1, 1);
//         }

//         void drawBresenhamsCircle(int cx, int cy, int r, Graphics g) {
//             int x, y, d;
//             y = r;
//             x = 0;
        
//             plotPixel(g, x, y);
//             d = (3-2*(int)r);
//             while (x <= y) {
//                 if (d <= 0) {
//                     d = d + (4*x + 6);
//                 } else {
//                     d = d + 4*(x-y) + 10;
//                     y--;
//                 }
//                 x++;
        
//                 plotPixel(g, cx+x, cy+y);
//                 plotPixel(g, cx-x, cy+y);
//                 plotPixel(g, cx+x, cy-y);
//                 plotPixel(g, cx-x, cy-y);
//                 plotPixel(g, cy+y, cx+x);
//                 plotPixel(g, cy-y, cx+x);
//                 plotPixel(g, cy+y, cx-x);
//                 plotPixel(g, cy-y, cx-x);
//             }   
//         }

//         protected void paintComponent(Graphics g) {
//             super.paintComponent(g);
//             drawBresenhamsCircle(0, 0, 150, g);
//             // drawBresenhamsCircle(0, 0, 50, g);
//             // drawBresenhamsCircle(-30, 10, 50, g);
//         }
//     }

//     Test2(int h, int w) {
//         JFrame frm = new JFrame("Paint Demo");
//         frm.setSize(w, h);
//         frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         Canvas canvas = new Canvas(w, h);
//         frm.add(canvas);
//         frm.setVisible(true);
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             public void run() {
//                 new Test2(600, 600);
//             }
//         });
//     }
// }

import javax.swing.JPanel;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Test2{
    class Canvas extends JPanel{
        int a,b,c,d;
        Canvas(int x,int y,int a,int b){
            this.a=x;
            this.b=y;
            this.c=a;
            this.d=b;
        }
         void plotPixel(Graphics g, int x, int y) {
             g.fillRect(x, y, 1, 1);
        }

        void drawBr(int x,int y,int a,int b,Graphics g){
            int dx = a - x;
            int dy = b - y;
            int steps = Math.max(Math.abs(dx), Math.abs(dy));
            float xIncrement = (float) dx / steps;
            float yIncrement = (float) dy / steps;
    
            float l = x;
            float m = y;
    
            for (int i = 0; i <= steps; i++) {
                plotPixel(g,Math.round(x), Math.round(y)); // Draw a pixel at (x, y)
                l += xIncrement;
                m += yIncrement;
            }

    
        }

        public void paintComponent(Graphics g){
            super.paintComponent(g);
            drawBr(a,b,c,d,g);
        }

    }
    Test2(){
        JFrame jf=new JFrame();
        jf.setSize(600,600);
        Canvas cv=new Canvas(10,10,40,40);
        jf.add(cv);
        jf.setVisible(true);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Test2();
    }
}
