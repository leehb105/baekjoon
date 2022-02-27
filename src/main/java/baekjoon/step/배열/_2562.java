package baekjoon.step.배열;

import java.util.Scanner;

public class _2562 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//int inputNum = sc.nextInt();
		int[] arr = new int[9];
		//9개 입력
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int num = 1;
		//최댓값 찾기
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				num = i+1;
			}
			
		}
		System.out.println(max);
		System.out.println(num);
	}
}

