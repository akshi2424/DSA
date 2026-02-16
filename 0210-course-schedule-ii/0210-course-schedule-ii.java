class Solution {
    boolean dfs(boolean vis[],boolean rec[],ArrayList<ArrayList<Integer>>arr,Stack<Integer>st,int node){
        vis[node]=true;
        rec[node]=true;

        for(int n:arr.get(node)){
            if(!vis[n]){
                if(dfs(vis,rec,arr,st,n))return true;
            }if(rec[n])return true;
        }
        rec[node]=false;
        st.push(node);
        return false;
    }
    public int[] findOrder(int v, int[][] edges) {
        ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
        
        for(int i=0;i<v;i++){
            arr.add(new ArrayList<>());
        }

        for(int edge[]:edges){
            int u=edge[0];
            int m=edge[1];
            arr.get(m).add(u);
        }
        
        boolean rec[]=new boolean[v];
        boolean vis[]=new boolean[v];
        Stack<Integer>st=new Stack<>();

        for(int i=0;i<v;i++){
            if(!vis[i]){
                if(dfs(vis,rec,arr,st,i)){
                    return new int[]{};
                }
            }
        }

        int ans[]=new int[v];
        int i=0;
        while(!st.isEmpty()){
            ans[i++]=st.pop();
        }
        return ans;
    }
}