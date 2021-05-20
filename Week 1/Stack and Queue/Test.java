class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int startColor = image[sr][sc];
        DFS(image, sr, sc, newColor, startColor);
        return image;
    }

    public void DFS(int[][] image, int x, int y, int newColor, int startColor) {
        if (x < 0 || y < 0 || x >= image.length || y >= image[0].length || newColor == startColor)
            return;
        if(image[x][y] == startColor){
            image[x][y] = newColor;
        DFS(image, x + 1, y, newColor, startColor);
        DFS(image, x - 1, y, newColor, startColor);
        DFS(image, x, y + 1, newColor, startColor);
        DFS(image, x, y - 1, newColor, startColor);
        }
    }
}