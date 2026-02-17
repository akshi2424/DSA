class Solution {
    public int findCircleNum(int[][] edges) {
        int count=0;
        int n=edges.length;
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(edges,vis,i);
                count++;
            }
        }
        return count;
    }

    void dfs(int [][]edges,boolean vis[],int i){
        vis[i]=true;
        for(int j=0;j<edges.length;j++){
            if(edges[i][j]==1 && !vis[j])dfs(edges,vis,j);
        }
    }
}