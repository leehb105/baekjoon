package baekjoon.정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.valueOf(br.readLine());
		int[] counting = new int[10001];
		int[] arr = new int[n];
		
		//입력값 counting배열에 갯수 지정
		for(int i = 0; i < n; i++) {
			int input = Integer.parseInt(br.readLine());
			counting[input]++;
		}
		for(int i = 1; i < counting.length; i++) {
			while(counting[i] > 0) {
				sb.append(i).append("\n");
				counting[i]--;
				
			}
		}

		bw.write(sb.toString());
		bw.flush();
        bw.close();
        br.close();
	}

}
