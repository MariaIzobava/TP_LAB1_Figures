/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import fig.Circle;
import fig.Ellipse;
import fig.Figure;
import fig.IsoscelesTriangle;
import fig.Line;
import fig.Ray;
import fig.Segment;
import fig.Polygon;
import fig.PolygonalChain;
import fig.RegularPolygon;
import fig.Rectangle;
import fig.Rhombus;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mark Drozd
 */
public class PanelPaint extends JPanel 

{
//    private Point prevCords,
//                  curCords;
    
    public enum Instrument {
        POLYGON,
        CIRCLE,
        ELLIPSE,
        SEGMENT,
        RAY,
        LINE,
        REGULAR_POLYGON,
        RECTANGLE,
        RHOMBUS,
        ISOSCELES_TRIANGLE,
        POLYGONAL_CHAIN
    }
    
    
    
    private int prevXCord, prevYCord,
            curXCord, curYCord;
    private Image image;
    private Color curBorderColor;
    private Color curFillColor;
    private ArrayList<Figure> figureList;
    private Figure curFigure;
    private int curStroke;
    private Graphics2D graphics;
    private Instrument curInst = Instrument.REGULAR_POLYGON;
    private int polyCount = 0;
    private int numOfPoints = 5;
    private List<Point> curPolyList; 
    
