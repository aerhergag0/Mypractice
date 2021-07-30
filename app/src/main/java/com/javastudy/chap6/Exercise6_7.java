package com.javastudy.chap6;
// getDistance()를 MyPoint클래스의 인스턴스에서 적용하라.
class MyPoint {
	int x;
	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	double getDistance(double x1, double y1) {
		return Math.sqrt((y1-y)*(y1-y) + (x1-x)*(x1-x));
	}
}

class Exercise6_7 {
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1, 1);
//   p와   (2,2)의   거리를    구한다.
		System.out.println(p.getDistance(2, 2));
	}
}
