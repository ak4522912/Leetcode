class Solution {
    public int mySqrt(int x) {
        if(x==0|x==1)
            return x;
          long low =1,high = x,mid=1;
        
        while(low<high)
        {
             mid = (low+ high)/2;
        
            
            if(mid*mid==x)
            {   
                return (int)mid;
            }
            else if(mid*mid>x)
            {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
           
           }
        mid--;
        while(mid*mid<=x&&mid<46341)
        {
            mid++;
        }
        if(mid>46340)
        {return 46340;} //overflow int
        return (int)(mid-1);
    }
}