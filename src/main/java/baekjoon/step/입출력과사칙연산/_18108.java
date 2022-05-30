package baekjoon.step.입출력과사칙연산;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _18108 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int year = Integer.parseInt(br.readLine());
		
		sb.append(year-543);
		bw.write(sb.toString());

		bw.flush();
        bw.close();
        br.close();
	}

}
