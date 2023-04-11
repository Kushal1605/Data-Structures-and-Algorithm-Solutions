/*
 * https://leetcode.com/problems/subsets-ii/
 */

import java.util.*;
public class Subsets2 {
    public static void solve(int [] arr, int index, List<Integer> subset, List<List<Integer>> ps) {
        if (index == arr.length) {
            ps.add(new ArrayList<>(subset));
            return;
        }
        subset.add(arr[index]);
        solve(arr, index + 1, subset, ps);
        subset.remove(subset.size() - 1);
        while(index + 1 < arr.length && arr[index] == arr[index + 1])
            index += 1;
        solve(arr, index + 1, subset, ps);
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<Integer>();
        solve(nums, 0, subset, res);
        return res;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,2};
        System.out.println(subsetsWithDup(nums));
    }
}
