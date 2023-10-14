class Solution {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        List<String> matrix = new ArrayList<>();
        String default1 = new String("");
        for(int i=0;i<n;++i)
        {
            default1 = default1+ ".";
        }
        for(int i=0;i<n;++i)
        {    
            matrix.add(default1);
            // String[] row = new Integer[n];
            // Arrays.fill(row,'.' );
            // List<String> list = Arrays.asList(row);
            // matrix.add(list);
        }

        boolean[] column = new boolean[n];
        boolean[] left = new boolean[2*n-1];
        boolean[] right = new boolean[2*n-1];

         solve(0, matrix,left,right,column,n);
         return result;
    }

    void solve(int row, List<String> matrix, boolean[] left, boolean[] right,boolean[] column,int n)
    {
        if(row==n)  result.add(new ArrayList<>(matrix));
        for(int i=0;i<n;++i)
        {
            if(column[i]!=true&&left[n-1+i-row]!=true&&right[row+i]!=true)
            {
                char[] matrixRow =  matrix.get(row).toCharArray();
                matrixRow[i]='Q';
                // System.out.println(row+","+i);
                // if(row>0)
                // {
                //     System.out.println(String.valueOf(matrix.get(row-1)));
                // }
                matrix.set(row,String.valueOf(matrixRow));
                column[i] =true;
                left[(n-1)+i-row]=true;
                right[row+i]=true;
                solve(row+1,matrix,left,right,column,n);
                matrixRow =  matrix.get(row).toCharArray();
                matrixRow[i]='.';
                matrix.set(row,String.valueOf(matrixRow));
                 column[i] =false;
                left[(n-1)+i-row]=false;
                right[row+i]=false;
            }
        }
    }
}