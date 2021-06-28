package net.acmicpc.step.part03;

import java.util.Scanner;

public class P10950 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int counting = scanner.nextInt();
    int[] arrx = new int[100];
    int[] arry = new int[100];

    for(int i=0; i<counting; i++) {
      arrx[i] = scanner.nextInt();
      arry[i] = scanner.nextInt();
    }

    for(int i=0; i<counting; i++) {
      System.out.println(arrx[i] + arry[i]);
    }


    scanner.close();
  }
}
