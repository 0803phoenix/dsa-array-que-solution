package dsa.array.que.solution;

public class SortColors {
	
	public static void sortColors(int [] nums) {
		// General Way Time Complexity O(4n)
        // List<Integer> sorted = new ArrayList<>();
        // for(int i =0; i<nums.length; i++){
        //     if(nums[i] == 0){
        //         sorted.add(nums[i]);
        //     }
        // }
        // for(int j = 0; j<nums.length; j++){
        //     if(nums[j] == 1){
        //         sorted.add(nums[j]);
        //     }
        // }
        // for(int k =0 ; k<nums.length; k++){
        //     if(nums[k] == 2){
        //         sorted.add(nums[k]);
        //     }
        // }

        // for (int i = 0; i < sorted.size(); i++){
        //     nums[i] = sorted.get(i);
        // }

        // Using Bubble sort time Complexity O(n^2)
        // int n = nums.length;
        // for(int i=n-1; i>=1; i--){
        //     for(int j=0; j<i; j++){
        //         if(nums[j]>nums[j+1]){
        //             int temp = nums[j+1];
        //             nums[j+1] = nums[j];
        //             nums[j] = temp;
        //         }
        //     }
        // }

        // Better solution counting o's 1's and 2's and overwrite the arrays elements with 0's on 1st places, 1's on second places, 2's on 3rd places'
        // Time Complexity O(n)+O(countZero)+O(countOne)+O(countTwo) = O(2N)
//        int n= nums.length;
//        int countZero = 0;
//        int countOne = 0;
//        int countTwo = 0;
//        
//        for(int i=0; i<n; i++){
//            if(nums[i] == 0){
//                countZero++;
//            }else if(nums[i] == 1){
//                countOne++;
//            }
//            else{
//                countTwo++;
//            }
//        }
//        for(int j=0; j<countZero; j++){
//            nums[j] = 0;
//        }
//        for(int k=countZero; k<countZero+countOne; k++){
//            nums[k] = 1;
//        }
//        for(int l = countOne+countZero; l<countZero+countOne+countTwo; l++){
//            nums[l] = 2;
//        }
        
//		Dutch National Flag Algorithm O(n)
//		explaination in Notebook
		int low = 0;
        int n = nums.length;
        int mid = 0;
        int high = n-1;

        while(mid<=high){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temporary = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temporary;
                high--;
            }
        }
        



	}
}
