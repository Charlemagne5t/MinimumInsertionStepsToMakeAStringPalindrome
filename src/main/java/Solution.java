public class Solution {
    public int minInsertions(String s) {
        int[][] dp = new int[s.length() + 1][s.length() + 1];
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String reversed = sb.toString();

        for (int i = 1; i < s.length() + 1; i++) {
            for (int j = 1; j < reversed.length() + 1; j++) {
                if (s.charAt(i - 1) == reversed.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return s.length() - dp[s.length()][s.length()];
    }

}