package net.acmicpc.step.part05;
// 세 수 ABC 가 각줄에 주어질때, 세수의 곱에 0부터 9까지 각각 몇번 쓰였는가  매줄 출력

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2577 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int A = Integer.parseInt(br.readLine());
    int B = Integer.parseInt(br.readLine());
    int C = Integer.parseInt(br.readLine());
    int ABC = A*B*C;
    int[] arr = new int[10];

    while(ABC!=0) {
      arr[ABC%10]++;
      ABC/=10;
    }
    for(int i=0; i<10; i++) {
      bw.write(arr[i]+ "\n");      
    }

    bw.flush();
    bw.close();
  }
}
