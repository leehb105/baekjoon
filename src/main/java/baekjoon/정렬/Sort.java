package baekjoon.정렬;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		Sort sort = new Sort();
		int[] arr = {3, 14, 5, 7, 2, 1};
		System.out.println(Arrays.toString(arr));
//		sort.bubbleSort(arr);
//		sort.selectionSort(arr);
//		sort.insertSort(arr);
		sort.heapSort(arr, arr.length);
		
		System.out.println(Arrays.toString(arr));
	}

	public void bubbleSort(int[] arr) {
		//O(n^2)
		//오른쪽부터 비교해 왼쪽으로 최솟값을 정렬하는방식으로 구현함
		//배열 전체의 크기만큼 반복
		for(int i = 0; i < arr.length; i++) {
			//제일 오른쪽 인덱스 부터 정렬, 맨왼쪽 인덱스는 최소값으로 정렬된 상태이므로 i의 값까지만 정렬한다
			for(int j = arr.length - 1; j > i; j--)
			if(arr[j - 1] > arr[j]) {
				swap(arr, j - 1, j); //위치 swap
			}
		}
	}
	public void selectionSort(int[] arr) {
		//O(n^2)
		//전체 배열에서 최솟값을 찾아 왼쪽에서부터 교환해나가는 정렬
		for(int i = 0; i < arr.length - 1; i++) {
			int minIndex = i; //최솟값 인덱스를 저장, 마지막 인덱스는 검색하지 않아도 된다
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j; //최솟값을 찾으면 인덱스 변경
				}
			}
			swap(arr, minIndex, i); //최솟값검색이 끝난후 두 인덱스의 값을 swap
			
		}
	}
	public void insertSort(int[] arr) {
		//O(n^2)
		//우측의 미탐색 영억에서 숫자를 하나 꺼내 왼쪽의 정렬된 위치에 삽입하는 정렬
		for(int i = 1; i < arr.length; i++) {
			int target = arr[i];
			int prev = i - 1;
			// 타겟이 이전 원소보다 크기 전 까지 반복
			while(prev >= 0 && arr[prev] > target) {
				arr[prev + 1] = arr[prev]; //오른쪽 원소를 왼쪽에 저장
 				prev--;
			}
			//탈출조건: 왼쪽 요소들이 타겟값보다 작다는 의미
			arr[prev + 1] = target; //탐색 종료지점에 target대입
		}
	}
	public void heapSort(int[] arr, int size) {
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
	public int getParent(int child) {
		return (child - 1) / 2;
	}
		
	//힙을 만드는 메소드
	public void heapify(int[] arr, int parentIdx, int lastIdx) {
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
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
