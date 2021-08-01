package com.javastudy.chap5;
//거스름돈을 몇 개의 동전으로 지불할수 있는지 계산
class   Exercise5_6   {
	public   static    void   main(String   args[])    {
		//   큰   금액의   동전을   우선적으로   거슬러    줘야한다.
	    int[]   coinUnit   =    {500,   100,   50,    10};
		int   money   =    2680;
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++) {
			System.out.printf("%d원 : %d%n",coinUnit[i],money/coinUnit[i]);
			money = money- (money/coinUnit[i]*coinUnit[i]);
		}
	}   //   main
}
