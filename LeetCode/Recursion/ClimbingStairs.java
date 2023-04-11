/*
 * https://leetcode.com/problems/climbing-stairs/
 */
// Throws TLE
public class ClimbingStairs {
    public static int solveStair(int currStair, int n) {
        if(currStair == n)
            return 1;
        if(currStair > n)
            return 0;
        int leftSum = solveStair(currStair + 1, n);
        int rightSum = solveStair(currStair + 2, n);
        return leftSum + rightSum;
    } 

    public static int climbStair(int n) {
        return solveStair(0, n);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbStair(n));
    }
}
