import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        seen[0] = true;
        Deque<Integer> q = new ArrayDeque<>();
        q.add(0);
        int seenCount = 1;
        while(!q.isEmpty()){
            int room = q.poll();
            for(int key:rooms.get(room)){
                if(!seen[key]){
                    seen[key] = true;
                    q.add(key);
                    seenCount++;
                }
            }
        }
        if(seenCount == rooms.size())
            return true;
        return false;
    }
    }  

