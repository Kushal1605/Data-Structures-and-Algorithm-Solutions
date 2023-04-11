/*
 * https://leetcode.com/problems/subsets/
 */

import java.util.*;
public class Subsets1 {
    public static void solve(int [] arr, int index, List<Integer> subset, List<List<Integer>> powerset) {
        if (index == arr.length) {
            powerset.add(new ArrayList<>(subset));
            return;
        }
        subset.add(arr[index]);
        solve(arr, index + 1, subset, powerset);
        subset.remove(subset.size() - 1);
        solve(arr, index + 1, subset, powerset);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<Integer>();
        solve(nums, 0, subset, res);
        return res;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
}