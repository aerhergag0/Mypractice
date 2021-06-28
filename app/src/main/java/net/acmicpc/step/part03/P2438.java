package net.acmicpc.step.part03;
// 첫재쭐에는 별1개, N번째 줄에는 별 N개 출력
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2438 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    for (int i=1; i<=N; i++) {
      for (int j=1; j<=i; j++) {
        bw.write("*");
      }
      bw.write("\n");
    }
    bw.close();
  }
}
