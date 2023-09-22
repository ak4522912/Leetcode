class Solution {
    public int maxProfit(int[] prices) {
        int[] rightMax = new int[prices.length];
        int[] leftMin = new int[prices.length];
        int max = prices[prices.length - 1];
        for(int i=rightMax.length - 1; i>=0; --i)
        {   max = Math.max(max,prices[i]);
            rightMax[i] = Math.max(max,prices[i]);
        }
        int min = prices[0];
        for(int i=0; i<prices.length; ++i)
        {   min = Math.min(min,prices[i]);
            leftMin[i] = Math.min(min,prices[i]);
        }
        int sum = 0;
        for(int i=0; i<prices.length; ++i)
        {
            sum = Math.max(rightMax[i] - leftMin[i],sum);
            // System.out.println(rightMax[i] +" ,"+leftMin[i]);
        }
        return sum;
    }
}