package com.javastudy.chap6;
// 주어진 문자열이 모두 숫자로만 이루어져 있는지 확인
// 모두 숫자로 이루어져 있으면 true 아니면 false
// 유효성 검사로 null, 또는 빈문자열 "" 이면 false 반환
class   Exercise6_22   {
	public static boolean isNumber(String str) {
		if(str.equals(null) || str.equals(""))
			return false;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) <'0' || str.charAt(i)>'9')
				return false;
		}
		return true;
	}

	public   static    void   main(String[]   args)    {
		String   str   =   "123";
		System.out.println(str+"는   숫자입니까?   "+isNumber(str));
		str   =   "1234o";
		System.out.println(str+"는   숫자입니까?   "+isNumber(str)); }
}
