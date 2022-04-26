package arrays;

import java.util.ArrayList;

public class SprialTraverseArray {

    public static void main(String[] args) {
        int a[][]={{1},{2},{3},{4}};
        System.out.println(spirallyTraverse(a,a.length,a[0].length));
    }

    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        ArrayList<Integer> st = new ArrayList<>();
        int xmin=0,xmax=r-1,ymin=0,ymax=c-1;
        while(xmin<=xmax && ymin<=ymax){
            for(int i = ymin;i<=ymax;i++){
                st.add(matrix[xmin][i]);
            }
            if(xmin+1>xmax) break;
            for(int i = xmin+1;i<=xmax;i++){
                st.add(matrix[i][ymax]);
            }
            if(ymax-1<ymin) break;
            for(int i = ymax-1;i>=ymin;i--){
                st.add(matrix[xmax][i]);
            }
            for(int i = xmax-1;i>xmin;i--){
                st.add(matrix[i][ymin]);
            }
            xmin++;
            xmax--;
            ymin++;
            ymax--;
        }
        return st;
    }
}
