package baekjoon.step.기본수학2;

import java.util.Scanner;

public class _1929 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		//if(input1 <= 1) return;

		//true 면 소수
		boolean []arr = new boolean[input2+1];
		arr[0] = arr[1]	= false;
		
		for(int i = 2; i < arr.length; i++) {//전체 값을 true로 바꿔줌
			arr[i] = true;
		}
		
		for(int i = 2; i*i<= input2; i++) {
			for(int j = i*i; j<= input2; j+=i) {
				arr[j] = false;
			}
		}
		for(int i = input1; i < arr.length; i++) {
			if(arr[i] == true) 
				System.out.println(i);
		}
		
	}
}
