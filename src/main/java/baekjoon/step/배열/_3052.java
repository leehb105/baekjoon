package baekjoon.step.배열;

import java.util.Scanner;

public class _3052 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		int[] inputArr = new int[10];//10개 배열 생성
		int[] modArr = new int[10];//나머지값 넣을 배열 생성
		int[] modTempArr = new int[10];//나머지값 넣을 배열 생성
		while(num < 10) {//10번 반복
			inputArr[num] = sc.nextInt();//10번 입력 받음
			modArr[num] = inputArr[num] % 42;//n번째에 있는 값을 42로 나눈 후에 저장
			modTempArr[num] = inputArr[num] % 42;//n번째에 있는 값을 42로 나눈 후에 저장
			num++;
		}
		int a = 0;
		int tempnum = 0;
		for(int i = 0; i<modArr.length; i++) {
			//System.out.print(modArr[i] + " | ");
//			System.out.print(modTempArr[i] + " ");
			for(int j = 0; j <= i; j++) {
				if(modArr[i] == modArr[j]) {
					if(i!=j) {
						modTempArr[j] = -1;						
						//a--;
					}else {
						modTempArr[j] = modTempArr[j];	
					}
					
				}
			}
		}
		//System.out.println();
		for(int i = 0; i<modTempArr.length; i++) {
			for(int j = i; j <=i; j++) {
				if(modTempArr[j] != -1) {
					a++;
				}
			}
			//System.out.print(modTempArr[i] + " | ");
		}
		//System.out.println();
		System.out.println(a);
	}
}

