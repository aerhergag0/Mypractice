package net.acmicpc.step.part03;
// 자연수 N을 받고 N부터 1까지 출력하기.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2742 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    for (int i=0 ; i < N ; i++) {
      bw.write(N-i + "\n");
    }

    bw.close();
  }
}
