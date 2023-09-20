class Solution {
    public List<String> solve(int n){
        if(n==1)
        {
            List<String> result = new ArrayList<>();
            result.add( "0" );
            result.add( "1" );
            return result;
        }
        List<String> prev = solve(n-1);
        int resultSize = prev.size();
        List<String> result = new ArrayList<>();
        for(int i =0; i<resultSize; ++i)
        {
            result.add("0"+prev.get(i));
        }
         for(int i =resultSize - 1; i>=0; --i)
        {
            result.add("1"+prev.get(i));
        }
        return result;
    }
    public List<Integer> grayCode(int n) {
          
       List<Integer> result = new ArrayList<>();
       List<String> stringList = solve(n);
        for(int i = 0; i<stringList.size(); ++i)
        {
            result.add( Integer.parseInt(stringList.get(i),2) );
        }
        return result;
    }
}