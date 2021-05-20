import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class wallsAndGates{
    int EMPTY = Integer.MAX_VALUE;
    int GATE = 0;
    int WALL = -1;
    List<int[]> DIRECTIONS = Arrays.asList(
        new int[] {1,0},
        new int[] {-1,0},
        new int[] {0, 1},
        new int[] {0, -1}
    );
    public void wallsAndGates(int[][] rooms) {
        int m = rooms.length;
        int n = rooms[0].length;
        if(m == 0) return;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < m;i++){
            for(int j = 0;j < n;j++){
                if(rooms[i][j] == GATE)
                    q.add(new int[]{i,j});
            }
        }
        while(!q.isEmpty()){
            int [] room = q.poll();
            int row = room[0];s
            int col = room[1];
            for(int [] direction: DIRECTIONS){
                int r = row+direction[0];
                int c = col+direction[1];
                if(r < 0 || c < 0 || r >= m || c >=n || rooms[r][c] != EMPTY){
                    continue;
                }
                rooms[r][c] = rooms[row][col] + 1;
                q.add(new int[] {r,c}); 

            }
        }
    }
    public static void main(String[] args){
        int[][] rooms = new int[][]{{2147483647,-1,0,2147483647},
        {2147483647,2147483647,2147483647,-1},
        {2147483647,-1,2147483647,-1},
        {0,-1,2147483647,2147483647}};
        
        
    }
}