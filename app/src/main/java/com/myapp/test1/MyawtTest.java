package com.myapp.test1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class MyawtTest extends Frame{

  Button btn1,btn2,btn3;

  public MyawtTest(String str) {
    super(str);
    Panel panel1 = new Panel();
    Label label1 = new Label();

    btn1 = new Button("1");
    btn2 = new Button("2");
    btn3 = new Button("3");
    Label lbl1 = new Label("ID");
    Label lbl2 = new Label("PASSWORD");
    TextField txt1 = new TextField("ID",20);
    TextField txt2 = new TextField(20);

    txt2.setEchoChar('*'); // 비번 별표

    add(panel1);
    panel1.add(btn1);panel1.add(btn2);panel1.add(btn3);
    btn3.setEnabled(false);

    panel1.add(lbl1);
    panel1.add(txt1);
    panel1.add(lbl2);
    panel1.add(txt2);
    setSize(500,500);
    setVisible(true);
  }


  public static void main(String[] args) {
    MyawtTest mat = new MyawtTest("제목");
  }
}
