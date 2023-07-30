package dsa.array.que.solution;

public class SecondLargestElement {
//		Time complexity O(2N)
//	Considering array contain only positive value
	public static int secondLargestElement(int arr[]) {
		int largest =0;
		 int secondLargest = -1;
		 for(int i=0; i< arr.length; i++) {
			 if(arr[i]> largest) {
				 largest =arr[i];
			 }
		 }
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!= largest && arr[i]>secondLargest) {
				secondLargest = arr[i];
			}
		}
		
		return secondLargest;
	}
}
