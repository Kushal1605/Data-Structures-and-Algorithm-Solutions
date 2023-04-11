public class StoneGame1 {

    public static int winner(int [] piles, int left, int right) {
        if (left > right) 
            return 0;
        else {
            int leftScore = piles[left] - winner(piles, left + 1, right);
            int rightScore = piles[right] - winner(piles, left, right - 1);
            return Math.max(leftScore, rightScore);
        }
    }

    public static boolean stoneGame(int[] piles) {
        int val = winner(piles, 0, piles.length - 1);
        if (val > 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int [] arr = {3,7,2,3};
        System.out.println(stoneGame(arr));
    }
}