package com.javastudy.chap4;
//숫자 맞추기 게임
class   Exercise4_14 {
	public static void main(String[] args) {
		//   1~100사이의   임의의   값을   얻어서   answer 에   저장한다.
		int answer = (int)((Math.random()*100))+1;
		int input = 0;
		int count = 0;
		//   화면으로    부터   사용자입력을   받기   위해서   Scanner클래스   사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
			count++;
			System.out.print("1과   100사이의    값을   입력하세요   :");
			input = s.nextInt();   //    입력받은    값을   변수    input에   저장한다.

			if(input == answer) {
				System.out.println("맞췄습니다");
				System.out.printf("시도횟수는 %d번입니다.",count);
				break;
			}
			else {
				if(input<answer)
					System.out.println("더 큰수를 입력하세요.");
				else
					System.out.println("더 작은수를 입력하세요.");
			}

		} while (true);
	}
}