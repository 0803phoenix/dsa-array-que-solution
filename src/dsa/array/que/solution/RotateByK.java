package dsa.array.que.solution;

public class RotateByK {
	
	public static void rotateByK(int arr[], int k) {
		
		for(int j=0; j<k% arr.length; j++) {
			int temp = arr[0];		
			for(int i=1; i<arr.length; i++) {
				arr[i-1]=arr[i];
			}
			arr[arr.length-1] = temp;
		}
		
		for(int l=0; l<arr.length; l++) {
			System.out.println(arr[l]);
		}
	}
}
