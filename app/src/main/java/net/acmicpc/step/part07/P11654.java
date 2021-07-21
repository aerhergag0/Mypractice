package net.acmicpc.step.part07;

import java.util.Scanner;

//알파벳 소문자,대문자,숫자0-9중 하나가 주어질때, 주어진 글자의 아스키 코드 값을 출력
public class P11654 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String X = sc.nextLine();
    int X2 = X.charAt(0);
    System.out.println(X2);
  }
}
