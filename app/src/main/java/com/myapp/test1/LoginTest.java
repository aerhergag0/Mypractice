package com.myapp.test1;

import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class LoginTest {
  public LoginTest() {
    Panel panellogin = new Panel();
    Label label1 = new Label("ID : ");
    Label label2 = new Label("PW : ");
    TextField tf1 = new TextField(20);
    TextField tf2 = new TextField(20);
    tf2.setEchoChar('*');

  }


  public static void main(String[] args) {  }
}
