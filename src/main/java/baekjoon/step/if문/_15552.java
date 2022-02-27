package baekjoon.step.if문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _15552 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String t = br.readLine();
			int numt = Integer.parseInt(t);
			for(int i = 0; i < numt; i++) {
				String s = br.readLine();
				String[] arr = s.split(" ");
				int num1 = Integer.parseInt(arr[0]);
				int num2 = Integer.parseInt(arr[1]);
				String ans = Integer.toString(num1 + num2);
				bw.write(ans);
				bw.newLine();
			}
			br.close();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
