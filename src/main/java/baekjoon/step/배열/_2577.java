package baekjoon.step.배열;

import java.util.Scanner;

public class _2577 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int mul = a * b * c;
		int[] arr = new int[10];
		
		while(mul > 0) {
			int temp = mul % 10;
			mul = mul / 10;
			arr[temp] += 1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}

