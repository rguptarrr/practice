package arrays;

import java.util.Arrays;

public class MinimumPlatforms {
    static int findPlatform(int arr[], int dep[], int n)
    {
        int mp = 0;
        int p = 0;
        int a = 0,d=0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        while(a<n && d<n){
            if(arr[a]<=dep[d]){
                a++;
                p++;
            }else{
                p--;
                d++;
            }
            mp = Math.max(mp,p);
        }
        if(a<n){
            p=p+(n-a);
            mp = Math.max(mp,p);
        }
        return mp;
    }
}
