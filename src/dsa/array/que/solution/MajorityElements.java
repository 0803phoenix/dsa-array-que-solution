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
		HashMap<Integer, Integer> mpp = new HashMap<>();
		
//		Storing elements with its occurences:
		for(int i=0; i<n; i++) {
			int value = mpp.getOrDefault(nums[i], 0);
			mpp.put(nums[i], value+1);
		}
//		Searching for Majority Element
		for(Map.Entry<Integer, Integer> it: mpp.entrySet()) {
			if(it.getValue()> n/2) {
				return it.getKey();
			}
		}
		return -1;
	}
}
