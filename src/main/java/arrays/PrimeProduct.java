package arrays;

public class PrimeProduct {

    public static void main(String[] args) {
        System.out.println(primeProduct(7,7));
    }

    static long primeProduct(long L, long R){
        if(R==1) return 1;
        if(L==1) L=2;
        long pr = 1;
        long m =(long)(1e9 + 7);
        //Seive of Eranthos
        //1 ≤ L ≤ R ≤ 109
        boolean primeTracker[] = new boolean[(int)(R+1)];
        for(int i = 2;i<=Math.ceil(Math.sqrt(R));i++){
            int j = 2;
            int p = j*i;
            while (p<=R){
                primeTracker[p]=true;
                j++;
                p=i*j;
            }
        }
        for(int i = (int)L;i<R;i++){
            if(!primeTracker[i]) pr = (pr * i)%m;
        }
        return pr;
    }

}
