package com.myapp.test1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Notepad {
  public static void main(String[] args) {
    Notepad notepad = new Notepad();
    notepad.pad(); notepad.panel();

  }
  public void pad() {
    Frame frame = new Frame();
    frame.setTitle("Notepad");
    frame.setBounds(300, 300, 300, 300);
    frame.setVisible(true);
  }

  public void panel() {
    Panel panel = new Panel();
    panel.setBackground(Color.gray);
    setVisible(true);

  }
}


