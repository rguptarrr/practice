package arrays;

import java.util.Arrays;

public class MinswapsSortArray {

    public static void main(String[] args) {
        int a[] = {7, 16, 14, 17, 6, 9, 5, 3, 18};
        System.out.println(minSwaps(a));
    }

    public static int minSwaps(int nums[]) {
        System.out.println(Arrays.toString(nums));
        int ac[] = Arrays.copyOfRange(nums,0,nums.length);
        Arrays.sort(ac);
        System.out.println(Arrays.toString(ac));
        int c = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=ac[i]) c++;
        }
        return (int)Math.ceil(c/2);
    }
}
