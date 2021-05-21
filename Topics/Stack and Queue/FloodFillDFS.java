import java.util.Arrays;

public class FloodFillDFS {
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

    public static void main(String[] args) {
        int[][] test = new int[][] { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
        FloodFillDFS obj = new FloodFillDFS();
        int[][] sol = obj.floodFill(test, 1, 1, 2);
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[0].length; j++) {
                System.out.print(sol[i][j]);
            }
            System.out.println("\n");
        }
    }
}
