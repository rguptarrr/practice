package arrays;

public class MaxSubarraySum {

    public static void main(String[] args) {
        int a[] = {1,-2,3,4,5};
        System.out.println(maxSubarraySum(a,a.length));
    }

    static long maxSubarraySum(int arr[], int n){
        int right=0;
        long sum = 0,max=Long.MIN_VALUE;
        while (right<n){
            sum=sum+arr[right];
            if(sum>max) max=sum;
            if(sum<0){
                sum=0;
            }
            right++;
        }
        return max;
    }
}
