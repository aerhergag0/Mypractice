package net.acmicpc.step.part03;
// N과 X를 받고 수열A를 받은뒤 A에서 X보다 작은 수를 모두 출력하라.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P10871 {
  static StringTokenizer st;
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    st = new StringTokenizer(br.readLine());


    int N = Integer.parseInt(st.nextToken());
    int X = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i<N; i++) {
      int a = Integer.parseInt(st.nextToken());
      if (a<X) {
        bw.write(a + " ");
      }
    }
    
    bw.flush();
    bw.close();
  }
}


