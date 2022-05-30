package baekjoon.step.if문;

import java.util.Scanner;

public class _2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int total = 0;
		
		if(a == b && a == c && b == c) {
			total = 10000 + (a * 1000);
		}else if(a == b || a == c){
			total = 1000 + (a * 100);
		}else if(b == c) {
			total = 1000 + (b * 100);
		}else {
			total = Math.max(a, Math.max(b, c)) * 100;
		}
		System.out.println(total);
	}

}
//같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
//같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
//모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  