class Solution {
    public int longestValidSubstring(String word, List<String> forbidden) {
        HashSet<String> set = new HashSet<>();
        int maxForbidden = 0;
        for(String s:forbidden)
        {
            set.add(s);
            maxForbidden = Math.max(maxForbidden,s.length());
        }

        int l = 0; int r=0;
        int max = 0;
        // StringBuilder sb = new StringBuilder("");
        while(r<=word.length())
        {
            // sb.append(word.charAt(r));
            for(int k =r;k>=Math.max(l,r-maxForbidden);--k)
            {   
                // System.out.println(word.substring(k,r)+","+l+","+r+","+k) ; 
                if(set.contains(word.substring(k,r)))
                { 
                    max = Math.max(max,(r-l-1));
                    l = k+1;
                    r=l-1;
                    // sb.delete(0,l);
                    break;
                }
            }
            ++r;
        }
       return Math.max(max,r-l-1); 
    }
}