package net.acmicpc.step.part02;

import java.util.Scanner;

public class P2753 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputyear = sc.nextInt();

    if((inputyear%4) ==0) {
      if((inputyear%100) == 0) {
        if((inputyear%400)==0) 
          System.out.println("1");
        else
          System.out.println("0");
      }
      else {
        System.out.println("1");
      }
    }
    else {
      System.out.println("0");
    }

    sc.close();

  }
}
