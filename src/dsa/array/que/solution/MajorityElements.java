package dsa.array.que.solution;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
	public static int majorityElements(int nums[]) {
		int n= nums.length;
//		Brute Force approach
//        int temp =0;
//        for(int i=0;i<n; i++){
//            int count =0;
//            for(int j=0; j <n; j++){
//                if(nums[i] == nums[j]){
//                    count++;
//                }
//            }
//            if(count> n/2){
//                temp = nums[i];
//            }
//        }
//        return temp;
		
//		Better Approach using Hashing
//		HashMap<Integer, Integer> mpp = new HashMap<>();
//		
////		Storing elements with its occurences:
//		for(int i=0; i<n; i++) {
//			int value = mpp.getOrDefault(nums[i], 0);
//			mpp.put(nums[i], value+1);
//		}
////		Searching for Majority Element
//		for(Map.Entry<Integer, Integer> it: mpp.entrySet()) {
//			if(it.getValue()> n/2) {
//				return it.getKey();
//			}
//		}
//		return -1;
		
//		Optimal Approach- Move's Voting algorithm
		// Moovs voting algorithm
        int candidate = 0;
        int count =0;
        for(int i =0; i<n; i++){
            if(count ==0){
                count =1;
                candidate = nums[i];
                count++;
            }else if(candidate == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == candidate) cnt1++;
        }

        if (cnt1 > (n / 2)) return candidate;
        return -1;
	}
}
