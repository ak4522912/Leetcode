class Solution {
    public int findMin(int[] nums) {
        int result = 0;
        int left = 0;
        int right = nums.length - 1;
        
        result = nums[0];
        while(left<=right)
        {
        int  mid = (left+right)/2;
    
        if(nums[right]<=nums[mid])
        {
            result = Math.min(nums[right],result);
            left = mid+1;
        }
        else
        {   result = Math.min(nums[mid],result);
            right = mid-1;
        }
        }
        return result;
    }
}