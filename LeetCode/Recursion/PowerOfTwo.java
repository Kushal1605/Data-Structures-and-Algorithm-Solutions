/*
 * https://leetcode.com/problems/power-of-two/
 */

public class PowerOfTwo {
    public static boolean checkPowerOfTwo(int num, int n) {
        if(num <= 0)
            return false;
        else if (num == n)
            return true;
        else 
            return checkPowerOfTwo(2*num, n);
    }

    public static boolean isPowerOfTwo(int n) {
        if(n <= 0)
            return false;
        else   
            return checkPowerOfTwo(1, n);
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(32));
        System.out.println(isPowerOfTwo(101));
        System.out.println(isPowerOfTwo(-1024));
    }
}
