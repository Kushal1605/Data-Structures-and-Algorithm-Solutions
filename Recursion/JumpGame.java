/*
 *https://leetcode.com/problems/jump-game/
 */

// Throws TLE

class Solution {
    public boolean canJump(int[] nums) {
        return canReachLastIndex(nums, 0);
    }
    private boolean canReachLastIndex(int [] nums, int index) {
        if(index == nums.length - 1) return true;
        if(index > nums.length - 1)  return false;
        boolean canJump = false;
        int maxJump = nums[index];
        for(int i = 1; i <= maxJump; i++) {
            canJump |= canReachLastIndex(nums, index + i);
        }
        return canJump;
    }
}
