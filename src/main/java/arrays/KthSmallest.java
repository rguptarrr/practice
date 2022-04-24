package arrays;

import com.sun.javafx.image.IntPixelGetter;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallest {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(kthSmallest(a,0,8,3));
    }

    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue(k + 1, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2,o1);
            }
        });
        for(int i = l;i<=r;i++){
            pq.add(arr[i]);
            if(pq.size()>k) pq.poll();
        }
        return pq.poll();
    }
}
