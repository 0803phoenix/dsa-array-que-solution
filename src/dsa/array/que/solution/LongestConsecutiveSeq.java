package dsa.array.que.solution;

import java.util.Arrays;
import java.util.*;

public class LongestConsecutiveSeq {
//	Problem Statement: 
//	Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//	You must write an algorithm that runs in O(n) time.
	
	
	public static int longestConsecutiveSeq(int [] nums) {
		int n = nums.length;
		int longest = 1;  //Considering there is at least one element in the array
		
//		Brute force approach
//        for(int i=0; i<n; i++){
//            int x = nums[i];
//            int cnt = 0;
//            while(linearSearch(nums, x) == true){
//                x+=1;
//                cnt+=1;
//            }
//            longest = Math.max(longest, cnt);
//        }
//        return longest;
		
//		Better Approach:-> Sorting an array and finding the consecutive elements in the array and incrementing the counter by one, when we won't find the consecutive element we will set the counter to 1 again and at last find the maximum among the counters
		
//		int lastSmaller = Integer.MIN_VALUE;
//        int cnt = 0;
//        Arrays.sort(nums);
//
//        for(int i =0 ; i<n; i++){
//            if(nums[i]-1 == lastSmaller){
//                cnt+=1;
//                lastSmaller = nums[i];
//            }
//            else if(lastSmaller != nums[i]){
//                cnt =1;
//                lastSmaller = nums[i];
//            }
//            longest = Math.max(longest, cnt);
//        }
//        return longest;
		
		// Optimal approach
        Set<Integer> newSet = new HashSet<>();
        for(int i =0; i<n; i++){
            newSet.add(nums[i]);
        }

        for(int item : newSet){
            if(!newSet.contains(item-1)){
                int cnt = 1;
                int x = item;
                while(newSet.contains(x+1)){
                    x= x+1;
                    cnt= cnt+1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
	}
	
	public static boolean linearSearch(int[] nums, int a){
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == a){
                return true;
            }
        }
        return false;
    }
}
