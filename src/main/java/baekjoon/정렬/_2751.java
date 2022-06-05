package baekjoon.정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int count = Integer.parseInt(br.readLine());
		int[] arr = new int[count];
		for(int i = 0; i < count; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		sort(arr, arr.length);
		
		for(int i : arr) {
			sb.append(i).append("\n");
		}
//		bw.write(sb.toString());
//		bw.flush();
//		bw.close();
//		br.close();
		System.out.println(sb);
		//수정 필요
		
	}

	static void sort(int[] arr, int size) {
		//원소가 없거나 1개인경우 종료
		if(size < 2) {
			return;
		}
		
		// 가장 마지막 요소의 부모 인덱스
		int parentIdx = getParent(size - 1);
		
		//최대힙 구하기
		for(int i = parentIdx; i >= 0; i--) {
			heapify(arr, i, size - i);
		}
		
		for(int i = size - 1; i > 0; i--) {
			swap(arr, 0, i);
			heapify(arr, 0, i - 1);
		}
	}
	
	//부모의 인덱스를 리턴
	static int getParent(int child) {
		return (child - 1) / 2;
	}
	
	//힙을 만드는 메소드
	static void heapify(int[] arr, int parentIdx, int lastIdx) {
		int leftChildIdx;
		int rightChildIdx;
		int largestIdx;
		
		while((parentIdx * 2) + 1 <= lastIdx) {
			leftChildIdx = (parentIdx * 2) + 1; //왼쪽 자식노드 구하는 공식
			rightChildIdx = (parentIdx * 2) + 2; //오른쪽 자식노드 구하는 공식
			largestIdx = parentIdx;
			
			//왼쪽 자식 노드와 비교
			if(arr[leftChildIdx] > arr[largestIdx]) {
				largestIdx = leftChildIdx;
			}
			
			//오른쪽 자식 노드와 비교
			//오른쪽 자식 노드의 인덱스가 트리의 크기를 넘어가면 안된다
			if(rightChildIdx <= lastIdx && arr[rightChildIdx] > arr[largestIdx]) {
				largestIdx = rightChildIdx;
			}
			
			//현재 부모보다 자식 노드의 크기가 큰 경우 = 교환 발생
			//자식과 부모 노드의 값을 교환해준 후, 교환된 자식 노드가 부모 노드가 될 수 있게 한다.
			if(largestIdx != parentIdx) {
				swap(arr, parentIdx, largestIdx);
				parentIdx = largestIdx;
			}
			else return;
		}
	}
	
	//두 수의 위치를 바꿔주는 메소드
		static void swap(int[] arr, int i, int j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
}
