/*
 * https://leetcode.com/problems/power-of-three/
 */

public class PowerOfThree {
    public static boolean checkPowerofThree(int num, int n) {
        if(num <= 0)
            return false;
        else if (num == n)
            return true;
        else 
            return checkPowerofThree(3*num, n);
    }

    public static boolean isPowerOfTwo(int n) {
        if(n <= 0)
            return false;
        else   
            return checkPowerofThree(1, n);
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(27));
        System.out.println(isPowerOfTwo(101));
        System.out.println(isPowerOfTwo(-81));
    }
}
