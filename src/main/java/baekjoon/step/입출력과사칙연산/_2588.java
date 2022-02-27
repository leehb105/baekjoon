package baekjoon.step.입출력과사칙연산;

import java.util.Scanner;

public class _2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp;
		int c = b;
		while(c>0) {
			temp = c%10;
			System.out.println(a * temp);
			c = c/10;
		}
		System.out.print(a*b);
		sc.close();
	}
}
