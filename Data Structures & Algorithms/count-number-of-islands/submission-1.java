class Solution {
    private static final int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

    public int numIslands(char[][] grid) {

        int row = grid.length;
        int col = grid[0].length;
        int island = 0;

        for(int r=0; r<row; r++){
            for(int c = 0; c<col; c++){
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
            return ;
        }

        grid[r][c] = '0';
        for(int[] dirs: directions){
            dfs(grid, r + dirs[0], c+dirs[1]);
        }
    }
}
