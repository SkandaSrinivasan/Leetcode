
public class IslandsDFS {
    int rows;
    int columns;

    public int numIslands(char[][] grid) {
        int islands = 0;
        rows = grid.length;
        columns = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    DFS(i, j, grid);
                }
            }
        }
        return islands;
    }

    public void DFS(int x, int y, char[][] grid) {
        if (x >= rows || x < 0 || y >= columns || y < 0 || grid[x][y] == '0') {
            return;
        }
        grid[x][y] = '0';
        DFS(x + 1, y, grid);
        DFS(x - 1, y, grid);
        DFS(x, y + 1, grid);
        DFS(x, y - 1, grid);

    }

    public static void main(String[] args) {
        char[][] grid = new char[][] { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' },
                { '1', '1', '0', '0', '0' }, { '0', '0', '0', '0', '1' } };
        IslandsDFS ob = new IslandsDFS();
        System.out.println(ob.numIslands(grid));
    }
}
