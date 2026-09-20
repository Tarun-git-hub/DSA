class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int startingRow=0;
        int startingCol=0;
        int endingRow=n-1;
        int endingCol=n-1;
        int num=1;

        while( startingRow<=endingRow && startingCol<=endingCol){
            // row wise left to right
            for(int col=startingCol;col<=endingCol;col++){
                matrix[startingRow][col]=num++;
            }
            startingRow++;
            // col wise top to bottom
            for(int row=startingRow;row<=endingRow;row++){
                matrix[row][endingCol]=num++;
            }
            endingCol--;
            // row wise right to left
            if(startingRow<=endingRow){
                for(int col=endingCol;col>=startingCol;col--){
                    matrix[endingRow][col]=num++;
                }
                endingRow--;
            }
            // col wise bottom to top
            if(startingCol<=endingCol){
                for(int row=endingRow;row>=startingRow;row--){
                    matrix[row][startingCol]=num++;
                }
                startingCol++;
            }
        }
        return matrix;
    }
}