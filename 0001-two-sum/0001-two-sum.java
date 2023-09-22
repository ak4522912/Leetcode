class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<>();
        int start=0,end=0;
        for(int i = 0;i<nums.length;++i)
        {
            indexMap.put(nums[ i ],i);
        }
        for( int i =0;i <nums.length; ++i )
        {
            if(indexMap.getOrDefault(target- nums[i],-1) != i && indexMap.getOrDefault(target- nums[i],-1) > 0)
            {
                start = i;
                end = indexMap.get(target- nums[i]);
                break;
            }
        }
        int[] result = new int[2];
        result[0] = start;
        result[1] = end;
        return result;
    }
}