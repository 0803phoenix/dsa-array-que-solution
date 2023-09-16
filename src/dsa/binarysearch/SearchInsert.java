package dsa.binarysearch;

public class SearchInsert {
	
	//Given a sorted array of distinct integers and a target value, 
	//	return the index if the target is found. If not, 
	//	return the index where it would be if it were inserted in order.
	//	You must write an algorithm with O(log n) runtime complexity.
	 public int searchInsert(int[] nums, int target) {
	        int l = 0;
	        int n = nums.length;
	        int r = n-1;
	        int lb =0;
	        int ub = n;

	        if(target> nums[n-1]){
	            return n;
	        }
	        if(target< nums[0]){
	            return 0;
	        }
	        while(l<=r){
	            int mid = (l+r)/2;
	            // if(nums[mid] == target){
	            //     return mid;
	            // }
	            if(nums[mid]>=target){
	                ub = mid;
	                r = mid-1;
	            }
	            else{
	                l = mid+1;
	            }
	        }
	        return ub;
	    }
}
