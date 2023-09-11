class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length ==1) return nums[ 0 ];
        int elem = nums[ 0 ];
        int freq = 1;
        for ( int i = 1; i < nums.length; ++i){
            if ( nums[ i ] == elem)
            {
                ++freq;
            }
            else if(freq >0)
            {
                --freq;
            }
            else{
                elem = nums[ i ];
                freq = 1;
            }
        }
        return elem;
    }
}