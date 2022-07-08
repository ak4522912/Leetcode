// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        double sum = sum(arr);
        long sumN = (long)(Math.pow(n,2)+n)/2;
        double a = sum - sumN;
        double N = n;
        double b = sumSqr(arr) - (N*(N+1)*(2*N+1))/6;
        double c = (b/a);
        long x = (int)(a+c)/2;
        long y = (long)(c-a)/2;
        int[] res = new int[2];
        res[0]=(int)x;
        res[1]=(int)y;
        return res;
    }
    
    public static double sum(int[] arr)
    {
        double sum = 0;
        for(int num:arr)
        {
            sum+=num;
        }
        return sum;
    }
    public static double sumSqr(int[] arr)
    {
        double sum = 0;
        for(int num:arr)
        {
            sum+=(double)Math.pow(num,2);
        }
        return sum;
    }
}