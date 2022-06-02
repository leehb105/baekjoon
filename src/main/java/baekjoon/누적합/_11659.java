package baekjoon.누적합;

import java.util.Scanner;

public class _11659 {

	//	첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 
	//	수는 1,000보다 작거나 같은 자연수이다. 
	// 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N + 1];

//		for(int i = 0; i < N; i++) {
//			arr[i] = sc.nextInt();
//		}
		
		arr[0] = 0;
		for(int i = 1; i < arr.length; i++) {
			arr[i] = arr[i] + arr[i - 1] + sc.nextInt();
		}
		for(int i = 0; i < M; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
		
			sb.append(arr[end] - arr[start - 1]).append("\n");
			
		}
		System.out.println(sb);
		
	}

}
