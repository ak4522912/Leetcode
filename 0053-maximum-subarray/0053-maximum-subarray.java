class Solution {
    public int maxSubArray(int[] nums) {
        int currsum=0, max_sum= Integer.MIN_VALUE;
        for(int num:nums)
        {
            currsum+=num;
            
            if(currsum<num)
            {
                currsum = num;
                
            }
            max_sum = Math.max(currsum,max_sum);
        }
        return max_sum;
    }
}