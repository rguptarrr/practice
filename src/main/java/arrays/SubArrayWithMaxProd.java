package arrays;

public class SubArrayWithMaxProd {

    public static void main(String[] args) {
        int a[] = {-4};
        System.out.println(maxProduct(a,a.length));
    }

    static long maxProduct(int[] arr, int n) {
        long max=Long.MIN_VALUE; //Initialize max prod as min value
        long p = 1; //Initialize product as 1
        int fni=-1; // Initialize first negative index as -1
        long nipr=0;//negative index product retained
        int right=0,left=0;//Left and right pointer denoting subarray
        while(right<n){
            if(arr[right]==0
                    && p<0  //If current element is zero and product is negative, check if we can make it positive
                    && right-left>1){ //This is required to handle case like {-1,0}
                long positiveSubindexProduct=p/nipr; //Dividing by last first negative product to make it positive
                max=Math.max(positiveSubindexProduct,max);
            }
            p=p*arr[right];
            max=Math.max(p,max);
            if(p==0){ //If product becomes zero, need to discard prodcut and subarray till here
                p = 1; //initialiaing p as 1
                fni=-1; // first negative index is not found till now
                left=right+1; //moving left after zero
            }
            //If product becomes negative, then store index and product state
            if(p<0 && fni==-1) {
                fni=right;
                nipr=p;
            }
            right++;
        }
        if(p<0 && fni!=-1 && right-left>1){ //This is for handling final negative product
            p=p/nipr;
            max=Math.max(p,max);
        }
        return max;
    }
}
