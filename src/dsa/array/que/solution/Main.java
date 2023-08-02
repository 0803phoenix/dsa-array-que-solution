package dsa.array.que.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the first array");
		int n1 = sc.nextInt();
		
		int height1[] = new int[n1];
		System.out.println("Enter the elements of first array");
		for(int i=0; i<n1; i++) {
			height1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of the first array");
		int n2 = sc.nextInt();
		
		int height2[] = new int[n2];
		System.out.println("Enter the elements of second array");
		for(int i=0; i<n2; i++) {
			height2[i] = sc.nextInt();
		}
//		LargestElement le = new LargestElement();
//		int largest = le.largestElement(height);
//		System.out.println("largest is: "+largest);
//		
//		SecondLargestElement sle = new SecondLargestElement();
//		int secondLargest = sle.secondLargestElement(height);
//		System.out.println("Second Largest is: "+secondLargest);
//		
//		RemoveDuplicates rd = new RemoveDuplicates();
//		int size = rd.removeDuplicates(height);
//		System.out.println("Size of array after removing duplicate: "+size);
		
//		System.out.println("Enter the number by which you want to rotate the array: " );
//		int k = sc.nextInt();
//		RotateByK rk = new RotateByK();
//		rk.rotateByK(height, k);
		
//		MoveZerosAtEnd mz = new MoveZerosAtEnd();
//		mz.moveZeros(height);
		
//		System.out.println("Enter the number to be searched in the array: ");
//		int num = sc.nextInt();
//		LinearSearch ls = new LinearSearch();
//		int result = ls.linearSearch(height, n, num);
//		System.out.println(result);
		
//		UnionOfArrays ua = new UnionOfArrays();
//		ua.union(height1, height2);
		
		IntersectionOfArrays ia = new IntersectionOfArrays();
		ia.intersection(height1, height2);
		
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
