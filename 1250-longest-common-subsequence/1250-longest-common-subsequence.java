class Solution {
    public int longestCommonSubsequence(String A, String B) {
         int[][] dp = new int[A.length()][B.length()];
        // if(A.charAt(0) == B.charAt(0))
        // {
        //     dp[0][0] = 1;
        // }
        // else{
        //     dp[0][0] = 0;
        // }
        int count  = 0;
        for(int i=0;i<dp[0].length;++i) //fill first row
        {   
            if(B.charAt(i)==A.charAt(0)&&count == 0)
            {
                count++;
            }
            dp[0][i] = count;
        }
        count = 0;
        for(int i=0;i<dp.length;++i) //fill first column
        {   
            if(B.charAt(0)==A.charAt(i)&&count == 0)
            {
                count++;
            }
            dp[i][0] = count;
        }
        for(int i=1;i<dp.length;++i)
        {
            for(int j=1;j<dp[0].length;++j)
            {
                if(A.charAt(i)==B.charAt(j))
                {
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[A.length()-1][B.length()-1];
    }
}