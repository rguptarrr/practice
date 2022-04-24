package arrays;

import java.util.Arrays;

public class MergeWoExtraSpace {
    public static void main(String[] args) {
        int arr1[] = new int[] { 7,10};
        int arr2[] = new int[] { 2 ,2 ,6 ,6 ,7 ,7 ,10 ,11 ,12 ,14 ,15 ,16};
        merge(arr1,arr2,arr1.length,arr2.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public static void merge(int arr1[], int arr2[], int n, int m) {
        int p1=0,p2=0,p1e=n-1;
        while(p1<=p1e && p2<m){
            if(arr1[p1]<arr2[p2]){
                p1++;
            }else {
                int t = arr2[p2];
                arr2[p2]=arr1[p1e];
                arr1[p1e]=t;
                p1e--;
                p2++;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
