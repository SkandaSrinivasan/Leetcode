import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
//The ony tricky part is the rotation of the locks. 
/*Quickly find a decimal of a number char by 
((node.charAt(i) - '0') + d(modifier) + 10) % 10;*/
public class OpenTheLock {
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet();
        for(String d:deadends){
            dead.add(d);
        }
        
        Queue<String> q = new LinkedList<>();
        q.offer("0000");
        q.offer(null);
        
        Set<String> visited = new HashSet();
        visited.add("0000");
        
        int depth = 0;
        while(!q.isEmpty()){
            String node = q.poll();
            if(node == null){
                depth++;
                if(q.peek()!=null)
                    q.offer(null);
            }
            else if(node.equals(target)){
                return depth;
            }
            else if(!dead.contains(node)){
                for(int i = 0 ; i < 4 ; i++){
                    for(int d = -1; d<=1; d+=2){
                        int y = ((node.charAt(i) - '0') + d + 10) % 10;
                        String newNode = node.substring(0,i) +(""+y)+node.substring(i+1);
                        if(!visited.contains(newNode)){
                            visited.add(newNode);
                            q.offer(newNode);
                        }
                    }
                }
            }
        }
        return -1;
        
    }
}
