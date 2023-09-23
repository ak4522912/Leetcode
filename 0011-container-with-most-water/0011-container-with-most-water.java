class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int leftPointer  = 0;
        int rightPointer = height.length - 1;
        while(leftPointer<rightPointer)
        {
            int area = Math.min( height[leftPointer], height[rightPointer]) * (rightPointer - leftPointer);
            max = Math.max(area,max);
            if(height[leftPointer]<height[rightPointer])
            {
                ++leftPointer;
            }
            else{
                --rightPointer;
            }
        }
        // int[] maxLeft = new int[height.length];
        // int[] maxRight = new int[height.length];
        // int max = height [0];
        // for(int i = 0;i<height.length;++i)
        // {
        //     max = Math.max(max,height[i]);
        //     maxLeft[i] = max;
        // }
        // max = height[height.length - 1];
        //  for(int i = height.length - 1;i>=0;--i)
        // {
        //     max = Math.max(max,height[i]);
        //     maxRight[ i ] = max;
        // }
        // max = 0;
        // for(int i = 0;i<height.length/2;++i)
        // {
        //     int length = Math.min(maxLeft[i],maxRight[height.length-1-i] );
        //     int width = height.length -1 -i -i;
        //     int area = length * width;
        //     max= Math.max( area,max);
        // }
        return max;
    }
}