import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int n=scan.nextInt();
        int r=scan.nextInt();
        
        int[][] arr=new int[m][n];
        
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                arr[i][j]=scan.nextInt();
        
        for (int j = 0; j < Math.min(m, n) / 2; j++) {//index to start rotation
            int lim=(r%((m-(2*j))+(n-1-(2*j))+(m-1-(2*j))+(n-2-(2*j))));
            for (int i = 0; i < lim; i++) {//no of rotations
                int temp = arr[j][j];
                for (int k = j + 1; k < m - j; k++) {//left part shift
                    int inTemp = arr[k][j];
                    arr[k][j] = temp;
                    temp = inTemp;
                }

                //bootom part shift
                for (int k = j + 1; k < n - j; k++) {
                    int inTemp = arr[m - j - 1][k];
                    arr[m - j - 1][k] = temp;
                    temp = inTemp;
                }

                //right part shift
                for (int k = m - 2 - j; k >= j; k--) {
                    int inTemp = arr[k][n - j - 1];
                    arr[k][n - j - 1] = temp;
                    temp = inTemp;
                }
                //top part shift
                for (int k = n - 2 - j; k >= j; k--) {
                    int inTemp = arr[j][k];
                    arr[j][k] = temp;
                    temp = inTemp;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
