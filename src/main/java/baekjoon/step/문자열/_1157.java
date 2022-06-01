package baekjoon.step.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1157 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
		String words = bw.readLine().toUpperCase();
		char[] alphabet = new char[26];
		for(int i = 0; i < words.length(); i++) {
			alphabet[words.charAt(i) - 65]++;
		}

		int max = -1;
		char result = '?';
		for(int i = 0; i < alphabet.length; i++) {
			if(max < alphabet[i]) {
				max = alphabet[i];
				result = (char)(i + 65);
			}else if(max == alphabet[i]){
				result = '?';
			}
		}
		System.out.println(result);
	}

}
