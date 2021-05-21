import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
public class Islands {
    static List<int[]> DIRECTIONS = Arrays.asList(
            new int[]{1,0},
            new int[]{0,1},
            new int[]{-1,0},
            new int[]{0,-1}
    );

    public static int numIslands(char[][] grid) {
        int islands = 0;
        int rows = grid.length;
        int columns = grid[0].length;
        if(rows == 0) return 0;

        
        for(int row = 0; row < rows; row++){
            for(int col = 0 ; col < columns; col++){
                if(grid[row][col] == '1'){
                    //Do BFS from here
                    islands++;
                    Queue q = new LinkedList<int[]>();
                    q.add(new int[]{row,col});
                    while(!q.isEmpty()){
                       int[] place = (int[])q.poll();
                       int r = place[0];
                       int c = place[1];
                        for(int[] dir:DIRECTIONS){
                            int dirR = r+dir[0];
                            int dirC = c+dir[1];
                            if(dirR >= rows || dirR < 0 || dirC >= columns || dirC < 0 || grid[dirR][dirC] == '0')
                            continue;
                            q.add(new int[]{dirR,dirC});
                            grid[dirR][dirC] = '0';
                        }
                    }
                }
            }
        }
        return islands;
    }
    public static void main(String[] args){
        char[][] grid = new char[][]{
  {'1','1','1','1','0'},
  {'1','1','0','1','0'},
  {'1','1','0','0','0'},
  {'0','0','0','0','1'}
};
    System.out.println(numIslands(grid));
    }
}
