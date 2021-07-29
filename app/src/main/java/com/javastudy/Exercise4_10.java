package com.javastudy;

// num의 각자리의 합을 더한 결과를 출력, 문자열로 변환하지 않는다.
class Exercise4_10   {
	public static void main(String[] args) {
		int   num   =   123456;
		int   sum   =   0;
		while(num>0) {
			sum += num%10;
			num /=10;
		}

		System.out.println("sum="+sum); }
}