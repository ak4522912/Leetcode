class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        long reverseNum = 0;
        int num = x;
        int lastDigit;
        while(x>0)
        {   lastDigit = x % 10;
            reverseNum = reverseNum * 10 +(lastDigit);
            x=x/10;
        }
        
        if( num == (int)reverseNum) return true;
        return false;
    }
}