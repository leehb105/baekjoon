package baekjoon.step.배열;

import java.util.Scanner;

public class _4344 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		int[] scores;
		double[] result = new double[testCase];
		int sum = 0;
		for(int j = 0; j<testCase; j++) {//n개의 테스트케이스 입력
			int inputStudent = sc.nextInt();
			scores = new int[inputStudent];
			for(int i = 0; i<inputStudent; i++) {//n명만큼 점수 입력
				scores[i] = sc.nextInt();
				sum+= scores[i];
				
			}
			sum = sum/inputStudent;
			int arrStu = 0;
			for(int k = 0; k<inputStudent; k++) {
				if(sum < scores[k]) {
					arrStu++;
				}
			}
			result[j] =(double)arrStu / inputStudent*100;
			
			sum = 0;
			System.out.println(String.format("%.3f", result[j]) + "%");
			

		}
		
	}
}

