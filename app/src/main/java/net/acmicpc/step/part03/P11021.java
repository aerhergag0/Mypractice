package net.acmicpc.step.part03;
// A,B를 입력받고 T는 반복회수 A+B를 출력하기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P11021 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());


    for(int i = 0; i<T ;i++) {
      String S = br.readLine();
      String[] savedAnswer = S.split(" ");

      int A = Integer.parseInt(savedAnswer[0]);
      int B = Integer.parseInt(savedAnswer[1]);
      int Answer = A+B;
      bw.write("Case #"+(i+1)+": "+Answer+"\n");
    }
    bw.close();
  }
}
