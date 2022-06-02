package baekjoon.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10773 {
	static int size = 0;
	static int []arr;
	static int top = -1;
	
	public static void push(int x) {
		if(x == 0) {
			if(empty() == 0) {
				pop();
			}
		}else {
			arr[++top] = x;
		}
	}
	public static int pop() {
		if(empty() == 1) {
			//System.out.println("pop 실");
			return 0;
		}else {			
			//System.out.println("pop 성공");
			arr[top] = 0;
			return arr[top--];
		}
	}
	public static int empty() {
		if(top >= 0) 
			return 0;//스택에 데이터 존재
		return 1;//스택이 비어 있음 
		
	}
	public static void main(String[] args) throws IOException{
/*예제 2의 경우를 시뮬레이션 해보면,
[1]
[1,3]
[1,3,5]
[1,3,5,4]
[1,3,5] (0을 불렀기 때문에 최근의 수를 지운다)
[1,3] (0을 불렀기 때문에 그 다음 최근의 수를 지운다)
[1,3,7]
[1,3] (0을 불렀기 때문에 최근의 수를 지운다)
[1] (0을 불렀기 때문에 그 다음 최근의 수를 지운다)
[1,6]
합은 7이다.	
 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());//첫줄의정수는 입력줄의 갯수
		arr = new int[count];
		int sum = 0;
		
		for(int i = 0; i< count; i++) {
			push(Integer.parseInt(br.readLine()));

		}
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
	}
}
