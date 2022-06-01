package baekjoon.step.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
		String input = bw.readLine().toUpperCase();
		StringTokenizer st = new StringTokenizer(input);
		
		System.out.println(st.countTokens());
	}

}
