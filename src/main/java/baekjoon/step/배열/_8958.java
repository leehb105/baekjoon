package baekjoon.step.배열;

import java.util.Scanner;

public class _8958 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		int[] length = new int[inputNum];
		String[][] inputData = new String[inputNum][1];
		for(int i = 0; i < inputNum; i++) {//n줄의 오엑스 입력
			for(int j = 0; j < 1; j++) {
				inputData[i][j] = sc.next();
				if(sc.hasNextLine()) {
					break;
				}
			}
		}
		String[] splitArr = new String[80];
		int[] scoreArr = new int[inputNum];
		int stackScore = 0;
		for(int k = 0; k < inputNum; k++) {//입력받은 만큼 문자 스플릿
			splitArr = inputData[k][0].split("");
			for(int j = 0; j<splitArr.length; j++) {//splitArr에 있는 문자 한개씩 비교
				stackScore++;
				if(splitArr[j].equals("O")) {
					scoreArr[k] += stackScore;
				}
				else if(splitArr[j].equals("X")) {
					stackScore = 0;
				}
			}
			stackScore = 0;
			System.out.println(scoreArr[k]);
		}
	}
}

