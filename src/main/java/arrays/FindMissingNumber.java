package arrays;

public class FindMissingNumber {


    int MissingNumber(int a[], int n) {
        long sn = n*(n+1)/2;
        long as=0;
        for(int i : a) as=as+i;
        return (int)(sn - as);
    }
}
