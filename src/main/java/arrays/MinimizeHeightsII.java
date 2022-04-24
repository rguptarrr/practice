package arrays;

import java.util.Arrays;

public class MinimizeHeightsII {
    public static void main(String[] args) {

    }

    int getMinDiff(int[] arr, int n, int k) {
        if(n==1){
            return 0;
        }
        Arrays.sort(arr);
        int diff = arr[n-1] - arr[0];
        int minimum,maximum;
        for(int i=1;i<n;i++){
            if(arr[i]-k<0) continue;
            maximum = Math.max(arr[i-1]+k, arr[n-1]-k);
            minimum = Math.min(arr[0]+k, arr[i]-k);
            diff = Math.min(diff,maximum-minimum);
        }
        return diff;
    }
}
