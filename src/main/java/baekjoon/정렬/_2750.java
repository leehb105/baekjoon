package baekjoon.정렬;

import java.util.Scanner;

public class _2750 {
	public static void main(String[] args){
		Scanner sc = new Scanner((System.in));
		int size = sc.nextInt();
		int []arr = new int[size];
	
		for(int i = 0; i < arr.length; i++) {//숫자 입력 
			arr[i] = sc.nextInt();
		}
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {//숫자 입력 
			System.out.println(arr[i]);
		}
		
	}
}
