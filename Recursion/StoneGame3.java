public class StoneGame3 {
    private static int solve(int [] stoneValue, int index) {
        if (index >= stoneValue.length)
            return 0;
        int oneStone = Integer.MIN_VALUE, twoStone = oneStone, threeStone = oneStone;
        oneStone = stoneValue[index] - solve(stoneValue, index + 1);

        if (index + 1 >= stoneValue.length)
            return oneStone;

        twoStone = stoneValue[index] + stoneValue[index + 1] - solve(stoneValue, index + 2);

        if (index + 2 >= stoneValue.length)
            return Math.max(oneStone, twoStone);

        threeStone = stoneValue[index] + stoneValue[index + 1] + stoneValue[index + 2] - solve(stoneValue, index + 3);
        return Math.max(oneStone, Math.max(twoStone, threeStone));
    }

    public static String stoneGameIII(int[] stoneValue) {
        int score = solve(stoneValue, 0);
        if (score > 0)
            return "Alice";
        else if (score == 0)
            return "Tie";
        else 
            return "Bob";
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,7};
        System.out.println(stoneGameIII(arr));
    }
}