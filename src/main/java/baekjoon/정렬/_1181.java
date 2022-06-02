package baekjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class _1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int count = Integer.parseInt(br.readLine());
		String[] arr = new String[count];
		//입력
		for(int i = 0; i < count; i++) {
			arr[i] = br.readLine();
		}
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);					
				}
				return o1.length() - o2.length();
			}
			
		});
		
		sb.append(arr[0] + "\n");
		for(int i = 1; i < arr.length; i++) {
			if(!arr[i].equals(arr[i - 1])) {
				sb.append(arr[i] + "\n");
			}
		}
		System.out.println(sb.toString());

	}

}
