package net.acmicpc.step.part05;

// 수10개를 입력받는다, 각 수를 42로 나누고 서로 다른 나머지의 개수를 출력
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P3052 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] arr = new int[10];
    int[] arr2 = new int[42];
    for(int i=0; i<10; i++) {
      arr[i] = Integer.parseInt(br.readLine());
      arr2[i] = (arr[i])%42;
    }

    int numcheck=0;
    int numcount=0;



    bw.write(Integer.toString(numcount));
    bw.flush();
    bw.close();
  }
}
