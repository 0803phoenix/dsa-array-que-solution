package dsa.binarysearch;

public class KokoEatingBananas {
	public static int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int maxB = Integer.MIN_VALUE;
        int k=0;
        for(int i=0; i<n; i++){
            if(piles[i]>maxB){
                maxB = Math.max(piles[i], maxB);
            }
        }
        // System.out.println(maxB);
        // for(int j=1; j<=maxB; j++){
        //     requiredTime = totalhours(piles, j, n);
        //     // System.out.println(requiredTime);
        //     if(requiredTime <= h){
        //         k = j;
        //         // break;
        //     }
        // }

        int l = 1;
        int r = maxB;
        while(l<=r){
            int mid = (l+r)/2;

            int requiredTime = totalhours(piles, mid);

            if(requiredTime<= h){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }
	public static int totalhours(int [] piles, int hourly){
        int totalHours =0;
        for(int i=0; i<piles.length; i++){
            totalHours+=Math.ceil((double)piles[i]/(double)hourly);
            if(hourly == 3){
                System.out.println(totalHours);
            }
        }
        return totalHours;
    }
}
