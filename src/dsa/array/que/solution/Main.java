package dsa.array.que.solution;

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
		
		int result = maxArea(height);
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
}
