package com.javastudy.chap6;
// 메서드 명 shuffle, 기능은 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복해 뒤섞이게 한다. 처리한 배열을 반환한다.
// 반환타입 int[]
// 매게변수 int[] arr - 정수값이 담긴 배열
class Exercise6_20 {

	public static int[] shuffle(int[] arr) {
		//유효성 검사
		if(arr == null || arr.length==0)
			return arr;

		for (int i=0; i< arr.length; i++) {
			int j = (int)(Math.random()* arr.length);
			// arr[i] 과 arr[j] 의 값을 바꾼다.
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		return arr;
	}

	public static void main (String[] args) {
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}
