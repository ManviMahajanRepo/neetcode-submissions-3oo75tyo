class Solution {
     
    private static final int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

    public int numIslands(char[][] grid) {

        int row = grid.length;
        int col = grid[0].length;
        int island=0;

        for(int r = 0; r < row; r++ ){
            for(int c = 0; c < col; c++){
                if(grid[r][c] == '1'){
                    dfs(grid,r,c);
                    island++;
                }
            }
        }
        return island;

       
        
    }

    public void dfs(char[][] grid, int r, int c){

        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0'){
            return;
        }

        grid[r][c] = '0';
        for(int[] dir: directions){
            dfs(grid, r+dir[0], c+dir[1]);
        }
    }
}
/*
List of list for directions
iterate through the grid, 
call dfs
recursion (base condition)
assign visited =0
return the number of islands
*/
