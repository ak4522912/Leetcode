class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while ( i < nums.length )
        {   
            if( nums[ i ] <= nums.length && nums [ i ] > 0 )
            {
            if ( nums[ i ] == nums[ nums [ i ] - 1 ] )
            {
                ++i;
                continue;
            }
            
            int temp = nums[ nums [ i ] - 1  ];
            
            nums[ nums [ i ] - 1 ] = nums[ i ];

            nums[ i ] = temp;

            }
            else{
                ++i;
            }
        }
        for( i = 1; i <= nums.length; ++i)
        {
            if ( i != nums[ i -1 ] ) return i;
        }
        return i;
    }
}