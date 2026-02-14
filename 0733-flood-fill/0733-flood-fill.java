class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int imgCol=image[sr][sc];
        if(imgCol==color || sr<0 || sr>=n || sc<0 || sc>=m)return image;

        dfs(image,sr,sc,color,imgCol);

        return image;
    }

    void dfs(int image[][],int sr,int sc,int color,int imgCol){
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc]!=imgCol){
            return ;
        }

        image[sr][sc]=color;
        dfs(image,sr+1,sc,color,imgCol);
        dfs(image,sr-1,sc,color,imgCol);
        dfs(image,sr,sc+1,color,imgCol);
        dfs(image,sr,sc-1,color,imgCol);

    }
}