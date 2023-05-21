// Find max in given array using recursion.
class Solution {
    private static int findMax(int [] arr, int index) {
        if(index == 0) return arr[index];
        return Math.max(arr[index], findMax(arr, index - 1));
    }
    public static void main(String[] args) {
        int [] arr = {8, 4, 7, -1, 16, -9, 4, 9, 6};
        System.out.println(findMax(arr, arr.length - 1));
    }
}