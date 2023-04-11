/*
 * https://leetcode.com/problems/combination-sum/
 */

import java.util.*;
public class CombinationSum {
    public static void solve(int[] candidates, int target, int index, List<Integer> subset, List<List<Integer>> powerset, int sum) {
        if(sum == target) {
            powerset.add(new ArrayList<>(subset));
            return;
        }
        if(sum > target) return;
        if(index >= candidates.length) return;

        if(candidates[index] <= target) {
            subset.add(candidates[index]);
            sum += candidates[index];
            solve(candidates, target, index, subset, powerset, sum);
            sum -= candidates[index];
            subset.remove(subset.size() - 1);
        }
        solve(candidates, target, index + 1, subset, powerset, sum);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> powerset = new ArrayList<>();
        solve(candidates, target, 0,subset, powerset, 0);
        return powerset;
    }
    public static void main(String[] args) {
        int [] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }
}
