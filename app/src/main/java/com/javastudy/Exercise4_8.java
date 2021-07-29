package com.javastudy;

public class Exercise4_8 {
  public static void main(String[] args) {
    int x=0;
    int y=0;

    for(int i=0; i<=10; i++) {
      x=i;
      for(int j=0; j<=10; j++) {
        y=j;
        if((2*x+4*y)==10)
          System.out.printf("x=%d, y=%d%n",x,y);
      }
    }

  }
}
