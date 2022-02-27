package baekjoon.step.기본수학1;

import java.util.Scanner;

public class _2292 {
	public static void main(String[] args){
		Scanner sc = new Scanner((System.in));
		int count= 1, temp= 1, range= 2;
		temp = sc.nextInt();
		if(temp == 1) {
			System.out.println(1);
		}else {
			while(temp >= range) {
				range = range + (6 * count);
				count++;
			}
			System.out.println(count);
		}
		
	}
}
