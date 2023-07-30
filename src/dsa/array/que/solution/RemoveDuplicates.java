package dsa.array.que.solution;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static int removeDuplicates(int arr[]) {
		
//		Brut force Approach
//		Set<Integer> unique = new HashSet<>();
//		
//		for(int i=0; i<arr.length; i++) {
//			unique.add(arr[i]);
//		}
//		
//		int index =0 ;
//		for(int item:unique) {
//			arr[index] = item;
//			index++;
//		}
//		return unique.size();
		
//		Optimal approach
		int i = 0;
		int j = 1;
		
		while(i <arr.length-1 && j <arr.length) {
			if(arr[j]== arr[i]) {
				j++;
			}else {
				arr[i+1] = arr[j];
				i++;
			}
			
		}
		return i+1;
	}
}
