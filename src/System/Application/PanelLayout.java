/*
 * Created by JFormDesigner on Tue Mar 12 02:27:50 MSK 2019
 */

package System.Application;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author unknown
 */
public class PanelLayout extends JFrame {
    public PanelLayout() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ivan
        panel1 = new JPanel();
        scrollPane2 = new JScrollPane();
        panel2 = new JPanel();
        panel3 = new JPanel();
        toolBar1 = new JToolBar();
        scrollPane3 = new JScrollPane();
        textPane1 = new JTextPane();
        circleRadioButton = new JRadioButtonMenuItem();
        ellipseRadioButton = new JRadioButtonMenuItem();
        isoscelesTriangleRadioButton = new JRadioButtonMenuItem();
        lineRadioButton = new JRadioButtonMenuItem();
        polygonRadioButton = new JRadioButtonMenuItem();
        polygonalChainRadioButton = new JRadioButtonMenuItem();
        rayRadioButton = new JRadioButtonMenuItem();
        rectangleRadioButton = new JRadioButtonMenuItem();
        regularPolygonRadioButton = new JRadioButtonMenuItem();
        rhombusRadioButton = new JRadioButtonMenuItem();
        segmentRadioButton = new JRadioButtonMenuItem();
        symmetricFigureRadioButton = new JRadioButtonMenuItem();
        button1 = new JButton();
        button2 = new JButton();
        spinner = new JSpinner();
        textField1 = new JTextField();

        //======== this ========
        setTitle("Figures Painter 1.0");
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //======== scrollPane2 ========
            {

                //======== panel2 ========
                {

                    GroupLayout panel2Layout = new GroupLayout(panel2);
                    panel2.setLayout(panel2Layout);
                    panel2Layout.setHorizontalGroup(
                        panel2Layout.createParallelGroup()
                            .addGap(0, 787, Short.MAX_VALUE)
                    );
                    panel2Layout.setVerticalGroup(
                        panel2Layout.createParallelGroup()
                            .addGap(0, 637, Short.MAX_VALUE)
                    );
                }
                scrollPane2.setViewportView(panel2);
            }

            //======== panel3 ========
            {

                GroupLayout panel3Layout = new GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                );
            }

            //======== toolBar1 ========
            {
                toolBar1.setOrientation(SwingConstants.VERTICAL);

                //======== scrollPane3 ========
                {

                    //---- textPane1 ----
                    textPane1.setText("Figures To Draw:");
                    textPane1.setEditable(false);
                    textPane1.setEnabled(false);
                    textPane1.setFont(new Font("Segoe UI", Font.BOLD, 22));
                    scrollPane3.setViewportView(textPane1);
                }
                toolBar1.add(scrollPane3);

                //---- circleRadioButton ----
                circleRadioButton.setText("Circle");
                toolBar1.add(circleRadioButton);

                //---- ellipseRadioButton ----
                ellipseRadioButton.setText("Ellipse");
                toolBar1.add(ellipseRadioButton);

                //---- isoscelesTriangleRadioButton ----
                isoscelesTriangleRadioButton.setText("IsoscelesTriangle");
                toolBar1.add(isoscelesTriangleRadioButton);

                //---- lineRadioButton ----
                lineRadioButton.setText("Line");
                toolBar1.add(lineRadioButton);

                //---- polygonRadioButton ----
                polygonRadioButton.setText("Polygon");
                toolBar1.add(polygonRadioButton);

                //---- polygonalChainRadioButton ----
                polygonalChainRadioButton.setText("PolygonalChain");
                toolBar1.add(polygonalChainRadioButton);

                //---- rayRadioButton ----
                rayRadioButton.setText("Ray");
                toolBar1.add(rayRadioButton);

                //---- rectangleRadioButton ----
                rectangleRadioButton.setText("Rectangle");
                toolBar1.add(rectangleRadioButton);

                //---- regularPolygonRadioButton ----
                regularPolygonRadioButton.setText("RegularPolygon");
                toolBar1.add(regularPolygonRadioButton);

                //---- rhombusRadioButton ----
                rhombusRadioButton.setText("Rhombus");
                toolBar1.add(rhombusRadioButton);

                //---- segmentRadioButton ----
                segmentRadioButton.setText("Segment");
                toolBar1.add(segmentRadioButton);

                //---- symmetricFigureRadioButton ----
                symmetricFigureRadioButton.setText("SymmetricFigure");
                toolBar1.add(symmetricFigureRadioButton);
            }

            //---- button1 ----
            button1.setText("Choose Color");

            //---- button2 ----
            button2.setText("Clear Content");

            //---- spinner ----
            spinner.setModel(new SpinnerNumberModel(1, 1, 15, 1));

            //---- textField1 ----
            textField1.setEditable(false);
            textField1.setText("Set Amout Of Points:");

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(toolBar1, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 675, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(button1, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(button2, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(spinner, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(toolBar1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrollPane2))
                        .addGap(27, 27, 27))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinner, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }
        contentPane.add(panel1, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ivan
    private JPanel panel1;
    private JScrollPane scrollPane2;
    private JPanel panel2;
    private JPanel panel3;
    private JToolBar toolBar1;
    private JScrollPane scrollPane3;
    private JTextPane textPane1;
    private JRadioButtonMenuItem circleRadioButton;
    private JRadioButtonMenuItem ellipseRadioButton;
    private JRadioButtonMenuItem isoscelesTriangleRadioButton;
    private JRadioButtonMenuItem lineRadioButton;
    private JRadioButtonMenuItem polygonRadioButton;
    private JRadioButtonMenuItem polygonalChainRadioButton;
    private JRadioButtonMenuItem rayRadioButton;
    private JRadioButtonMenuItem rectangleRadioButton;
    private JRadioButtonMenuItem regularPolygonRadioButton;
    private JRadioButtonMenuItem rhombusRadioButton;
    private JRadioButtonMenuItem segmentRadioButton;
    private JRadioButtonMenuItem symmetricFigureRadioButton;
    private JButton button1;
    private JButton button2;
    private JSpinner spinner;
    private JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
