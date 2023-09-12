class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = start;
        int end  = nums.length -1;
        if ( nums.length < 2 ) return ;
        while( mid <= end )
        {
            if ( nums[ mid ] == 0 )
            {
                // nums[ start ] = nums[ start ] ^ nums[ mid];
                // nums[ mid ] = nums[ start ] ^ nums[ mid ];
                // nums[ start ] = nums[ start ] ^ nums[ mid ];
                int temp = nums [mid];
                nums[mid] = nums [ start ];
                nums[ start ] = temp;
                ++start;
                ++mid;
            }

            else if( nums[ mid ] == 1 )
            {
                ++mid;
            }
            else{
                // nums[ mid ] = nums[ mid ] ^ nums[ end];
                // nums[ end ] = nums[ mid ] ^ nums[ end];
                // nums[ mid ] = nums[ mid ] ^ nums[ end];
                int temp = nums[mid];
                nums[mid] = nums[ end];
                nums[ end ] = temp;
                --end;
            }
        }
    }
}