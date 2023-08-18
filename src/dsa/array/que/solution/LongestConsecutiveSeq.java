package dsa.array.que.solution;

public class LongestConsecutiveSeq {
//	Problem Statement: 
//	Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//	You must write an algorithm that runs in O(n) time.
	
	
	public static int longestConsecutiveSeq(int [] nums) {
		int n = nums.length;
		int longest = 1;  //Considering there is at least one element in the array
		
//		Brute force approach

        for(int i=0; i<n; i++){
            int x = nums[i];
            int cnt = 0;
            while(linearSearch(nums, x) == true){
                x+=1;
                cnt+=1;
            }
            longest = Math.max(longest, cnt);
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
