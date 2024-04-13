package functionalPrograming;

public class SubsequenceCount {

    public static int countSubsequences(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        // Base cases
        for (int j = 0; j <= n; j++)
            dp[0][j] = 1;

        // Fill dp table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
                else
                    dp[i][j] = dp[i][j - 1];
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "HRW";
        String s2 = "HERHRWS";
        System.out.println("Number of times s1 appears as a subsequence in s2: " + countSubsequences(s1, s2));
    }
}
