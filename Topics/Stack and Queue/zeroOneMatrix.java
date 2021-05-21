import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class zeroOneMatrix {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] dist = new int[m][n];
        for(int[] row:dist)
            Arrays.fill(row,Integer.MAX_VALUE);
        Deque<int[]> q = new ArrayDeque<>();
        for(int i = 0; i < m;i++){
            for(int j = 0;j < n;j++){
                if(mat[i][j] == 0){
                    dist[i][j] = 0;
                    q.add(new int[]{i,j});
                }
                    
            }
        }
        while(!q.isEmpty()){
            int [] room = q.poll();
            int row = room[0];
            int col = room[1];
            for(int [] direction: DIRECTIONS){
                int r = row+direction[0];
                int c = col+direction[1];
                if(r < 0 || c < 0 || r >= m || c >=n || mat[r][c] == 0){
                    continue;
                }
                if(dist[r][c]  > dist[row][col]+1){
                    dist[r][c] = dist[row][col] + 1;
                    q.add(new int[] {r,c}); 
                }
                    
            }
        }
        return dist;
    }
}
