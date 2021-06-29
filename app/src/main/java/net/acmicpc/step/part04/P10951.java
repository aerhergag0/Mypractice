package net.acmicpc.step.part04;
// A B를 입력받고 A+B를 출력? 
// EOF : 더이상 읽을 데이터가 없을때 종료
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P10951 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    String S = "";

    while((S = br.readLine())!=null) {

      st = new StringTokenizer(S," ");
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());

      bw.write((A+B) + "\n");
    }

    bw.flush();
    bw.close();
  }
}
