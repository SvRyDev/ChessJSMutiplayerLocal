import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeRectanglesOnClickExample extends JPanel {

    private RectangleData[] rectangles;

    public ChangeRectanglesOnClickExample() {
        rectangles = new RectangleData[6];
        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i] = new RectangleData(i * 100 + 50, 50, 100, 100, Color.BLUE);
        }
        addMouseListener(new CustomMouseListener());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (RectangleData rectangle : rectangles) {
            g.setColor(rectangle.getColor());
            g.fillRect(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
        }
    }

    private class CustomMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            for (int i = 0; i < rectangles.length; i++) {
                if (rectangles[i].containsPoint(e.getX(), e.getY())) {
                    if (i < 3) {
                        rectangles[i].setColor(Color.GREEN);
                        rectangles[i + 3].setColor(Color.GREEN);
                    } else {
                        rectangles[i].setColor(Color.GREEN);
                        rectangles[i - 3].setColor(Color.GREEN);
                    }
                    repaint();
                    break;
                }
            }
        }
    }

    private class RectangleData {
        private int x;
        private int y;
        private int width;
        private int height;
        private Color color;

        public RectangleData(int x, int y, int width, int height, Color color) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.color = color;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public boolean containsPoint(int px, int py) {
            return px >= x && px <= x + width && py >= y && py <= y + height;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Change Rectangles On Click Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 200);
        frame.getContentPane().add(new ChangeRectanglesOnClickExample());
        frame.setVisible(true);
    }
}
