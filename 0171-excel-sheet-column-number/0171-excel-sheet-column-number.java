class Solution {
    public int titleToNumber(String columnTitle) {
        long result = 0;
        int currValue = 0;
        // int a = (int)'A';
        for( int i = 0; i < columnTitle.length( ); ++i)
        {  
            currValue = (int)columnTitle.charAt( i ) - 'A' + 1;
            result += Math.pow( 26 , columnTitle.length( ) - 1 - i ) * currValue;
        }
        return (int) result;
    }
}