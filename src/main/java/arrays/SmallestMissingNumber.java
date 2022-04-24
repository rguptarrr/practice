package arrays;

public class SmallestMissingNumber {

    public static void main(String[] args) {
        int a[] = {-47,1,4,49,-18,10,26,18,-11,-38,-24,36,44,-11,45,20,-16,28,17,-49,47,-48,-33,42,2,6,-49,30,36,-9,15,39,-6,-31,-10,-21,-19,-33,47,21,31,25,-41,-23,17,6,47,3,36,15,-44,33,-31,-26,-22,21,-18,-21,-47,-31,20,18,-42,-35,-10,-1,46,-27,-32,-5,-4,1,-29,5,29,38,14,-22,-9,0,43,-50,-16,14,-26};
        System.out.println(missingNumber(a,a.length));
    }

    static int missingNumber(int arr[], int size)
    {
        int end=size;
        int ptr=0;
        int zero=0;
        while(ptr<end){
            if(arr[ptr]==0){
                zero++;
                arr[ptr]=-1;
            }else if(arr[ptr]<0){
                end--;
                int t = arr[ptr];
                arr[ptr]=arr[end];
                arr[end]=t;
            }else ptr++;
        }


        for(int i = 0;i<end;i++){
            if(Math.abs(arr[i])<=size){
                int index = Math.abs(arr[i])-1;
                if(arr[index]>0) arr[index]=-1*arr[index];
            }
        }

        for(int i = 0;i<end;i++){
            if(arr[i]>0) return i+1;
        }
        return end+1;
    }
}
