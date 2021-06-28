package net.acmicpc.step.part03;
import java.io.BufferedReader;
// 자연수 N이 주어졌을때, 1부터 N까지 한줄에 하나씩 출력
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2741 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    for (int i =0; i<N ; i++) {
      bw.write(i+1 + "\n");
    }

    bw.close();
  }

}
