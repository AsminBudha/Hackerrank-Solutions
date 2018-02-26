import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        // Complete this function
        int hr=Integer.valueOf(s.substring(0, 2));
        if(s.charAt(s.length()-2)=='P' && hr<12){
            hr+=12;
        }
        else if(s.charAt(s.length()-2)=='A' && hr==12){
            hr=00;
        }
        s=s.substring(2, s.length()-2);
        s=(hr<10?"0":"")+String.valueOf(hr)+s;
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
