class Solution {
    public int waysToMakeFair(int[] nums) {
        int[] oddsum = new int[nums.length];
        int[] evensum = new int [nums.length];
        int even = 0,odd=0;
        for(int i=0;i<nums.length;i++)
        {   if(i%2==0)
        { even+= nums[i];
                    }
         else{
             odd+=nums[i];
         }
         evensum[i] = even;
            oddsum[i] = odd;

    }   even =0;odd=0;
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {

                 odd = evensum[nums.length-1] - evensum[i] + oddsum[i] ;
                even = oddsum[nums.length-1] - oddsum[i] + evensum[i] - nums[i];
                
            }
            else{

                 odd = evensum[nums.length-1] - evensum[i] + oddsum[i] - nums[i] ;
                even = oddsum[nums.length-1] - oddsum[i] + evensum[i] ;
            }
            if(odd==even)
            {
                count++;
            }
            
        }
        return count;
}
}