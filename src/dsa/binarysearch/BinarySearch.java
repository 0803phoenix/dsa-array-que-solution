package dsa.binarysearch;

public class BinarySearch {
	
//	Binary Search algo using iterative method
	public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n-1;

        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                return mid;
            }

            if(target<nums[mid]){
                r = mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
	
//	lowerBound-Smallest index such that arr[index] >= x
	public static int lowerBound(int []arr, int n, int x) {
        int l=0;
        int r=n-1;
        int lb = 0; 
        if(x < arr[0]){
            return 0;
        }
        if(x>arr[n-1]){
            return n;
        }
        while(l<=r){
            int mid = (l+r)/2;


            if(arr[mid]<x){
                lb = mid+1;
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        } 
        return lb;
    }
	
// UpperBound - Index of the first value that is greater than given value
	public static int upperBound(int []arr, int x, int n){
        int l = 0;
        int r = arr.length-1;
        int ub=n;

        if(x > arr[n-1]){
            return n;
        }
        if(x< arr[0]){
            return 0;
        }

        while(l<=r){
            int mid = (l+r)/2;

            if(arr[mid]<=x){
                l = mid+1;
            }else{
                ub = mid;
                r = mid-1;
            }
        }
        return ub;
    }
}
