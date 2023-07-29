package dsa.array.que.solution;

public class LargestElement {
	public int largestElement(int arr[]) {
		 int max =0;
		 
		 for(int i=0; i< arr.length; i++) {
			 if(arr[i]> max) {
				 max =arr[i];
			 }
		 }
		return max;
	}
}
