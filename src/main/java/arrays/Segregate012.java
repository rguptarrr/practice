package arrays;

import java.util.Arrays;

public class Segregate012 {

    public static void main(String[] args) {
        int a[] = {2, 0, 2, 0, 0, 1, 2, 2, 2 };
        sort012(a,a.length);
        System.out.println(Arrays.toString(a));
    }

    public static void sort012(int a[], int n)
    {
        int l=0,m=0,h=n-1;
        while(m<=h){
            switch (a[m]){
                case 0 :
                    a[m]=a[l];
                    a[l]=0;
                    l++;
                    m++;
                    break;
                case 1 :
                    m++;
                    break;
                case 2 :
                    a[m]=a[h];
                    a[h]=2;
                    h--;
            }
        }

    }
}
