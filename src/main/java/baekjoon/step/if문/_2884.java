package baekjoon.step.if문;

import java.util.Scanner;

public class _2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		if(m < 45) {
			m = m+15;
			h--;
			if(h>=0) {
				System.out.println(h + " " + m);
			}else if(h < 0){
				h = 23;
				System.out.println(h + " " + m);
			}
		}else if(m >= 45) {
			m = m-45;
			System.out.println(h + " " + m);
		}
		sc.close();
	}
}
