package arrays;

public class FindMissingAndRepeating {
    int[] findTwoElement(int arr[], int n) {
        int r[] = new int[2];
        for(int i = 0;i<n;i++){
            int index = Math.abs(arr[i])-1;
            if(arr[index]<0) r[0]=index+1;
            else arr[index]=-1*arr[index];
        }
        for(int i = 0;i<n;i++){
            if(arr[i]>0){
                r[1]=i+1;
                return r;
            }
        }
        return r;
    }
}
