package com.javastudy.chap6;

public class Exercise6_23 {
	// int배열의 값중 가장 큰 값을 반환한다.
	// 배열이 null 이거나 크기가 0인경우 -999999를 반환한다.
	public static int max(int[] arr) {
		if(arr == null || arr.length==0)
			return -999999;
		int tmp = 0;
		for(int i=0; i<arr.length; i++) {
			if(tmp<arr[i])
				tmp = arr[i];
		}
		return tmp;
	}

	public static void main(String[] args) {
		int[] data = {3, 2, 9, 4, 7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[]{}));   //    크기가   0인   배열 }
	}
}
