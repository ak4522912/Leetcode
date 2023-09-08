class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        boolean up = true;
        int[] result = new int[ mat.length * mat[ 0 ].length ];
        
        // if (mat.length == 1 && mat[0].length ==1)
        // {
        //     return mat[0];
        // }
        int row  = 0; 
        int col = 0;
        int resultIterator = 0;
        while( row < mat.length && col < mat[ 0 ].length )
        {
            if( up == true )
            { 
                 while(row > 0 &&  col< mat[ 0 ].length -1)
            {   
               
                result[ resultIterator++ ] = mat[ row ][ col ];
                 --row;
                ++col;
            }
            result[ resultIterator++ ] = mat[ row ][ col ];
            if(col == mat[ 0 ].length -1 )
            {
                ++row;
            }
            else{
                ++col;
            }

             up = false;   
            }
            else
            { 
                 while( row< mat.length - 1 &&  col > 0 )
            {   result[ resultIterator++ ] = mat[ row ][ col ];
                 ++row;
                 --col; 
            }
            result[ resultIterator++ ] = mat[ row ][ col ];
            if(row == mat.length - 1 )
            {
                ++col;
            }
            else{
                ++row;
            }
                up = true;
            }

        }
        return result;

        // if ( count % 2 == 0 )
        // {   leftCol = 0;
        //     int leftRow = currLeftRow
        //     while ( leftCol < mat[i].length && leftRow >= 0 )
        //     {
        //         System.out.println( mat[leftRow][leftCol] );
        //         ++leftCol;
        //         --leftRow;
        //     }
        //     if()
        //     currLeftRow+=2;
        // }
        // else{
        //     leftCol = 0;
        //     int leftRow = currLeftRow
        //     while ( leftCol < mat[i].length && leftRow >= 0 )
        //     {
        //         System.out.println( mat[leftRow][leftCol] );
        //         ++leftCol;
        //         --leftRow;
        //     }
        //     currLeftRow+=2;
        // }

        
        
    }
}