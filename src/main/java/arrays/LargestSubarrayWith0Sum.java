package arrays;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWith0Sum {
    int maxLen(int arr[], int n) {
        Map<Integer,Integer> fsi = new HashMap<>();
        int s = 0;
        int sa[] = new int[n];
        int max = 0;
        for(int i=0;i<n;i++){
            s=s+arr[i];
            if(!fsi.containsKey(s)){
                fsi.put(s,i);
            }else {
                Integer fsii = fsi.get(s);
                max=Math.max(max,i-fsii);
            }
            if(s==0){
                max=Math.max(max,i+1);
            }
        }
        return max;
    }
}
