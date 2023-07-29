package dsa.array.que.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int height[] = new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0; i<n; i++) {
			height[i] = sc.nextInt();
		}
		LargestElement le = new LargestElement();
		int result = le.largestElement(height);
		System.out.println(result);
		
	}
	
//	Container with most water solution leetCode
	public static int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int maxWater = 0;

        while(left<right){
            int h = Math.min(height[left], height[right]);
            int width = right-left;
            int area = h*width;

            maxWater = Math.max(maxWater, area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
	
//Three Sum solution 
	public static List<List<Integer>> threeSum(int nums[]){
		List<List<Integer>> threeSum = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length-1; i++){

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i+1;
            int right = nums.length-1;

            while(left< right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == 0){
                    threeSum.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left<right && nums[left] ==nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return threeSum;
	}
}
