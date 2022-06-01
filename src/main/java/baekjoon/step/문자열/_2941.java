package baekjoon.step.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int count = 0;
		for(int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if(i < input.length() - 1 && c == 'c') {
				if(input.charAt(i + 1) == '=' || input.charAt(i + 1) == '-') {
					i++;
				}
			}else if(i < input.length() - 1 && c == 'd') {
				if(input.charAt(i + 1) == '-') {
					i++;
				}else if(input.charAt(i + 1) == 'z' && i < input.length() - 2){
					if(input.charAt(i + 2) == '=') {
						i += 2;						
					}
				}
			}else if(i < input.length() - 1 && c == 'l') {
				if(input.charAt(i + 1) == 'j') {
					i++;
				}
			}else if(i < input.length() - 1 && c == 'n') {
				if(input.charAt(i + 1) == 'j') {
					i++;
				}
			}else if(i < input.length() - 1 && c == 's') {
				if(input.charAt(i + 1) == '=') {
					i++;
				}
			}
			else if(i < input.length() - 1 && c == 'z') {
				if(input.charAt(i + 1) == '=') {
					i++;
				}
			}
			count++;
		}
		System.out.println(count);
	}

}
