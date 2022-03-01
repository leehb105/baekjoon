package baekjoon.recusion;

import java.util.Scanner;

public class _2447 {
	public  int Fact(int num) {
//		if() {
//			return 1;
//		}
		return num * Fact(num-1);
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		_2447 m = new _2447();
		
//		System.out.println(m.Fact(3));
		m.Fact(sc.nextInt());

	}
}
