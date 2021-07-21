package net.acmicpc.step.part06;
// d(N)는 양의정수N에대해 N과 N의 각자리수를 더하는 함수
// d(N)으로 나오는 값을 생성자라고 하고, 이 생성자가 없는 숫자를 셀프 넘버라 한다
// 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하라
public class P4673 {

  public static void main(String[] args) {
    P4673 tt = new P4673();
    tt.checkSelfNum(100);
  }
  public void checkSelfNum(int count) {
    boolean[] checknum = new boolean[count+1];
    int sum=0;
    for(int i=1; i<=count; i++) {
      while(i/10 != 0 ) {
        sum = sum + i%10;

      }
      i=i/10;
      sum=0;
      sum= sum+i;
      checknum[sum]=false;
    }

    for(int i=0; i<=checknum.length; i++) {
      if(checknum[i]==true) {
        System.out.println(i);
      }
    }

  }

}
