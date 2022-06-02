package baekjoon.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4949 {
	static int size = 0;
	static String []arr;
	static int top = 0;
	
	public static void push(String x) {
		if(empty() == 1) {//stack 0
			if(x.equals(")")) {
				arr[top++] = x;
			}else if(x.equals("(")) {
				arr[top++] = x;
			}else if(x.equals("[")) {
				arr[top++] = x;
			}else if(x.equals("]")) {
				arr[top++] = x;
			}
		}else {//stack 1~
			if(x.equals("(")) {
				arr[top++] = x;
			}else if(x.equals(")")) {
				if(arr[top-1].equals("(")){
					pop();
				}else {
					arr[top++] = x;
				}
			}else if(x.equals("[")) {
				arr[top++] = x;
			}else if(x.equals("]")) {
				if(arr[top-1].equals("[")){
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
			sb.append("yes\n");
			//System.out.println("yes");
		}else {
			sb.append("no\n");
			//System.out.println("no");
		}
	}
	static StringBuilder sb;
	public static void main(String[] args) throws IOException{
/*
 * 
 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		
		String []words = new String[102];
		String str = "";
		while(true) {
			arr = new String[100];
			str = br.readLine();
			if(str.equals("."))
				break;
			if(!str.equals("")) {
				words = str.split("");
				for(String s : words) {
					if(s.equals(".")) {
						CheckStack();
						s = null;
						break;
					}
					else {
						push(s);
					}
				}				
			}
			arr = null;
			top = 0;
			words = null;
		}//end of while
		System.out.println(sb);
	}
}
