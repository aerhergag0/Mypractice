package net.acmicpc.step.part03;
//테스트케이스 T를 받고 T개수 만큼 두정수 A,B를 받아 A+B를 각 줄마다 출력한다.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class P15552{
  public static void main(String[] args) throws IOException { // IOException도 import해주어야함

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    // 선언 scanner역할
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    // 선언 print역할
    int T = Integer.parseInt(br.readLine()); // T값을 받고 정수로 변환한다.

    for(int i=0; i<T ; i++) {
      String inputtext = br.readLine();
      String[] saveAnswer = inputtext.split(" "); // 저장값을 공백마다 끊기

      int a = Integer.parseInt(saveAnswer[0]);
      int b = Integer.parseInt(saveAnswer[1]);

      bw.write(a+b + "\n");
    }

    bw.close();
  }
}
