/*
 * https://leetcode.com/problems/frog-jump/
 */
 
//  Throws TLE
 
class Solution {
    public boolean canCross(int[] stones) {
        if(stones[1] != 1) return false;
        HashSet<Integer> set = new HashSet<>();
        for(int i : stones)
            set.add(i);
        return check(set, stones[stones.length - 1], 1, 1);
    }
    private boolean check(HashSet stones, int target, int prevJump, int currPosition) {
        if(currPosition > target)
            return false;
        if(currPosition == target)
            return true;
        boolean canCross = false;
        if(stones.contains(currPosition)) {
            if(prevJump > 1)
                canCross |= check(stones, target, prevJump - 1, currPosition + prevJump - 1);
            canCross |= check(stones, target, prevJump, currPosition + prevJump);
            canCross |= check(stones, target, prevJump + 1, currPosition + prevJump + 1);
        }
        return canCross;
    }
}
