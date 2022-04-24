package arrays;

import java.util.Arrays;

public class CountInversions {
    public static void main(String[] args) {
        long[] arr = { 10,10,10 };
        System.out.println(inversionCount(arr,  arr.length));
    }

    //Expected Time Complexity: O(NLogN).
    //Expected Auxiliary Space: O(N).
    static long inversionCount(long arr[], long N) {
        return mergeSortCount(arr,0,(int)N-1);
    }

    private static long mergeSortCount(long arr[], int l, int r){
        long count=0;
        if(l>=r) return 0;
        int mid = (l+r)/2;
        count+=mergeSortCount(arr,l,mid);
        count+= mergeSortCount(arr,mid+1,r);
        count+=mergeAndCount(arr,l,mid,r);
        return count;
    }

    private static long mergeAndCount(long[] arr, int l, int m, int r){
        long la[] = Arrays.copyOfRange(arr,l,m+1);
        long ra[] = Arrays.copyOfRange(arr,m+1,r+1);
        int lp=0,rp=0,ai=l;
        long ic =0;
        while(lp<la.length && rp<ra.length){
            if(la[lp]<=ra[rp]) {
                arr[ai++] = la[lp++];
            }else {
                arr[ai++]=ra[rp++];
                ic+=(m+1)-(l+lp);
            }
        }
        while(lp<la.length){
            arr[ai++] = la[lp++];
        }
        while(rp<ra.length){
            arr[ai++] = ra[rp++];
        }
        return ic;
    }
}