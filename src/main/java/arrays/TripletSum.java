package arrays;

import java.util.Arrays;

public class TripletSum {
    //Function to find if there exists a triplet in the
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) {
        Arrays.sort(A);
        for(int i = 0;i<n-2;i++){
            int p = A[i];
            int left=i+1;
            int right = n-1;
            while (left<right){
                int sum = p+A[left]+A[right];
                if(sum==X) return true;
                if(sum<X) left++;
                else right--;
            }
        }
        return false;
    }
}
