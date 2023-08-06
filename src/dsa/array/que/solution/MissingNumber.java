package dsa.array.que.solution;

public class MissingNumber {
	public static int missingNumber(int nums[]) {
		int n = nums.length;
        // Brute Force Approach
        // int temp = -1;
        // for(int i=0; i<=n; i++){
        //     int flag =0;
        //     for(int j=0; j<n; j++){
        //         if(nums[j] == i){
        //             flag = 1;
        //             break;
        //         }
        //     }
        //     if(flag == 0){
        //         temp = i;
        //     }
        // }
        // return temp;

        // SUm method
        // int sum =0;
        // for(int i=0; i<n; i++){
        //     sum+=nums[i];
        // }
        // int sum2 =0;
        // sum2 = sum2+(n+1)*n/2;
        // return sum2-sum;

        // XOR Method
        int XOR1 = 0;
        int XOR2 = 0;
        for(int i=0; i<n; i++){
            XOR2 = XOR2^nums[i];
            XOR1 = XOR1^(i);
        }
        XOR1 = XOR1^(n);

        return XOR1^XOR2;
	}
}
