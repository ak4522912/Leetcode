class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length<=1)
        {return;}
        k = k % nums.length;
        if(k==0)
            return ;
        nums = reverse(nums,0,nums.length-1);
        nums=reverse(nums,0,k-1);
        nums=reverse(nums,k,nums.length-1);
        return;
        
    }
    public static int[] reverse(int[] nums,int start,int end)
    {
        while(start<end)
        {
            nums[start] = nums[start]+nums[end];
            nums[end] = nums[start]-nums[end];
            nums[start] = nums[start]-nums[end];
            start++;end--;
        }
        return nums;
    }
}