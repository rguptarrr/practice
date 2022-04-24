package arrays;

public class CelebrityProblem {

    public static void main(String[] args) {
        int a[][] ={{0,1,0},{0,0,0},{0,1,0}};
        System.out.println(celebrity(a,a.length));
    }

    static int celebrity(int M[][], int n) {
        for(int i = 0;i<n;i++){
            int hsum=0,vsum=0;
            for(int j = 0;j<n;j++){
                hsum+=M[i][j]%10;
                vsum+=M[j][i]%10;
            }
            M[i][n-1]=(hsum*10) + M[i][n-1];
            M[n-1][i]=(vsum*10) + M[n-1][i];
        }
        for(int i = 0;i<n;i++){
            if(M[i][n-1]%10==0 && M[n-1][i]/10==n-1){
                return i;
            }
        }
        return -1;
    }
}
