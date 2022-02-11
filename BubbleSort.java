//Chloe Nguyen
//2.10.2022 Data Structures
//Bubble sort

import java.util.*;

class BubbleSort{
	public static void bubbleSort(int arr[], int arrLength) {
		for (int i=0; i < arrLength-1;i++) {
			for (int j=0;j<arrLength-i-1; j++) {
				if (arr[j+1]<arr[j]) {				//if left element is less than right element,
					int temp = arr[j]; 				//swap array elements
					arr[j]=arr[j+1];				
					arr[j+1]=temp;
				}
			}
		}
	}   
	public void printArray(int arr[], int len)
    {
        for (int i=0; i<len; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
	public static void main(String args[]) {
		BubbleSort bs = new BubbleSort();
		int[] arr = {90,84,37,21,34,19,9};
		int length = arr.length;
		System.out.print("Given Array: ");
		bs.printArray(arr, length);
		bs.bubbleSort(arr, length);
		System.out.print("Sorted Array: ");
		bs.printArray(arr, length);
	}
}