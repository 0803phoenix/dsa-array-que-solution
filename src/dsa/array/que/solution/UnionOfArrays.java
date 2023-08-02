package dsa.array.que.solution;

import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {
	
	public static void union(int arr1[], int arr2[]) {
		Set<Integer> union = new HashSet<>();
		
		for(int i =0; i<arr1.length; i++) {
			union.add(arr1[i]);
		}
		for(int j=0; j<arr2.length; j++) {
			union.add(arr2[j]);
		}
		
		for(int item : union) {
			System.out.println(item);
		}
	
	}
}
