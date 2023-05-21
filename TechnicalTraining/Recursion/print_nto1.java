// Print numbers from n to 1 using recursion.
class Solution {
    private static void printNum(int n) {
        if (n <= 0) return;
        System.out.print(n + " ");
        printNum(n - 1);
    }
    public static void main(String[] args) {
        printNum(50);
    }
}