package baekjoon.step.문자열;

import java.util.Scanner;

public class _2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = sc.nextInt(); //테스트케이스 개수
		for(int i = 0; i < t; i++){
			int r = sc.nextInt();//반복할 횟수
			String s = sc.next();
			

			for(int j = 0; j < s.length(); j++) {
				for(int k = 0; k < r; k++) {
					sb.append(s.charAt(j));
				}
			}
			sb.append("\n");
				
		}
		System.out.println(sb);
	}

}
