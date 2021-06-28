package net.acmicpc.step.part02;

import java.util.Scanner;

public class P2884 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int M = scanner.nextInt();

    if(M<45) {
      if(H == 0) {
        System.out.printf("%d %d", 23 , (M-45)*(-1));
      }
      else{
        System.out.printf("%d %d",(H-1),(M-45)*(-1) );
      }

    }
    else {
      System.out.printf("%d %d", H ,(M-45));
    }

  }
}
