class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // if( nums.length < 2 ){ 
        //     ArrayList<Integer> result = new ArrayList<>();
        //     Collections.addAll(result,nums);
        //     return result; 
        //     }
        ArrayList<Integer>  result = new ArrayList<>();
        if(nums.length <2 )
        {
            result.add(nums[0]);
            return result;
        }
                int elem1 = nums[0];
        int freq1 = 0;
        int elem2 = nums[0];
        int freq2 = 0;
        for( int i = 0; i<nums.length; ++i)
        {
            if(elem1 == nums[i])
            {
                ++freq1;
            }
            else if(elem2 == nums[ i ])
            {
                ++freq2;
            }
            else if(freq1 == 0 )
            {
                freq1 = 1;
                elem1 = nums[i];
            }
            else if(freq2==0)
            {
                freq2 = 1;
                elem2 = nums[i];
            }
            else{
                --freq1;
                --freq2;
            }
        }
        
        if(elem1==elem2 )
        {
           result.add(elem1); 
        }
        else{
            int count1 = 0;
            int count2 = 0;
            for(int i = 0;i<nums.length; ++i)
            {
                if(nums[ i ]==elem2) count2++;
                if(nums[ i ]==elem1) count1++;
            }
                //   result.add(elem1);
       
       if (count1 > nums.length/3) result.add(elem1);
       if (count2 > nums.length/3) result.add(elem2);
        }
  
        return result;
    }
}