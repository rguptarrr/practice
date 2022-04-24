package arrays;

import java.util.ArrayList;

public class FindDuplicates {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        int c[] = new int[n];
        for(int i : arr) c[i]++;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0;i<n;i++) if(c[i]>1) a.add(i);
        if(a.size()==0) a.add(-1);
        return a;
    }
}
