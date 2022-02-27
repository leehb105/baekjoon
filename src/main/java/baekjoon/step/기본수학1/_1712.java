package baekjoon.step.기본수학1;

import java.util.Scanner;

public class _1712 {
	public static void main(String[] args){
		Scanner sc = new Scanner((System.in));
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(c <= b)
			System.out.println(-1);
		else {
			int x = (a / (c-b))+1;
			System.out.println(x);
		}
	}
}
