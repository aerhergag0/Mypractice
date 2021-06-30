package net.acmicpc.step.part05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//9개의 서로다른 자연수가 주어졌을때 , 이들 중 최대값을 찾고
//그 최대값이 몇번째 수인지 구하라.
public class P2562 {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    int[] arr= new int[9];

    for(int i=0; i<9; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    int max =0;
    int index =0;

    for(int i=0; i<9; i++) {
      if(max<=arr[i]) {
        max = arr[i];
        index =i+1;}
    }

    bw.write(max +"\n");
    bw.write(index + "\n");
    bw.flush();
    bw.close();

  }
}
