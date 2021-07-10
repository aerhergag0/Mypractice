package com.myapp.test1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Myjframetest extends JFrame{

  public Myjframetest() {
    super("테스트");

    JPanel buttonPanel = new JPanel();
    JButton btn = new JButton("Button");
    buttonPanel.add(btn);

    setLocation(150,200);
    setSize(500,300);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Myjframetest();
  }
}
