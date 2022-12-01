/**
 * https://practice.geeksforgeeks.org/problems/check-arithmetic-progression1842/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
 */
import java.io.*;
import java.util.*;

class Solution
{
    boolean checkIsAP(int arr[] ,int n)
    {
        Arrays.sort(arr);
        for(int i = 0;i < arr.length - 2;i++){
            if((arr[i+1] - arr[i]) != (arr[i+2] - arr[i+1]))
                return false;
        }
        return true;
    
    }
}

public class CheckArithmeticProgression {

    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            int n=Integer.parseInt(br.readLine());

            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int a[] = new int[n];
            for(int  i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(a1[i]);
            }
            Solution ob = new Solution();

            boolean ans = ob.checkIsAP(a,n);
            if(ans == true)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}
