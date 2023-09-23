class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int left = start + 1;
        int last = nums.length - 1;
       
        List<List<Integer>> result = new ArrayList<>();
        while( start< nums.length - 2 )
        {   left = start+1;
            last = nums.length - 1;
            while(left<last)
            {
                if(nums[start]+nums[left]+nums[last] == 0)
                {    List<Integer> resultRow = new ArrayList<>();
                    resultRow.add(nums[start]);
                    resultRow.add(nums[left]);
                    resultRow.add(nums[last]);
                    // Collections.sort(resultRow);
                    result.add(resultRow);
                    int prevValue = nums[left];
                while(left<nums.length && nums[left]==prevValue )
                {
                    ++left;
                }
                }
                else if(nums[start]+nums[left]+nums[last] < 0)
                { 
                    int prevValue = nums[left];
                while(left<nums.length && nums[left]==prevValue )
                {
                    ++left;
                }
                }
                else {  
                int prevValue = nums[last];
                while(last>0 && nums[last]==prevValue )
                {
                    --last;
                }
                }
            }
            int prevValue = nums[start];
             while(nums[start]==prevValue && start<nums.length-2)
                {
                    ++start;
                }
        }
        return result;
    }
}