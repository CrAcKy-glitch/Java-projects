import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.plaf.FontUIResource;

import java.io.*;

public class MouseEv extends JFrame {

  private JLabel label;
  private JPanel mouseover;

  MouseEv() {
    super("Mouse Events");

    mouseover = new JPanel();
    mouseover.setBackground(Color.WHITE);
    label = new JLabel("default or whatever");
    add(mouseover, BorderLayout.CENTER);
    add(label, BorderLayout.NORTH);
    tHand ob = new tHand();

    mouseover.addMouseListener(ob);
    mouseover.addMouseMotionListener(ob);

  }

  public static void main(String[] args) throws Exception {

    MouseEv ob = new MouseEv();
    ob.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ob.setSize(400, 150);
    ob.setVisible(true);

  }

  class tHand implements MouseListener, MouseMotionListener {

    public void mouseClicked(MouseEvent eve) {
      label.setText("you clicked the mouse");
    }

    public void mouseDragged(MouseEvent eve) {
      label.setText("you are dragging the mouse");

    }

    public void mousePressed(MouseEvent eve) {
      label.setText("you pressed the mouse");
    }

    public void mouseMoved(MouseEvent eve) {
      label.setText("you are moving the mouse at" + eve.getX() + "," + eve.getY());
    }

    public void mouseEntered(MouseEvent eve) {
      mouseover.setBackground(Color.WHITE);
      label.setText("the mouse is inside the pane");
    }

    public void mouseReleased(MouseEvent eve) {
      label.setText("you released your mouse");
    }

    public void mouseExited(MouseEvent eve) {
      mouseover.setBackground(Color.RED);
      label.setText("the mouse has exited the pane ERROR 404");
    }
  }

}
