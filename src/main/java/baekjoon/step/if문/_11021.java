package baekjoon.step.if문;

import java.util.Scanner;

public class _11021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 1; i<=t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a+b;
			System.out.println("Case #"+i+": " + c);
		}
		sc.close();
	}
}
