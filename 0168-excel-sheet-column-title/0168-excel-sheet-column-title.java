class Solution {
    public String convertToTitle(int columnNumber) {
        
        StringBuilder columnName = new StringBuilder();
        
        while(columnNumber > 0)
        {
            char currChar = (char)( ( ( columnNumber -1 )% 26 ) + (int)'A');
            columnName.append( currChar );
            columnNumber = ( columnNumber - 1 ) / 26 ;
        }
        return columnName.reverse( ).toString( );
    }
}