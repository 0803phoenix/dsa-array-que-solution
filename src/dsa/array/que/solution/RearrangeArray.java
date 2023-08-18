package dsa.array.que.solution;

import java.util.ArrayList;
import java.util.*;
public class RearrangeArray {
	
	public static int[] rearrangeArray(int [] nums) {
//		You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
//		You should rearrange the elements of nums such that the modified array follows the given conditions:
//		Every consecutive pair of integers have opposite signs.
//		For all integers with the same sign, the order in which they were present in nums is preserved.
//		The rearranged array begins with a positive integer.
//		Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
		
		
//		Brute force approach
		List<Integer> positive = new ArrayList<>();
        List<Integer> negetive  = new ArrayList<>();
        List<Integer> alternate = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]>0){
                positive.add(nums[i]);
            }
            else if(nums[i]<0){
                negetive.add(nums[i]);
            }
        }
        int posIndex = 0;
        int negIndex = 0;
        for(int j=0; j<n; j++){
            if(j%2 == 0 && posIndex <positive.size()){
                alternate.add(positive.get(posIndex++));
            }
            else if(negIndex<negetive.size()){
                alternate.add(negetive.get(negIndex++));
            }
        }

        for(int l=0; l<n; l++){
            nums[l] = alternate.get(l);
            System.out.println(nums[l]);
        }
        
        return nums;
        
//        Optimal Approach
//        int n = nums.length;
//        int posIndex = 0;
//        int negIndex = 1;
//        int [] result = new int[n];
//
//        for(int num : nums){
//            if(num>0){
//                result[posIndex] = num;
//                posIndex+=2;
//            }
//            else if(num<0){
//                result[negIndex] = num;
//                negIndex+=2;
//            }
//        }
//        return result;
	}
}
