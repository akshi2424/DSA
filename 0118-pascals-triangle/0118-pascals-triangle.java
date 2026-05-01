class Solution {
    public List<Integer>generateRow(int n){
        int ans=1;
       List<Integer> ls = new ArrayList<>();
        ls.add(1);
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            ls.add(ans);
        }
        return ls;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(generateRow(i));
        }
        return ans;
    }
}