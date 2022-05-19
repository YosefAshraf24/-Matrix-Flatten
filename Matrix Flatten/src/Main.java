
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int n = in.nextInt();
        int m = in.nextInt();
        int p = in.nextInt();
        int[][][] list = new int[n][m][p];
        MatrixFlatten matrix = new MatrixFlatten(n,m,p);
        System.out.println("Enter matrix : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int k=0;k<p;k++){
                    System.out.printf("Element[%d][%d][%d]\n",i,j,k);
                    list[i][j][k] = in.nextInt();
                    matrix.convert(list,i,j,k);
                }
            }
        }
        System.out.println("1D vector");
        matrix.print();

    }
}
