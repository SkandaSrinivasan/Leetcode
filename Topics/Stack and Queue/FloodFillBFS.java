import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class FloodFillBFS {
    static List<int[]> DIRECTIONS = Arrays.asList(new int[] { 1, 0 }, new int[] { 0, 1 }, new int[] { -1, 0 },
            new int[] { 0, -1 });

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int startColor = image[sr][sc];
        BFS(image, sr, sc, newColor, startColor);
        return image;
    }

    public void BFS(int[][] image, int x, int y, int newColor, int startColor) {
        Deque<int[]> q = new ArrayDeque<>();
        q.add(new int[] { x, y });
        while (!q.isEmpty()) {
            int[] curr = (int[]) q.poll();
            int r = curr[0];
            int c = curr[1];
            for (int[] dir : DIRECTIONS) {
                int dirR = r + dir[0];
                int dirC = c + dir[1];
                if (dirR >= image.length || dirR < 0 || dirC >= image[0].length || dirC < 0 || image[dirR][dirC] == newColor || image[dirR][dirC] != startColor)
                    continue;
                q.add(new int[] { dirR, dirC });
                image[dirR][dirC] = newColor;
            }
            image[r][c] = newColor;
        }
    }

    public static void main(String[] args) {
        int[][] test = new int[][] { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
        FloodFillBFS obj = new FloodFillBFS();
        int[][] sol = obj.floodFill(test, 1, 1, 2);
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[0].length; j++) {
                System.out.print(sol[i][j]);
            }
            System.out.println("\n");
        }
    }
}
