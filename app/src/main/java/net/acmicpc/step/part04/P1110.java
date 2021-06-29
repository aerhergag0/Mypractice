package net.acmicpc.step.part04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// N이 주어질때, 10보다 작으면 0을붙여 두자리수로 만든후 각자리수를 더한다
// 그다음 주어진 수의 가장 오른쪽 수와 앞에서 구한 합의 오른쪽 자리수를 이어붙여 새수를 만든다.
// ex) N=26일때 2+6=8 다음수 68, 6+8=14 다음수 84, 8+4=12 다음수 42,4+2=6 다음수 26
// 4번만에 돌아왔으니 싸이클은 4이다. N의 싸이클을 구하라.
public class P1110 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int ans =0, count=0;

    ans = N;
    do {
      if(ans<10)
      {
        ans = ans*11;
      }
      else
      {
        ans = ((ans%10)*10) + ((ans%10)+(ans/10)%10);

      }

      count++;
    } while(ans == N);
    System.out.print(count);
  }
}
