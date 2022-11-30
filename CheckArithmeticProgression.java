import java.io.*;
import java.util.*;

class Solution {
    boolean checkIsAP(int arr[], int n) {
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        long sum = 0;
        for (long i : arr) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
            sum += i;
        }
        if (sum == (n * (max + min)) / 2)
            return true;
        else
            return false;
    }
}

class CheckArithmeticProgression {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {

            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = scanner.nextInt();

            Solution ob = new Solution();

            boolean ans = ob.checkIsAP(a, n);
            if (ans == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
