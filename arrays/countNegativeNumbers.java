class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        // rows is grid.length
        // colums is grid[0].length 
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]<0)
                count++;
            }
        }
        return count;
        
    }
}