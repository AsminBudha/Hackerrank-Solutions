import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int a[]=new int[3];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]==0){
                a[0]++;
            }
            else if(arr[arr_i]>0){
                a[1]++;
            }
            else if(arr[arr_i]<0){
                a[2]++;
            }
        }
        //DecimalFormat df = new DecimalFormat();
        //df.setMaximumFractionDigits(6);
        
        System.out.printf("%.6f\n",(float)a[1]/n);
        System.out.printf("%.6f\n",(float)a[2]/n);
        System.out.printf("%.6f\n",(float)a[0]/n);
        //System.out.println(df.format((float)a[0]/n));
        //System.out.println(df.format((float)a[2]/n));
    }
}
