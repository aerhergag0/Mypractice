package net.acmicpc.step.part07;
// 알파벳 소문자로만 이루어진 단어 S가 주어진다.
// 각 알파벳에 대해 단어에 포함되어 있으면 처음 등장하는 위치를, 포함되어 있지 않으면 -1을 출력한다.
import java.util.Scanner;

public class P10809 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();

    int arr[] = new int[S.length()]; // 문자저장배열
    int alphabet[] = new int[26]; //0:a 1:b 2:c .. 25:z
    //배열에 일단 -1값 저장
    for(int i=0; i<alphabet.length; i++) {
      alphabet[i] = -1;
    }

  }
}
