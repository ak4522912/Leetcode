class Solution {
    public long countPairs(int[] nums, int k) {
     HashMap<Integer,Long> mods_container = new HashMap<>();
     long res = 0L;
        // for(int i:nums)
        // {
        //     mods_container.put((i%k),mods_container.getOrDefault((i%k),0)+1);
        //     System.out.println((i%k)+" "+mods_container.get(i%k));
        // }
        // Iterator mods_iterator = mods_container.entrySet().iterator();
        // while(mods_iterator.hasNext())
        // {   Map.Entry Number = (Map.Entry)mods_iterator.next();
        //     pair +=  ncr((int)Number.getValue(),2);
        //  System.out.println(pair);
        // }
        // return pair;
        for(int i:nums)
        {
            int gcd = gcd(i,k);
            
            Iterator mods_iterator = mods_container.entrySet().iterator();
             while(mods_iterator.hasNext())
             {
                 Map.Entry Number = (Map.Entry)mods_iterator.next();
                 if(((long)(int)Number.getKey()*gcd)%k==0)
                 {
                     res= res +(long)Number.getValue();
                     //System.out.println(gcd+" "+(int)Number.getValue());
                 }
             }
            mods_container.put(gcd,mods_container.getOrDefault(gcd,0L)+1L);
            //System.out.println(gcd);
        }
        return res;
    }
    static int gcd(int i,int j)
    {
        return i==0?j:gcd(j%i,i);
    }
    // static long ncr(int n, int r)
    // {
    //     return fact(n)/(fact(n-r)*fact(r));
    // }
    // static long fact(int n)
    // {   long ret = 1;
    //     for(long i=2;i<=n;i++)
    //     {
    //         ret = ret * i;
    //     }
    //  return ret;
    // }
}