package baekjoon.step.if문;

import java.util.Scanner;

public class _2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int temp = t;
		for(int i = 1; i<=t; i++) {
			for(int j = temp-1; j>0; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k<i; k++) {
				System.out.print("*");
				
			}
			temp--;
			System.out.println();
		}
		sc.close();
	}
}
