package com.javastudy;
// 문자열이 숫자인지 판별
class   Exercise4_13 {
	public static void main(String[] args) {
		String value = "123334";
		char ch = ' ';
		boolean isNumber = true;
		//   반복문과   charAt(int   i)를   이용해서   문자열의    문자를
		//   하나씩   읽어서   검사한다.
		for (int i = 0; i < value.length(); i++) {
			ch = value.charAt(i);
			if (!(ch >= '0' && ch <= '9')) {
				{
					isNumber = false;
					break;
				}
			}
		}
		if (isNumber) {
			System.out.println(value + "는   숫자입니다.");
		} else {
			System.out.println(value + "는   숫자가   아닙니다.");
		}
	}       //   end   of    main
	//   end   of    class
}