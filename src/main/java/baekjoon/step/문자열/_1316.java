package baekjoon.step.문자열;

import java.util.Scanner;

public class _1316 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int count = sc.nextInt();
		int result = 0;

		for(int i = 0; i < count; i++) { //입력횟수별
			if(check() == true) {
				result++;
			}
		}
		System.out.println(result);
	}
	static boolean check() {
		boolean[] alphabet = new boolean[26];
		int prev = 0;
		String input = sc.next();
		
		for(int i = 0; i < input.length(); i++) {
			int now = input.charAt(i); //현재문자 저장
			if(prev != now) { //현재문자와 이전 문자가 같지 않다면
				//근데 그 문자가 처음 나왔다면
				if(alphabet[now - 97] == false) {
					alphabet[now - 97] = true;
					prev = now;
				}else {
					return false;
				}
			}
		}
		
		return true;
	}
	
}
