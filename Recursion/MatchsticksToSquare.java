/*
 * https://leetcode.com/problems/matchsticks-to-square/
 */

class Solution {
  // Throws TLE
    private boolean isSquare(int [] matchsticks, int index, int up, int down, int left, int right, int sideLength) {
        if(index == matchsticks.length) 
            return up == sideLength && down == sideLength && left == sideLength && right == sideLength;
        boolean res = false;
        res |= isSquare(matchsticks, index + 1, up + matchsticks[index], down, left, right, sideLength);
        res |= isSquare(matchsticks, index + 1, up, down + matchsticks[index], left, right, sideLength);
        res |= isSquare(matchsticks, index + 1, up, down, left + matchsticks[index], right, sideLength);
        res |= isSquare(matchsticks, index + 1, up, down, left, right + matchsticks[index], sideLength);
        return res;
    }
    public boolean makesquare(int[] matchsticks) {
        int totalLength = 0;
        for(int i : matchsticks)
            totalLength += i;
        return isSquare(matchsticks, 0, 0, 0, 0, 0, totalLength/4);
    }
}
