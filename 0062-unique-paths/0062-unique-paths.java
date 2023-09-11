class Solution {
    public int uniquePaths(int m, int n) {
        int steps = n + m - 2;
        // if(m == 0 & n==0) return 0;
        long result = 1;
        for( int i = 1; i<= m-1; ++i)
        {
            result = result * ( steps - (m - 1) + i ) / i ;
        }
        return (int)result;
    }
}