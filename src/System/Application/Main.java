package System.Application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
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

    public static void main(String args[]) {
        Main app = new Main();
        app.setVisible(true);

    }
}