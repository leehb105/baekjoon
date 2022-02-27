package baekjoon.step.if문;

import java.util.Scanner;

public class _1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b[] = a.split(" ");
		int num1 = Integer.parseInt(b[0]);
		int num2 = Integer.parseInt(b[1]);
		if(num1 > num2) {
			System.out.print(">");
		}else if(num1<num2) {
			System.out.print("<");
		}else {
			System.out.print("==");
		}
		sc.close();
	}
}
