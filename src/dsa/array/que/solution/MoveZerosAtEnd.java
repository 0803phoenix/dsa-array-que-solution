package dsa.array.que.solution;

public class MoveZerosAtEnd {
	
	public static void moveZeros(int nums[]) {
		int n = nums.length;
        int j = -1;
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                j=i;
                break;
            }
        }
        if(j != -1) {
        for(int k = j+1; k<n; k++){
            if(nums[k] !=0){
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        }
        for(int l=0; l<n; l++) {
        	System.out.println(nums[l]);
        }
	}
}
