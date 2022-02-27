package baekjoon.recusion;

import java.util.Scanner;

public class _10870 {
	public static int calculate(int num) {
		int result = 0;
		if(num <= 1) {
			return num;
		}else {
			result = calculate(num -1) + calculate(num -2);
			return result;
		}
	}
	public static void main(String[] args) {
		int inputNum;
		Scanner sc = new Scanner(System.in);
		inputNum = sc.nextInt();		
		System.out.println(calculate(inputNum));
    }
}
