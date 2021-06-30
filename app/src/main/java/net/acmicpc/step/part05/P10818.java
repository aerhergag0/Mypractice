package net.acmicpc.step.part05;
// n개의 정수가 주어질때 최솟값과 최대값 구하기
// 첫줄에 정수 N, 둘째줄에는 N개의 정수가 띄어져있다.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P10818 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    for(int i=0; i<N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    int max=-1000001, min=1000001;

    for(int i=0; i<N; i++) {
      if(max<arr[i])
        max=arr[i];
    }
    for(int i=0; i<N; i++) {
      if(min>arr[i])
        min=arr[i];
    }

    bw.write(min + "\n");
    bw.write(max + "\n");

    bw.flush();
    bw.close();
  }

}
