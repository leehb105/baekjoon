package baekjoon.step.문자열;

import java.util.Scanner;

public class _10809 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] input = new char[100];
		int[] alphabets = new int[26];
		//26개의 배열에 -1입력
		for(int i=0; i < alphabets.length; i++) {
			alphabets[i] = -1;
		}
		String s = sc.nextLine();//s단어가 주어진다
		//s의 갯수만큼 input배열에 한 자씩 입력한다
		for(int i = 0; i < s.length(); i++) {
			input[i] = s.charAt(i);
			//System.out.println(input[i]);
		}
		for(int i = 0; i < input.length; i++) {
			for(int j = i+1; j<input.length; j++) {
				if(input[i] == input[j]) {
					input[j] = '0';
				}
			}
		}
		for(int j = 0; j < alphabets.length; j++) {
			for(int i = 0; i < s.length(); i++) {
				if(input[i] == (char)(j+97)) {
					alphabets[j] = i;
				}
			}
		}
		for(int i=0; i < alphabets.length; i++) {
			//System.out.print((char)(i+97)+"/");
			System.out.print(alphabets[i] + " ");
			//System.out.println();
		}
		/*필요한거
		 * 1. 입력된 문자열에 대한 n개의 배열->char형
		 * 2. a~Z까지의 26개의 배열->정수형
		 * 3. input배열의 각 인덱스 들이 몇번째에 위치한지 alphabets배열에 입력한다
		 * 		-> input의 배열개수만큼 반복한다, 
		 * 		-> 0번째 'b'의 경우 alphabets의 1번째 배열이므로 
		 * 		-> alphabets의 1번째 배열을 input의 해당 순번 인덱스를 입력한다
		 * */

	}
}
