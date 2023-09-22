class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        int currentProduct = 1;
        for(int i = 1; i<result.length; ++i )
        {
            currentProduct = currentProduct * nums[ i - 1];
            result[i] = currentProduct;
        }
         currentProduct = 1;
        for(int i = result.length-2; i>=0; --i )
        {
           currentProduct = currentProduct * nums[ i + 1];
           result[i] *= currentProduct;
        }
        return result;
    }
}