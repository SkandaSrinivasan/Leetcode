/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class CloneGraph {
    public Node cloneGraph(Node node) {
        if(node == null) return node;
        Deque<Node> q = new ArrayDeque<>();
        q.add(node);
        HashMap<Node,Node> visited = new HashMap<>();
        visited.put(node,new Node(node.val));
        while(!q.isEmpty()){
            Node curr = q.poll();
            for(Node nei:curr.neighbors){
                if(!visited.containsKey(nei)){
                    visited.put(nei,new Node(nei.val));
                    q.add(nei);
                }
                // This was the tricky part.Get the clone of the current node.
                // Add the clone of the current neighbor to its list of neis.
                visited.get(curr).neighbors.add(visited.get(nei));
            }
            
        }
     
        return visited.get(node);
    }
}