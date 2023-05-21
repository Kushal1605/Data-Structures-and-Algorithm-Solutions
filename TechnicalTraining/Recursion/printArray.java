// Print Array Using recursion.
class Solution {
    private static void printArray(int [] arr, int index) {
        if(index < 0) return;
        printArray(arr, index - 1);
        System.out.print(arr[index] + " ");
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(arr, arr.length - 1);
    }
}

