package baekjoon.step.배열;

import java.util.Scanner;

public class _10818 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		int[] arr = new int[inputNum];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int min = 0, max = 0;
		min = arr[0];
		max = arr[0];
		for(int i = 0; i < arr.length-1; i++) {
			
			if(min > arr[i+1]) {
				min = arr[i+1];
			}if(max<arr[i+1]) {
				max = arr[i+1];
			}
		}
		System.out.println(min+ " " + max);
	}
}

