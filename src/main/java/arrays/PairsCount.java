package arrays;

import java.util.HashMap;
import java.util.Map;

public class PairsCount {
    public static void main(String[] args) {
        int a [] = {1,5,7,1};
        System.out.println(getPairsCount(a,a.length,6));
    }
    static int getPairsCount(int[] arr, int n, int k) {
        int count=0;
        Map<Integer,Integer> m = new HashMap<>();
        for(int i : arr) m.put(i,m.getOrDefault(i,0)+1);
        for(int i : arr){
            Integer integer = m.get(i);
            if(integer==1) m.remove(i);
            else m.put(i,integer-1);

            int compliment = k-i;
            Integer x = m.get(compliment);
            if(x!=null){
                count+=x;
            }

        }
        return count;
    }
}
