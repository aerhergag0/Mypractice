package net.acmicpc.step.part06;
// 정수 n개가 주어졌을때, n개의 합을 구하는 함수 작성
// long sum(int[] a); 클래스 이름 Test
// a:합을 구해야하는 정수 n개가 저장되어있는 배열
// 리턴값 : a에 포함되어있는 정수 n개의 합
public class P15596 {
  public class Test {
    long sum(int[] a) {
      long ans = 0;
      for(int i=0; i<a.length; i++) {
        ans += a[i];
      }
      return ans;
    }
  }
}
