package arrays;

public class RainWaterTapping {
    public static void main(String[] args) {
        int i[]={1 ,1, 5, 2, 7, 6, 1, 4, 2, 3};
        System.out.println(trappingWater(i,i.length));
    }
    static long trappingWater(int arr[], int n) {
        int lmax[]=new int[n];
        int lm=arr[0];
        for(int i = 0;i<n;i++){
            lm=Math.max(lm,arr[i]);
            lmax[i]=lm;
        }
        int rm = arr[n-1];
        int rmax[]=new int[n];
        for(int i = n-1;i>=0;i--){
            rm=Math.max(rm,arr[i]);
            rmax[i]=rm;
        }
        long water = 0;
        for(int i = 0;i<n;i++){
            water+=Math.min(lmax[i],rmax[i])-arr[i];
        }
        return water;
    }
}
