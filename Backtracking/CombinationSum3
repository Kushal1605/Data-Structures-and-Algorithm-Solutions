/*
 * https://leetcode.com/problems/combination-sum-ii/
 */
 
 public class Solution {
    private void solve(int [] arr, int index, int sum, int currSize, int target, int size, List<Integer> subset, List<List<Integer>> res) {
        if(sum == target && currSize == size) {
            res.add(new ArrayList<>(subset));
            return;
        }
        if(sum > target) return;
        if(index >= arr.length) return;
        if(currSize > size) return;

        if(arr[index] <= target) {
            subset.add(arr[index]);
            sum += arr[index];
            currSize += 1;
            solve(arr, index + 1, sum, currSize, target, size, subset,  res);
            sum -= arr[index];
            currSize -= 1;
            subset.remove(subset.size() - 1);
        }
        while(index + 1 < arr.length && arr[index] == arr[index + 1])
            index += 1;
        solve(arr, index + 1, sum, currSize, target, size, subset, res);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int arr[] = new int[9];
        for(int i = 1; i <= 9; i++) 
            arr[i - 1] = i;
        List<List<Integer>> res = new ArrayList<>();
        solve(arr, 0, 0,0, n, k, new ArrayList<Integer>(), res);
        return res;
    }
}
