package net.acmicpc.step.part05;
//받을 개수 N 이후 N개 만큼 정수값을 받고 받은 점수/최대값*100의 새 배열을 만든 후 평균값 출력
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1546 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int score[] = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0; i<N; i++) {
      score[i] = Integer.parseInt(st.nextToken());
    }

    int arraymax = 0;
    int max = 1;

    for(int i=0; i<N; i++) {      
      if(arraymax < score[i]) {
        arraymax = score[i];
      }
    }

    max = arraymax;
    //최대값 찾기 임시


    float newscore[] = new float[N];
    for(int i=0; i<N; i++) {
      newscore[i] = (float)score[i]*100/max;
    }
    //새점수 평균값구하기
    float answer = 0;
    for(int i=0; i<newscore.length; i++) {
      answer += newscore[i];
    }

    bw.write(Float.toString(answer/N));
    bw.flush();
    bw.close();
  }
}
