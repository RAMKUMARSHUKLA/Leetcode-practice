class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if(image[sr][sc]==color) return image;
        fill(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    public static void fill(int[][] image,int sr,int sc,int color,int initColor)
    {
        //checking if outside Array index
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length) return;
        
        
        //Already updated
        if(initColor!=image[sr][sc]) return;
        
        //Above condition fails then update with new color
        image[sr][sc]=color;
        
        fill(image,sr-1,sc,color,initColor);
        fill(image,sr+1,sc,color,initColor);
        fill(image,sr,sc-1,color,initColor);
        fill(image,sr,sc+1,color,initColor);
    }
}