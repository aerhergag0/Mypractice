package net.acmicpc.step.part04;
// 여러케이스 A B를 입력받고 A+B를 while문으로 출력
// 0 0이 들어오면 출력을 멈춘다
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P10952 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    loop : while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine()," ");
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());

      if(A==0 && B==0)
        break loop;

      bw.write((A+B) +"\n");
    }


    bw.flush();
    bw.close();
  }

}
