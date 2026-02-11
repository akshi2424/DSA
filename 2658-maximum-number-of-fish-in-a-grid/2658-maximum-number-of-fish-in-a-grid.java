class Solution {
    public int findMaxFish(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0){
                    int maxAns=dfs(grid,i,j);
                    count=Math.max(count,maxAns);
                }
            }
        }
        return count;
    }

    int  dfs(int grid[][],int i,int j){
        if(i>=grid.length || i<0 || j<0 || j>=grid[0].length || grid[i][j]==0)return 0;
        int maxAns=grid[i][j];
        grid[i][j]=0;
        maxAns+=dfs(grid,i+1,j);
        maxAns+=dfs(grid,i-1,j);
        maxAns+=dfs(grid,i,j+1);
        maxAns+=dfs(grid,i,j-1);
        return maxAns;
    }
}