class Solution {
    public void rotate(int[][] matrix) {
        int matrixLength = matrix.length;
		for(int i = 0;i < matrixLength; ++i)
		{
			for(int j = 0; j < i; ++j)
			{
				int temp = matrix[ i ][ j ];
				matrix[ i ][ j ] = matrix[ j ][ i ]; 
				matrix[ j ][ i ] =  temp;
			}
			 
		}
        for(int i = 0;i < matrixLength; ++i)
		{
        for( int j = 0; j < ( matrixLength / 2 ); ++j )
			 {
				 int temp = matrix[ i ][ j ];
				matrix[ i ][ j ] = matrix[ i ][ matrixLength - j - 1 ];
				matrix[ i ][ matrixLength - j - 1 ] = temp ; 
			 }
        }
    }
}