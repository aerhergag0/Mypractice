package net.acmicpc.step.part07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 문자열 S를 입력받고, 각 문자를 R번 반복하여 새 문자열 P를 만든 후 출력
// 첫줄에는 테스트케이스 개수 T, 반복회수 R과 문자열 S가 주어진다
public class P2675 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    int T = Integer.parseInt(br.readLine());

    for(int i=0; i<T; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int R = Integer.parseInt(st.nextToken());
      String S = st.nextToken();

      for(int j=0; j<S.length(); j++) {
        for(int k=0; k<R; k++ ) {
          bw.write(S.charAt(j));
          bw.flush();
        }
      }
    }// 테스트케이스 반복문
    bw.close();
  }

}
