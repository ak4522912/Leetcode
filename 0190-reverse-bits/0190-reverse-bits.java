public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        //  if( n==1 )
        // {return n;}
        int result = 0;
        for(int i = 31; i >= 0; --i )
        {
            if( ( ( 1 << ( 31 - i)  ) & n ) != 0)
            { result |= ( 1 << i ); }
        }

        return result;
    }

}