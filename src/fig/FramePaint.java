package fig;


import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;

/**
 * @author Mark Drozd
 */
public class FramePaint extends JFrame {


    private JPanel borderColorShowPanel;
    private JPanel fillColorShowPanel;
    private JPanel instrumentPanel;
    private JButton polygonInstrument;
    private JButton ellipseInstrument;
    private JButton segmentInstrument;
    private JButton rayInstrument;
    private JButton circleInstrument;
    private JButton lineInstrument;
    private JButton regularPolygonInstrument;
    private JButton isoscelesInstrument;
    private JButton rhombusInstrument;
    private JButton rectangleInstrument;
    private JButton polyChainInstrument;
    private JSlider sliderStroke;
    private JSlider sliderNumOfPoints;
    private ButtonGroup group;
    private JRadioButton drawButton;
    private JRadioButton moveButton;
    private JPanel controlPanel;

    public FramePaint() {
        super("Draw Figures Application");
        setLayout(null);
        setBounds(100, 100, 1400, 800);
        PanelPaint panelPaint = new PanelPaint();
        panelPaint.setPreferredSize(new Dimension(getSize().width - 50, getSize().height));
        JScrollPane scrollPane = new JScrollPane(panelPaint, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(5, 5, getSize().width - 20, getSize().height * 4 / 5);

        add(scrollPane, BorderLayout.CENTER);

        controlPanel = new JPanel();
        controlPanel.setBounds(300, getSize().height - 120, 60, 80);

        group = new ButtonGroup();
        drawButton = new JRadioButton("Draw", true);
        drawButton.addActionListener((ActionEvent e) -> {
            panelPaint.isDrawingModeOn(true);
        });
        group.add(drawButton);
        moveButton = new JRadioButton("Move", false);
        moveButton.addActionListener((ActionEvent e) -> {
            panelPaint.isDrawingModeOn(false);
        });
        group.add(moveButton);
        controlPanel.add(drawButton);
        controlPanel.add(moveButton);
        add(controlPanel);


        borderColorShowPanel = new JPanel();
        fillColorShowPanel = new JPanel();
        add(borderColorShowPanel);
        add(fillColorShowPanel);
        borderColorShowPanel.setBounds(5, getSize().height - 100, 40, 40);
        borderColorShowPanel.setBackground(panelPaint.getCurrentBorderColor());
        borderColorShowPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JColorChooser jcc = new JColorChooser();
                class ColorChosen implements ActionListener {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panelPaint.setCurrentBorderColor(jcc.getColor());
                        borderColorShowPanel.setBackground(panelPaint.getCurrentBorderColor());
                    }

                }
                JDialog colorChooserDialog = JColorChooser.createDialog(null, "Choose border color", true, jcc, new ColorChosen(), null);
                colorChooserDialog.setVisible(true);
            }

        });
        fillColorShowPanel.setBounds(55, getSize().height - 100, 40, 40);
        fillColorShowPanel.setBackground(panelPaint.getCurrentFillColor());
        fillColorShowPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JColorChooser jcc = new JColorChooser();
                class ColorChosen implements ActionListener {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panelPaint.setCurrentFillColor(jcc.getColor());
                        fillColorShowPanel.setBackground(panelPaint.getCurrentFillColor());
                    }

                }
                JDialog colorChooserDialog = JColorChooser.createDialog(null, "Choose a color", true, jcc, new ColorChosen(), null);
                colorChooserDialog.setVisible(true);
            }

        });


        instrumentPanel = new JPanel();
        instrumentPanel.setLayout(new FlowLayout());
        add(instrumentPanel);
        instrumentPanel.setBounds(230, getSize().height - 110, 1000, 60);
        // instrumentPanel.setBackground(panelPaint.getCurrentColor());

        polygonInstrument = new JButton("");
        polygonInstrument.setIcon(new ImageIcon((new ImageIcon("src/app/polygon.ico")).
                getImage().getScaledInstance(23, 23, Image.SCALE_SMOOTH)));
        polygonInstrument.addActionListener((ActionEvent e) -> {
            panelPaint.setInstrument(PanelPaint.Instrument.POLYGON);
        });
        ellipseInstrument = new JButton("");
        ellipseInstrument.setIcon(new ImageIcon((new ImageIcon("src/app/ellipse.ico")).
                getImage().getScaledInstance(23, 23, Image.SCALE_SMOOTH)));
        ellipseInstrument.addActionListener((ActionEvent e) -> {
            panelPaint.setInstrument(PanelPaint.Instrument.ELLIPSE);
        });
        circleInstrument = new JButton("");
        circleInstrument.setIcon(new ImageIcon((new ImageIcon("src/app/circle.ico")).
                getImage().getScaledInstance(23, 23, Image.SCALE_SMOOTH)));
        circleInstrument.addActionListener((ActionEvent e) -> {
            panelPaint.setInstrument(PanelPaint.Instrument.CIRCLE);
        });
        segmentInstrument = new JButton("");
        segmentInstrument.setIcon(new ImageIcon((new ImageIcon("src/app/segment.ico")).
                getImage().getScaledInstance(23, 23, Image.SCALE_SMOOTH)));
        segmentInstrument.addActionListener((ActionEvent e) -> {
            panelPaint.setInstrument(PanelPaint.Instrument.SEGMENT);
        });
        rayInstrument = new JButton("");
        rayInstrument.setIcon(new ImageIcon((new ImageIcon("src/app/ray.ico")).
                getImage().getScaledInstance(23, 23, Image.SCALE_SMOOTH)));
        rayInstrument.addActionListener((ActionEvent e) -> {
            panelPaint.setInstrument(PanelPaint.Instrument.RAY);
        });
        lineInstrument = new JButton("");
        lineInstrument.setIcon(new ImageIcon((new ImageIcon("src/app/line.ico")).
                getImage().getScaledInstance(23, 23, Image.SCALE_SMOOTH)));
        lineInstrument.addActionListener((ActionEvent e) -> {
            panelPaint.setInstrument(PanelPaint.Instrument.LINE);
        });
        regularPolygonInstrument = new JButton("");
        regularPolygonInstrument.setIcon(new ImageIcon((new ImageIcon("src/app/regularPolygon.ico")).
                getImage().getScaledInstance(23, 23, Image.SCALE_SMOOTH)));
        regularPolygonInstrument.addActionListener((ActionEvent e) -> {
            panelPaint.setInstrument(PanelPaint.Instrument.REGULAR_POLYGON);
        });
        isoscelesInstrument = new JButton("");
        isoscelesInstrument.setIcon(new ImageIcon((new ImageIcon("src/app/isosceles.ico")).
                getImage().getScaledInstance(23, 23, Image.SCALE_SMOOTH)));
        isoscelesInstrument.addActionListener((ActionEvent e) -> {
            panelPaint.setInstrument(PanelPaint.Instrument.ISOSCELES_TRIANGLE);
        });
        rhombusInstrument = new JButton("");
        rhombusInstrument.setIcon(new ImageIcon((new ImageIcon("src/app/rhombus.ico")).
                getImage().getScaledInstance(23, 23, Image.SCALE_SMOOTH)));
        rhombusInstrument.addActionListener((ActionEvent e) -> {
            panelPaint.setInstrument(PanelPaint.Instrument.RHOMBUS);
        });
        rectangleInstrument = new JButton("");
        rectangleInstrument.setIcon(new ImageIcon((new ImageIcon("src/app/rectangle.ico")).
                getImage().getScaledInstance(23, 23, Image.SCALE_SMOOTH)));
        rectangleInstrument.addActionListener((ActionEvent e) -> {
            panelPaint.setInstrument(PanelPaint.Instrument.RECTANGLE);
        });
        polyChainInstrument = new JButton("");
        polyChainInstrument.setIcon(new ImageIcon((new ImageIcon("src/app/polyChain.ico")).
                getImage().getScaledInstance(23, 23, Image.SCALE_SMOOTH)));
        polyChainInstrument.addActionListener((ActionEvent e) -> {
            panelPaint.setInstrument(PanelPaint.Instrument.POLYGONAL_CHAIN);
        });


        instrumentPanel.add(polygonInstrument);
        instrumentPanel.add(regularPolygonInstrument);
        instrumentPanel.add(rectangleInstrument);
        instrumentPanel.add(rhombusInstrument);
        instrumentPanel.add(isoscelesInstrument);
        instrumentPanel.add(ellipseInstrument);
        instrumentPanel.add(circleInstrument);
        instrumentPanel.add(segmentInstrument);
        instrumentPanel.add(rayInstrument);
        instrumentPanel.add(lineInstrument);
        instrumentPanel.add(polyChainInstrument);


        sliderStroke = new JSlider(0, 100, 2);
        sliderStroke.setPreferredSize(new Dimension(150, 40));
        sliderStroke.setMajorTickSpacing(20);
        sliderStroke.setPaintTicks(true);
        sliderStroke.setPaintLabels(true);
        sliderStroke.addChangeListener((ChangeEvent e) -> {
            if (!sliderStroke.getValueIsAdjusting())
                panelPaint.setCurrentStroke(sliderStroke.getValue());
        });


        sliderNumOfPoints = new JSlider(3, 15, 3);
        sliderNumOfPoints.setValue(panelPaint.getNumOfPoints());
        sliderNumOfPoints.setPreferredSize(new Dimension(150, 40));
        sliderNumOfPoints.setMajorTickSpacing(2);
        sliderNumOfPoints.setPaintTicks(true);
        sliderNumOfPoints.setPaintLabels(true);
        sliderNumOfPoints.addChangeListener((ChangeEvent e) -> {
            if (!sliderNumOfPoints.getValueIsAdjusting())
                panelPaint.setNumOfPoints(sliderNumOfPoints.getValue());
        });

        JPanel sliderPanel = new JPanel();
        sliderPanel.add(sliderNumOfPoints);
        add(sliderPanel);

        sliderPanel.setBounds(90, getSize().height - 110, 200, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
