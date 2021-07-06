package net.acmicpc.step.part05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 첫줄에 테스트 케이스 개수가 주어지고 각 케이스 마다 한줄로 구성
// O는 1점 X는 0점으로 OX퀴즈의 점수를 구할것, 단 연속 점수는 추가로 1점이 붙는다.
// 예로 OOXXOOXOOO 는 1+2+1+2+1+2+3 이다.
public class P8958 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    String answers[] = new String[N];
    for(int i=0; i<N; i++) {
      answers[i] = br.readLine();
    }

    int score[] = new int[N];
    for(int i=0; i<N; i++) {
      int combo=0;
      for(int j=0; j<answers[i].length(); j++) {

        if(answers[i].charAt(j)=='O') {
          combo++;
          score[i] += combo;
        }
        else
          combo=0;
      }
    }
    for(int i=0; i<N; i++) {
      bw.write(Integer.toString(score[i])+"\n");
    }


    bw.flush();
    bw.close();
  }
}
