// Print reverse of array Using recursion.
class Solution {
    private static void printArray(int [] arr, int index) {
        if(index == arr.length) return;
        System.out.print(arr[index] + " ");
        printArray(arr, index + 1);
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(arr, 0);
    }
}


