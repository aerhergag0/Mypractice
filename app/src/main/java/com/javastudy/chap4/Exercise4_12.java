package com.javastudy.chap4;
// 구구단의 일부 출력
public class Exercise4_12 {
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=3; j++) {
				System.out.printf("%d*%d=%d%n",i,j,i*j);
			}
			System.out.println();
		}
	}
}