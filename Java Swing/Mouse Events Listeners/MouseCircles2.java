/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Quinn
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseCircles2
{
   int x = -1;
   int y;
   static final int RADIUS = 10;
   Drawing draw = new Drawing();
   
   public MouseCircles2()
   {
      JFrame frame = new JFrame("Mouse Droppings");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      draw.addMouseListener(new ClickHandler());
      frame.add(draw);
      frame.setSize(300,100);
      frame.setVisible(true);
   }
   
   class ClickHandler extends MouseAdapter
   {
      public void mouseClicked (MouseEvent e)
      {
         x = e.getX();
         y = e.getY();
         draw.repaint();
      }
   }
      
   class Drawing extends JComponent
   {
      public void paint(Graphics g)
      {
         if (x != -1)
            g.fillOval(x - RADIUS, y - RADIUS, 2 * RADIUS, 2 * RADIUS);
      }
   }
   
   public static void main(String[] args)
   {
      new MouseCircles2();
   }
} 