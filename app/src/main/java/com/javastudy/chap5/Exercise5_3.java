package com.javastudy.chap5;
//arr에 담긴 값을 전부 더하는 프로그램
class   Exercise5_3 {
	public   static    void   main(String[]   args) {
		int[]   arr   =    {10,   20,   30,    40,   50};
		int   sum   =   0;

		for(int i=0; i< arr.length; i++) {
			sum += arr[i];
		}

		System.out.println("sum="+sum);
	}
}
