package dsa.array.que.solution;

import java.util.ArrayList;
import java.util.*;
public class IntersectionOfArrays {
	
	
	public static void intersection(int arr1[], int arr2[]) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		int visited [] = new int[n2];
		List<Integer> intersectedArray = new ArrayList<>();
//		for(int i=0; i<n2; i++) {
//			visited[i] = 0;
//		}
//		for(int j=0; j<n1; j++) {
//			for(int k = 0; k<n2; k++) {
//				if(arr1[j] == arr2[k] && visited[k] == 0 ) {
//					intersectedArray.add(arr1[j]);
//					visited[k] = 1;
//					break;
//				}
//			}
//		}
		
//		Optimal solution
		int i=0; 
		int j=0;
		while(i<n1 && j<n2) {
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr2[j] <arr1[i]) {
				j++;
			}
			else {
				intersectedArray.add(arr1[i]);
				i++;
				j++;
			}
		}
		
		for(int item : intersectedArray) {
			System.out.println(item);
		}
	}
}
