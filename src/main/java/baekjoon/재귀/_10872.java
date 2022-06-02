package baekjoon.재귀;

import java.util.Scanner;

public class _10872 {
	public  int Fact(int num) {
		if(num == 1 || num == 0) {
			return 1;
		}
		return num * Fact(num-1);
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		_10872 m = new _10872();
		
		System.out.println(m.Fact(sc.nextInt()));

	}
}
