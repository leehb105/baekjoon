package baekjoon.step.배열;

import java.util.Scanner;

public class _1546 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		double[] originArr = new double[inputNum];
		for(int i= 0; i<inputNum; i++) {//n개 만큼 점수 입력
			originArr[i] = sc.nextInt();
		}
		
		int maxNum = (int)originArr[0];
		for(int i= 1; i<inputNum; i++) {//제일 큰 수 찾기
			if(maxNum < originArr[i]) {
				maxNum = (int)originArr[i];
			}
		}
		
		double[] newScore = new double[inputNum];
		for(int i = 0; i<inputNum; i++) {//새로운 점수 계산
			//System.out.println(originArr[i]);
			newScore[i] = (originArr[i]/maxNum)*100;
		}
		
		double sum = 0;
		for(int i = 0; i<inputNum; i++) {//새로운 점수 계산
			sum += newScore[i];
		}
		System.out.println(sum = sum/inputNum);
	}
}

