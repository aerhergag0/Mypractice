package com.javastudy.chap6;
// 두 점의 거리를 구하는 getDistance()를 완성하라.
public class Exercise6_6 {
	//   두   점   (x,y)와   (x1,y1)간의   거리를   구한다.
	static double getDistance (int x, int y, int x1, int y1) {
		return Math.sqrt((y1-y)*(y1-y) + (x1-x)*(x1-x));
	}


	public static void main (String args[]) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
}
