package baekjoon.step.if문;

import java.util.Scanner;

public class _8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp=a;
		int sum=0;
		for(int i = 1; i <=a; i++) {
			sum += temp;
			temp--;
		}
		System.out.println(sum);
		sc.close();
	}
}
