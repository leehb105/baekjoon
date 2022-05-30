package baekjoon.step.if문;

import java.util.Scanner;

public class _2525 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int timer = sc.nextInt();
	
		h += timer / 60;
		m += timer % 60;
		
		if(m > 59) {
			h++;
			m -= 60;
		}
		if(h >= 24) {
			h -= 24;
			
		}

		System.out.println(h + " " + m);


	}

}
