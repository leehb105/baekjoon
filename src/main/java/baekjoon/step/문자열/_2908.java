package baekjoon.step.문자열;

import java.util.Scanner;

public class _2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = Integer.valueOf(new StringBuilder().append(sc.nextInt()).reverse().toString());
		int num2 = Integer.valueOf(new StringBuilder().append(sc.nextInt()).reverse().toString());
		int max = num1 > num2 ? num1 : num2;
		
		System.out.println(max);
	}

}
