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
    int[] arr2 = new int[10];
    for(int i=0; i<arr.length; i++) {
      arr[i] = Integer.parseInt(br.readLine());
      arr2[i] = (arr[i])%42; // 나머지를 넣은 배열
    }

    int numcount=0;

    // 배열 중 0이 있으면 증가, 1이 있으면 증가, 없으면 안증가 .. 반복
    for(int i=0; i<42; i++) {
      loop : for(int j=0; j<10; j++) {
        if(arr2[j] == i) {
          numcount++;
          break loop; }
      }
    }

    bw.write(Integer.toString(numcount));
    bw.flush();
    bw.close();
  }
}
