class Solution {
    public int maxProduct(int[] nums) {
        // int lastOddIndex = -1;
        int max = nums[0];
        int product  = 1;
        // for(int i = 0;i<nums.length;++i)
        // {
        //     if(nums[i]<0)
        //     {
        //         if(lastOddIndex == -1)
        //         {
        //             lastOddIndex = i;
        //         }
        //         else{
        //             lastOddIndex = -1;
        //         }
        //     }
        // }
        for(int i =0;i<nums.length;++i)
        {   
            product*=nums[i];
             max = Math.max(product,max);
             if(product == 0)
             {
                 product = 1;
             }
        }
        product = 1;
         for(int i =nums.length-1;i>=0;--i)
        {   
            product*=nums[i];
             max = Math.max(product,max);
             if(product == 0)
             {
                 product = 1;
             }
        }
        return max;
    }
}