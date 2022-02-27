package baekjoon.step.문자열;

import java.util.Scanner;

public class _11720 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String input = sc.next();
		int sum = 0;
		for(int i = 0; i< a; i++) {
			sum += input.charAt(i) -'0';
		}
		
		System.out.println(sum);
	}
}
