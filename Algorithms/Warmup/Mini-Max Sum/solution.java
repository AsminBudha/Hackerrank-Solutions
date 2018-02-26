import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        quickSort(arr,0,4);
        long maxSum=0;
        long minSum=0;
        for(int i=0;i<5;i++){
            if(i!=0)
                maxSum+=arr[i];
            if(i!=4)
                minSum+=arr[i];
        }
        System.out.println(minSum+" "+maxSum);
    }
    
    public static void quickSort(int[] arr,int l,int r){
        if(l<r){
            int m=partition(arr,l,r);
            quickSort(arr,l,m-1);
            quickSort(arr,m+1,r);
        }
    }
    public static int partition(int arr[],int l,int r){
        int p=arr[l],x=l,y=r;
        while(x<y){
            while(arr[x]<=p && x<r){
                x++;
            }
            while(arr[y]>=p && y>l){
                y--;
            }
            if(x<y){
                int temp=arr[x];
                arr[x]=arr[y];
                arr[y]=temp;
            }
        }
        arr[l]=arr[y];
        arr[y]=p;
        return y;
    }
}
