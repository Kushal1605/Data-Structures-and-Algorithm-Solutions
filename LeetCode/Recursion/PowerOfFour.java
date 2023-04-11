/*
 * https://leetcode.com/problems/power-of-four/
 */

public class PowerOfFour {
    public static boolean checkPowerofFour(int num, int n) {
        if(num <= 0)
            return false;
        else if (num == n)
            return true;
        else 
            return checkPowerofFour(4*num, n);
    }

    public static boolean isPowerOfTwo(int n) {
        if(n <= 0)
            return false;
        else   
            return checkPowerofFour(1, n);
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(64));
        System.out.println(isPowerOfTwo(101));
        System.out.println(isPowerOfTwo(-256));
    }
}
