package baekjoon.step.while문;

import java.util.Scanner;

public class _1110 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		int newNum = inputNum;
		int sumNum= 0;
		int cycle = 0;
		int sumNum1 = 0;
		int n10 = 0, n1 = 0;
		while(true)
		{
			cycle++;
			
			//숫자 분할
			if(newNum<10) {
				n10 = 0;
				n1 = newNum;
			}else {
				n10 = newNum / 10;//2
				n1 = newNum%10;//6
			}
			//두 숫자 더하기
			sumNum = n10 + n1;//2+6
			//새로운 수 만들기 n1+sumNum1
			if(sumNum < 10) {
				newNum = n1*10 + sumNum;
			}else {
				sumNum1 = sumNum%10;
				newNum = n1*10 + sumNum1;
			}
			
			if(inputNum == newNum) {
				break;
			}
		}
		System.out.println(cycle);
	}
}
