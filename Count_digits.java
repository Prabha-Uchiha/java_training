import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count = 0,ld =0;
        while (n>0){
            ld= n%10;
            count++;
            n/=10;
            
        }
        System.out.println(count);
        
    }
}
