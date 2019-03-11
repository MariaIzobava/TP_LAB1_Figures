package System.Application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;

public class MainPanel extends JPanel {
    private final int DEFAULT_WIDTH;
    private final int DEFAULT_HEIGHT;
    private BufferedImage image = null;

    public MainPanel(int width, int height) {
        super();
        this.DEFAULT_WIDTH = width;
        this.DEFAULT_HEIGHT = height;
        init();

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                drawTrace(e);
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                clickMouse(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                releaseMouse(e);
            }
        });
    }

    private void init() {
        image = new BufferedImage(DEFAULT_WIDTH, DEFAULT_HEIGHT, BufferedImage.TYPE_INT_ARGB);
        image.getGraphics().setColor(Color.WHITE);
        image.getGraphics().fillRect(0, 0, DEFAULT_WIDTH - 1, DEFAULT_HEIGHT - 1);
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
    }

    public void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, width - 1, height - 1);

        g.drawImage(image, 0, 0, null);
    }

    public void drawTrace(MouseEvent e) {
            /*int curX = e.getX();
            int curY = e.getY();
            if (!isDragging) {
                return;
            }
            Graphics g = image.getGraphics();
            g.setColor(newColor);
            g.drawLine(prevX, prevY, curX, curY);
            repaint();
            prevX = curX;
            prevY = curY;*/
    }

    public void clickMouse(MouseEvent e) {
            /*isDragging = true;
            prevX = e.getX();
            prevY = e.getY();
            Graphics g = image.getGraphics();
            g.setColor(newColor);
            g.drawLine(prevX, prevY, prevX, prevY);
            repaint();*/
    }

    public void releaseMouse(MouseEvent e) {
            /*if (!isDragging) {
                return;
            }
            isDragging = false;*/
    }

    public void clearImage() {
        init();
        repaint();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(image.getWidth(), image.getHeight());
    }
}