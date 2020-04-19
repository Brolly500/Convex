import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public static final int width = 850;
    public static final int height = 450;
    static Window w;
    static boolean firstc = false;
    static int lastX, lastY;
    public static int count = 0;


    public Window() {
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.black);
        // Начало координат выставляется автоматически

        g.translate(width / 2, height / 2);
        g.drawLine(-width / 2, 0, width / 2, 0);
        g.drawLine(0, -height / 2, 0, height / 2);

    }

    public static void draw(int x, int y) {
        Graphics g = w.getGraphics();
        g.setColor(Color.blue);
        if (firstc == false) {
            firstc = true;
            lastX = x;
            lastY = y;
            g.drawLine(lastX, lastY, x, y);
            g.fillOval(x - 2, y - 2, 3, 3);

        }
        else {
            g.drawLine(lastX, lastY, x, y);
            g.fillOval(x - 2, y - 2, 3, 3);
            lastX = x;
            lastY = y;
            parallel(x,y);
        }
    }

    public static void CreateWindow(){
        w = new Window();

    }

    public static void parallel(int x, int y) {
        if (((x - lastX) == 0) || ((y - lastY) == 0)) {
            count = count + 1;

        }
    }
    }




