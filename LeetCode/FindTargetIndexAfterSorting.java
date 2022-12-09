/**
 * https://leetcode.com/problems/find-target-indices-after-sorting-array/
 */

import java.util.*;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        int low = 0, targetCount = 0;
        for(Integer i : nums){
            if(i < target)
                low++;
            if(i == target)
                targetCount++;
        }
        while(targetCount-- > 0)
            res.add(low++);
        return res;
    }
}
public class FindTargetIndexAfterSorting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int [] nums = new int[size];

        for(int i = 0; i < size; i++)
            nums[i] = scanner.nextInt();

        int target = scanner.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.targetIndices(nums, target));
        
    }
}