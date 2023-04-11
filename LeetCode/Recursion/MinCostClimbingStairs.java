/*
 * https://leetcode.com/problems/min-cost-climbing-stairs/
 */

// Throws TLE
public class MinCostClimbingStairs {

    public static int solveStair(int [] cost, int n) {
        if(n <= 1) 
            return 0;
        else    
            return Math.min(cost[n - 1] + solveStair(cost, n -1), cost[n - 2] + solveStair(cost, n -2));
    }

    public static int minCostToClimbStair (int [] cost) {
        return solveStair(cost, cost.length);
    }
    public static void main(String[] args) {
        int [] cost = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostToClimbStair(cost));
    }
}
