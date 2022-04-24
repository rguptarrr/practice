package arrays;

import java.util.ArrayList;

public class ContguousArrayWithGivenSum {

    public static void main(String[] args) {
        int a[]={1,1,2,3,4,5,6};
        System.out.println(subarraySum(a,7,10));
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int left=0,right=0,sum=0;
        while(right<n){
            sum+=arr[right];
            while(sum>s && left<right){
                sum-=arr[left];
                left++;
            }
            if(sum==s) break;
            right++;
        }
        ArrayList<Integer> r = new ArrayList<>();
        if(sum!=s) r.add(-1);
        else {
            r.add(left+1);
            r.add(right+1);
        }
        return r;
    }
}
