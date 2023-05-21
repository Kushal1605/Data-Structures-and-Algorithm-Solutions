/*
 * https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
 */

 class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        int start = 0, end = 0; 
        long maxSum = 0, sum = 0;
        while(end < Arr.size()) {
            sum += Arr.get(end);
            if(end - start + 1 == K) {
                maxSum = Math.max(sum, maxSum);
                sum -= Arr.get(start);
                start += 1;
            }
            end += 1;
        } 
        return Math.max(sum, maxSum);
    }
}
