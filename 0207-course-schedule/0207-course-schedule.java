class Solution {
    public boolean dfs(int node,boolean[] vis,boolean rec[],List<List<Integer>>ls){
        vis[node]=true;
        rec[node]=true;

        for(int nei:ls.get(node)){
            if(!vis[nei]){
                if(dfs(nei,vis,rec,ls)){
                    return true;
                }
            }if(rec[nei]){
                return true;
            }
        }
        rec[node]=false;
        return false;
    }
    public boolean canFinish(int V, int[][] prerequisites) {
        boolean vis[]=new boolean[V];
        boolean resStack[]=new boolean[V];

        List<List<Integer>>ls=new ArrayList<>();
        for(int i=0;i<V;i++){
            ls.add(new ArrayList<>());
        }
        for(int edge[]:prerequisites){
            int u=edge[0];
            int v=edge[1];
            ls.get(v).add(u);
        }
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(dfs(i,vis,resStack,ls)){
                    return false;
                }
            }
        }
        return true;
    }
}