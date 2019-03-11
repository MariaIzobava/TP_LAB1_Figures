import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;


public class Main extends JFrame {
    class MainPanel extends JPanel  {
        MainPanel(int width, int height) {
            super();
            this.width = width;
            this.height = height;
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
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            image.getGraphics().setColor(Color.WHITE);
            image.getGraphics().fillRect(0, 0, width - 1, height - 1);
            setPreferredSize(new Dimension(width, height));
        }

        public void paintComponent(Graphics g) {
            int width = getWidth();
            int height = getHeight();
            g.setColor(Color.GRAY);
            g.fillRect(0, 0, width - 1, height - 1);

            g.drawImage(image, 0, 0, null);
        }

        void drawTrace(MouseEvent e) {
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

        void clickMouse(MouseEvent e) {
            /*isDragging = true;
            prevX = e.getX();
            prevY = e.getY();
            Graphics g = image.getGraphics();
            g.setColor(newColor);
            g.drawLine(prevX, prevY, prevX, prevY);
            repaint();*/
        }

        void releaseMouse(MouseEvent e) {
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

        private BufferedImage image = null;
        private final int width;
        private final int height;
    }

    public Main() {
        initComponents();

        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                newColor = JColorChooser.showDialog(
                        null, "JColorChooser Sample", Color.RED);
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mainPanel.clearImage();
            }
        });
    }

    public static void main(String args[]) {
        Main app = new Main();
        app.setVisible(true);

    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paint");
        setResizable(false);
        setSize(1400, 700);

        mainPanel = new MainPanel(1000, 700);
        mainPanel.setPreferredSize(new Dimension(1000, 700));
        scrollPane = new JScrollPane(mainPanel);

        buttonPanel = new JPanel();
        circle = new JRadioButton("Circle");
        ellipse = new JRadioButton("Ellipse");
        isoscelesTriangle = new JRadioButton("IsoscelesTriangle");
        line = new JRadioButton("Line");
        polygon = new JRadioButton("Polygon");
        polygonalChain = new JRadioButton("PolygonalChain");
        ray = new JRadioButton("Ray");
        rectangle = new JRadioButton("Rectangle");
        regularPolygon = new JRadioButton("RegularPolygon");
        rhombus = new JRadioButton("Rhombus");
        segment = new JRadioButton("Segment");
        symmetricFigure = new JRadioButton("SymmetricFigure");
        colorButton = new JButton("Choose color");
        clearButton = new JButton("Clear field");

        newColor = new Color(255, 0, 0);

        buttonPanel.add(colorButton);

        buttonPanel.add(clearButton);

        buttonPanel.add(circle);
        buttonPanel.add(ellipse);
        buttonPanel.add(isoscelesTriangle);
        buttonPanel.add(line);
        buttonPanel.add(polygon);
        buttonPanel.add(polygonalChain);
        buttonPanel.add(ray);
        buttonPanel.add(rectangle);
        buttonPanel.add(regularPolygon);
        buttonPanel.add(rhombus);
        buttonPanel.add(segment);
        buttonPanel.add(symmetricFigure);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(circle);
        buttonGroup.add(ellipse);
        buttonGroup.add(isoscelesTriangle);
        buttonGroup.add(line);
        buttonGroup.add(polygon);
        buttonGroup.add(polygonalChain);
        buttonGroup.add(ray);
        buttonGroup.add(rectangle);
        buttonGroup.add(regularPolygon);
        buttonGroup.add(rhombus);
        buttonGroup.add(segment);
        buttonGroup.add(symmetricFigure);


        add(buttonPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.WEST);
    }

    private MainPanel mainPanel;
    private JScrollPane scrollPane;
    private JPanel buttonPanel;
    private JButton colorButton;
    private JButton clearButton;
    private JRadioButton circle;
    private JRadioButton ellipse;
    private JRadioButton isoscelesTriangle;
    private JRadioButton line;
    private JRadioButton polygon;
    private JRadioButton polygonalChain;
    private JRadioButton ray;
    private JRadioButton rectangle;
    private JRadioButton regularPolygon;
    private JRadioButton rhombus;
    private JRadioButton segment;
    private JRadioButton symmetricFigure;
    private ButtonGroup buttonGroup;
    
    private Color newColor;
}