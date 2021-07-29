package com.javastudy;
// 피보나치 수열의 10번째 수를 출력
public   class    Exercise4_11   {
	public   static    void   main(String[]   args)    {
		int   num1    =   1;
		int   num2    =   1;
		int   num3    =   0;
		System.out.print(num1+","+num2);
		for   (int    i   =   0   ;   i   <    8   ;   i++   )   {
			num3 = num1 + num2;
			System.out.print(","+num3);
			num1 = num2;
			num2 = num3;

		}
		}    //   end   of   main }
	}  //   end   of   class
