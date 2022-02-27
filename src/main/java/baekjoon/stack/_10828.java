package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10828 {
	static int size = 0;
	static int []arr;
	static int top = -1;
	
	public static void push(int x) {
		arr[++top] = x;
	}
	public static int pop() {
		if(empty() == 1) {
			return -1;
		}else {			
			return arr[top--];
		}
	}
	public static int size() {
		return top+1;
	}
	public static int empty() {
		if(top >= 0) 
			return 0;//스택에 데이터 존재
		return 1;//스택이 비어 있음 
		
	}
	public static int top() {
		if(empty() == 1) {
			return -1;
		}else {
			return arr[top];
		}
	}
	public static void main(String[] args) {
		try {
			int x;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st;
			
			int count = Integer.parseInt(br.readLine());
			
			arr = new int[count];
			for(int i = 0; i<count; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				switch (st.nextToken()) {
				case "push": 
					x = Integer.parseInt(st.nextToken());
					push(x);
					break;
				case "pop" :
					System.out.println(pop());
						break;
				case "size" :
					System.out.println(size());
					break;
				case "empty" :
					System.out.println(empty());
					break;
				case "top" :
					System.out.println(top());
					break;
				default:
					break;
				}
			}
		
		}catch(IOException e) {
			
		}
	}
}
