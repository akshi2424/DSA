class Solution {
    public boolean dfs(int node,boolean vis[],boolean rec[],Stack<Integer>st,List<List<Integer>>ls){
        vis[node]=true;
        rec[node]=true;

        for(int n:ls.get(node)){
            if(!vis[n]){
                if(dfs(n,vis,rec,st,ls))return true;
            }if(rec[n])return true;
        }
        st.push(node);
        rec[node]=false;
        return false;
    }
    
    public int[] findOrder(int V, int[][] prerequisites) {
        List<List<Integer>>ls=new ArrayList<>();

        for(int i=0;i<V;i++){
            ls.add(new ArrayList<>());
        }
        for(int edge[]:prerequisites){
            int u=edge[0];
            int v=edge[1];
            ls.get(v).add(u);
        }

        boolean rec[]=new boolean[V];
        boolean vis[]=new boolean[V];
        Stack<Integer>st=new Stack<>();

        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(dfs(i,vis,rec,st,ls)){
                    return new int[]{};
                }
            }
        }

        int ar[]=new int[V];
        int j=0;
       while(!st.isEmpty()){
        ar[j++]=st.pop();
       }
       return ar;
    }
}