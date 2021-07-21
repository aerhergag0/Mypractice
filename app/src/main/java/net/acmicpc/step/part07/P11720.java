package net.acmicpc.step.part07;

import java.util.Scanner;

//N개의 숫자가 공백없이 쓰여있고, 이 숫자를 모두 합해서 출력
//첫줄에 숫자의 개수 N, 둘째 줄에 숫자 N개가 공백없이 주어진다.
public class P11720 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.nextLine()); // 숫자의 개수 N
    String X = sc.nextLine(); // 문자열 X

    int sum=0;
    for(int i=0; i<N; i++) {
      sum += X.charAt(i)-'0';
    }
    System.out.println(sum);
  }
}
