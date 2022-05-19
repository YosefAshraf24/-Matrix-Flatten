
import java.util.Arrays;

public class MatrixFlatten {
    int[] vector1D;
    public MatrixFlatten(int n,int m,int p){
        int q = n*m*p;
        vector1D = new int[q];
    }
    public void convert(int[][][] list,int i,int j,int k){
        int length2D = list[0].length;
        int length1D = list[0][0].length;
        int y = (length1D * length2D * i )+ (length1D * j) + k;
        vector1D[y] = list[i][j][k];
    }
    public void print(){
        System.out.println(Arrays.toString(vector1D));
    }
}
