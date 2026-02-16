class Solution {
    public boolean canFinish(int v, int[][] edges) {
        ArrayList<ArrayList<Integer>>arr=new ArrayList<>();

        for(int i=0;i<v;i++){
            arr.add(new ArrayList<>());
        }

        for(int edge[]:edges){
            int u=edge[0];
            int m=edge[1];
            arr.get(m).add(u);
        }

        boolean vis[]=new boolean[v];
        boolean rec[]=new boolean[v];

        for(int i=0;i<v;i++){
            if(!vis[i]){
                if(dfs(vis,rec,arr,i)){
                    return false;
                }
            }
        }
        return true;
    }
    boolean dfs(boolean vis[],boolean rec[],ArrayList<ArrayList<Integer>>arr,int node){
        vis[node]=true;
        rec[node]=true;

        for(int m:arr.get(node)){
            if(!vis[m]){
                if(dfs(vis,rec,arr,m))return true;
            }
            if(rec[m])return true;
        }
        rec[node]=false;
        return false;
    }
}