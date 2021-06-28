package net.acmicpc.step.part03;

import java.util.Scanner;

public class P11022 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int testcaseNum = sc.nextInt();

    for(int i = 0 ; i < testcaseNum ; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.printf("Case #%d: %d + %d = %d\n",i+1,a,b,a+b);
    }

    sc.close();

  }
}