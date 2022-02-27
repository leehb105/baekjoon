package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _9012 {
	static int size = 0;
	static String []arr;
	static int top = 0;
	
	public static void push(String x) {
		if(empty() == 1) {//stack 0
			if(x.equals(")")) {
				arr[top++] = x;
			}else if(x.equals("(")) {
				arr[top++] = x;
			}
		}else {
			if(x.equals("(")) {
				arr[top++] = x;
			}else if(x.equals(")")) {
				if(arr[top-1].equals("(")){
					pop();
				}else {
					arr[top++] = x;
				}
			}
		}
		
	}
	public static void pop() {
		arr[--top] = null;
	}
	public static int empty() {
		if(top > 0) 
			return 0;//스택에 데이터 존재
		return 1;//스택이 비어 있음 
		
	}public static void CheckStack() {
		if(top == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
	public static void main(String[] args) throws IOException{
/*
 * 
 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());//첫줄의정수는 입력줄의 갯수
	
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		for(int i = 0; i< count; i++) {
			String str = br.readLine();
			String []strArr = str.split("");
			arr = new String[50];
			for(String s : strArr) {//문자열 파싱 
				//System.out.println(s);
				push(s);
			}
			CheckStack();
			arr = null;
			top = 0;
			strArr = null;

		}
	
		
	}
}
