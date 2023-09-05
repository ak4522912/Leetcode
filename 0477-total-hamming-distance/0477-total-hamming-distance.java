class Solution {
    public int totalHammingDistance(int[] nums) {
         long total = 0;
        int mod = 1000000007; // Modulo value for large results
        for( int i = 31; i >=0 ;--i )
        {
            long zeroCount = 0;
            
            long oneCount = 0;
            
            for( Integer number : nums)
            {   
                if ( ( number & (1 << i) ) != 0)
                {
                    oneCount++;
                }
                else{
                    zeroCount++;
                }
            }
            total += ( oneCount*zeroCount )  ;
        }
        return (int) ( total % mod ) ;
    }
}