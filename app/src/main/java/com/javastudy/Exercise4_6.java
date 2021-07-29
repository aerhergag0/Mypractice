package com.javastudy;
// 두개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력
public class Exercise4_6 {

  public static void main(String[] args) {

    int dice1=0;
    int dice2=0;
    for(int i=1; i<=6; i++) {
      dice1 = i;
      for(int j=1; j<=6; j++) {
        dice2 = j;
        if((dice1+dice2) == 6)
          System.out.printf("(%d %d) ",dice1,dice2);
      }
    }
  }

}
