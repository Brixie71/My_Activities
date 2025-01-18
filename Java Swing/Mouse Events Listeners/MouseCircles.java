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

public class MouseCircles implements MouseListener
{
   int x = -1;
   int y;
   static final int RADIUS = 10;
   Drawing draw = new Drawing();
   
   public MouseCircles()
   {
      JFrame frame = new JFrame("Mouse Droppings");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      draw.addMouseListener(this);
      frame.add(draw);
      frame.setSize(300,100);
      frame.setVisible(true);
   }
   
   public void mouseClicked (MouseEvent e)
   {
      x = e.getX();
      y = e.getY();
      draw.repaint();
   }

   public void mousePressed (MouseEvent e)
   {
   }

   public void mouseReleased (MouseEvent e)
   {
   }

   public void mouseEntered (MouseEvent e)
   {
   }

   public void mouseExited (MouseEvent e)
   {
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
      new MouseCircles();
   }
} 