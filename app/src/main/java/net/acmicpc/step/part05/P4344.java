package net.acmicpc.step.part05;
// 첫줄에 테스트케이스 수 C가 주어진다.
// 둘째줄에는 첫 수 N이 학생의 수로 주어지고 , 이어서 N명의 점수가 주어진다.
// 각줄마다 평균을 넘는 학생의 비율을 반올림하여 소수점 셋째자리까지 구하라.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P4344 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int C = Integer.parseInt(br.readLine());
    float perarr[] = new float[C]; // 답을 저장할 배열
    float sumarr[] = new float[C];
    float avgarr[] = new float[C];

    for(int i=0; i<C; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine()," ");
      int N = Integer.parseInt(st.nextToken());
      int arr[] = new int[N]; // 각줄마다 점수를 저장할 배열

      int j=0;
      int sum=0;

      while(st.hasMoreTokens()) {
        arr[j] = Integer.parseInt(st.nextToken());
        j++;
      }
      for(j=0; j<arr.length; j++) {
        sum += arr[j];
        sumarr[j] = sum;
      }
      //arr의 평균 구하기
      avgarr[i] = sumarr[i]/N;

    } //배열에 담는 반복문끝
    for(int i=0; i<C; i++)
      bw.write(Integer.parseFloat(avgarr[i]));
  }

}
