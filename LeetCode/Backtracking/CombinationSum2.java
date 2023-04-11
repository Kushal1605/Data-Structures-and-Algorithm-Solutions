/*
 * https://leetcode.com/problems/combination-sum-ii/
 */

import java.util.*;
public class CombinationSum2 {
    public static void solve(int[] candidates, int target, int index, int sum, List<Integer> subset, List<List<Integer>> powerset) {
        if(sum == target) {
            powerset.add(new ArrayList<>(subset));
            return;
        }
        if(sum > target) return;
        if(index >= candidates.length) return;

        if(candidates[index] <= target) {
            subset.add(candidates[index]);
            sum += candidates[index];
            solve(candidates, target, index + 1, sum, subset,  powerset);
            sum -= candidates[index];
            subset.remove(subset.size() - 1);
        }
        while(index + 1 < candidates.length && candidates[index] == candidates[index + 1])
            index += 1;
        solve(candidates, target, index + 1, sum, subset, powerset);
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> powerset = new ArrayList<>();
        solve(candidates, target, 0, 0, subset, powerset);
        return powerset;
    }
    public static void main(String[] args) {
        int [] candidates = {1,2,1,2};
        int target = 2;
        System.out.println(combinationSum2(candidates, target));
    }
}
