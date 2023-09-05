class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;
        for ( int iterator: nums )
        {
            ones = ( ( ones ^ iterator) & ( ~twos ) );
            twos = ( ( twos ^ iterator) & ( ~ones ) );
        }
        return ones;
    }
}