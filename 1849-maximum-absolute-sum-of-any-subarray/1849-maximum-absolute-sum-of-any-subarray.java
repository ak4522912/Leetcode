class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum  =  0 ;
        int sum = 0;
        for( int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            maxSum = Math.max( Math.abs( sum ) , maxSum );
            if(sum<0)
            {
                sum = 0;
            }
            // sum = 0;
            // for ( int j = i; j< nums.length; j++)
            // {
            //     sum += nums[j];
            //     maxSum = Math.max( Math.abs( sum ) , maxSum );
            // }
        }
        sum = 0;
        for( int i = 0; i < nums.length; ++i ) 
        {
            sum += nums[ i ];
            maxSum = Math.max( Math.abs( sum ) , maxSum );
            if(sum>0)
            {
                sum = 0;
            }
        }
        return maxSum;
    }
}