    public PanelPaint()
    {
       curBorderColor=Color.BLACK;
       curFillColor = Color.WHITE;
       curStroke=2;
       figureList =new ArrayList();
       curPolyList = new ArrayList();
       addMouseListener(new MouseAdapter()
        {
            
            
            @Override
            public void mouseClicked(MouseEvent e)
            { 
             //  paintComponent((Graphics) graphics);
               prevXCord=e.getX();
               prevYCord=e.getY();
               if (graphics!=null)
                    graphics.drawLine(prevXCord,prevYCord,prevXCord,prevYCord);
               if (curInst == Instrument.POLYGON)
               {
                    polyCount ++;
                    curPolyList.add(e.getPoint());
                    curXCord = e.getX();
                    curYCord = e.getY();
                    if (e.getPoint().distance(curPolyList.get(0)) < 7 && curPolyList.size()>2)
                     {
                         curPolyList.get(curPolyList.size()-1).x = curPolyList.get(0).x;
                         curPolyList.get(curPolyList.size()-1).y = curPolyList.get(0).y;
                         curFigure = new Polygon(curPolyList, curBorderColor, curFillColor);
                         curPolyList = new ArrayList();
                         polyCount = 0;
                          figureList.add(curFigure);
                     }
               }
               else if (curInst == Instrument.POLYGONAL_CHAIN)
               {
                   polyCount ++;
                    curPolyList.add(e.getPoint());
                    curXCord = e.getX();
                    curYCord = e.getY();
                    if (polyCount == 4)
                     {
                        // curFigure = new PolygonalChain(curPolyList, Color.BLACK);
                         curPolyList = new ArrayList();
                         polyCount = 0;
                          figureList.add(curFigure);
                     }
               }
               
               
               repaint();
            }
            
         
            
            @Override
            public void mousePressed(MouseEvent e)
            {
               paintComponent((Graphics) graphics);
               prevXCord=e.getX();
               prevYCord=e.getY();
               
               
               switch (curInst)
               {
                   case ELLIPSE:
                       curFigure = new Ellipse(new Point(prevXCord, prevYCord), new Point(prevXCord, prevYCord), curBorderColor, curFillColor);
                       break;
                   case CIRCLE:
                       curFigure = new Circle(new Point(prevXCord, prevYCord), new Point(prevXCord, prevYCord), curBorderColor, curFillColor);
                       break;
                   case SEGMENT:
                       curFigure = new Segment(new Point(prevXCord, prevYCord), new Point(prevXCord, prevYCord), curBorderColor);
                       break;
                   case REGULAR_POLYGON:
                       curFigure = new RegularPolygon(curPolyList, new Point(prevXCord, prevYCord), numOfPoints,  curBorderColor, curFillColor);
                       break;
                   case RECTANGLE:
                       curFigure = new Rectangle(curPolyList, new Point(prevXCord, prevYCord),  curBorderColor, curFillColor);
                       break;
                   case RAY:
                      curFigure = new Ray(new Point(prevXCord, prevYCord), new Point(prevXCord, prevYCord), curBorderColor);
                      break;    
                   case LINE:
                      curFigure = new Line(new Point(prevXCord, prevYCord), new Point(prevXCord, prevYCord), curBorderColor);
                      break;    
                   case RHOMBUS:
                       curFigure = new Rhombus(curPolyList, new Point(prevXCord, prevYCord),  curBorderColor, curFillColor);
                       break;
                       
                   case ISOSCELES_TRIANGLE:
                       curFigure = new IsoscelesTriangle(curPolyList, new Point(prevXCord, prevYCord),  curBorderColor, curFillColor);
                       break;
               }
              
             //  repaint();
             //  curCurve=new Curve(e.getX(), e.getY(), curColor, curStroke);
            }
            
            @Override
            public void mouseReleased(MouseEvent e)
            {
               figureList.add(curFigure);
               switch (curInst)
               {
                   case REGULAR_POLYGON:
                   case RECTANGLE:
                   case RHOMBUS:
                   case ISOSCELES_TRIANGLE:
                       curPolyList = new ArrayList();
                       break;
               }
                    
            }
            
            
        });
        
        
        
        addMouseMotionListener(new MouseMotionAdapter()
        {
           @Override
           public void mouseDragged(MouseEvent e)
           {
               curXCord=e.getX();
               curYCord=e.getY();
               
               
               switch (curInst)
               {
                   case ELLIPSE:
                       ((Ellipse)curFigure).setSecondPoint(e.getPoint());
                       break;
                   case CIRCLE:
                       ((Circle)curFigure).setSecondPoint(e.getPoint());
                       break;
                   case SEGMENT:
                       ((Segment)curFigure).setSecondPoint(e.getPoint());
                       break;
                   case RAY:
                       ((Ray)curFigure).setSecondPoint(e.getPoint());
                       break;
                   case LINE:
                       ((Line)curFigure).setSecondPoint(e.getPoint());
                       break;
                       
                       
                       
                   case REGULAR_POLYGON:
                       curPolyList.clear();
                       curPolyList.add(e.getPoint());
                       ((RegularPolygon)curFigure).setpoints(curPolyList);
                       break;
                       
                   case RECTANGLE:
                       ((Rectangle)curFigure).setSecondPoint(e.getPoint());
                       break;
                       
                   case RHOMBUS:
                   ((Rhombus)curFigure).setSecondPoint(e.getPoint());
                   break;
                   
                   case ISOSCELES_TRIANGLE:
                   ((IsoscelesTriangle)curFigure).setSecondPoint(e.getPoint());
                   break;
                       
                       
               }
               prevXCord=curXCord;
                    prevYCord=curYCord;
               repaint();
               
           }
           
           
           
           @Override
           public void mouseMoved(MouseEvent e)
            {
                switch (curInst)
                {
                    
                    case POLYGON:
                        
                        if (polyCount != 0)
                        {
                            curXCord = e.getX();
                            curYCord = e.getY();
                            repaint();
                        }
                    
                    break;
                    
                }



            }
            
            
        });
        
        
    }
    
    
    
    
    
    
    @Override
    public void paintComponent(Graphics g)
    {
         if (image==null || graphics == null)
         {
                image=createImage(getSize().width, getSize().height);
                graphics=(Graphics2D) image.getGraphics();
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                graphics.setStroke(new BasicStroke(curStroke, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                graphics.setClip(0, 0, this.getWidth(), this.getHeight());
                clear();
         }
         
        clear();
        
        
        graphics.setColor(curBorderColor);
        for (Figure fig : figureList)
            if (fig!=null)
                fig.draw(graphics);
        
        if (curFigure != null)
            curFigure.draw(graphics);
        if (curInst == Instrument.POLYGON && !curPolyList.isEmpty())
        {
            for (int i=0; i< curPolyList.size()-1; ++i)
                graphics.drawLine(curPolyList.get(i).x, curPolyList.get(i).y, 
                                    curPolyList.get(i+1).x, curPolyList.get(i+1).y);
             graphics.drawLine((curPolyList.get(curPolyList.size()-1)).x, curPolyList.get(curPolyList.size()-1).y, 
                                    curXCord, curYCord);
        }
        

          
         graphics.setStroke(new BasicStroke(curStroke, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
         g.drawImage(image, 0, 0, null);
    }
    
    public void setCurrentBorderColor(Color color)
    {
        curBorderColor=color;
    }
    
    public void setCurrentFillColor(Color color)
    {
        curFillColor=color;
    }
    
    public Color getCurrentBorderColor()
    {
        return this.curBorderColor;
    }
    
    public Color getCurrentFillColor()
    {
        return this.curFillColor;
    }
    
     public void setCurrentStroke(int width)
    {
        curStroke=width;
    }
     
     public void setNumOfPoints(int n)
     {
         numOfPoints = n;
     }
     
     public int getNumOfPoints()
     {
         return numOfPoints;
     }
        
    
    public void clear()
    {
        
        graphics.setPaint(Color.white);
        graphics.fillRect(0, 0, getSize().width, getSize().height);
        graphics.setPaint(Color.black);
        repaint();
    }
    
    
    public void setInstrument (Instrument i)
    {
        curInst = i;
    }
    
}