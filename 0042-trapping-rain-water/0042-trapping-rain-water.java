class Solution {
    public int trap(int[] height) {
        int currLeader = 0;
        int[] leftLeader = new int[ height.length ];
        int[] rightLeader = new int[ height.length ];
        for( int i = 0; i < height.length; ++i)
        {
            currLeader = Math.max( currLeader, height[ i ] );
            leftLeader[ i ] = currLeader;
        }
        currLeader = 0;
        for( int i = height.length - 1; i >= 0; --i )
        {
            currLeader = Math.max( currLeader, height[ i ] );
            rightLeader[ i ] = currLeader;
        }
        int count = 0;
        for( int i = 1; i < height.length - 1; ++i )
        {
            count+= Math.max ( Math.min( leftLeader[ i ], rightLeader[ i ] ) - height[ i ] , 0 ) ;
        } 
        return count;
    }
}