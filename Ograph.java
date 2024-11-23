import java.util.*;

public class Ograph {

    Map<String,Set<String>> graph = new HashMap<>(0);

    public int[] components(String[] data) {
        makeGraph(data);
        Set<String> visited = new HashSet<>(0);
        List<Integer> sizeHolder = new ArrayList<>(0);
        for (String node : graph.keySet()) { // iterate over each node
            if (! visited.contains(node)) {
                Set<String> reachable = getAdjacentsWithDFS(node); // get all connected nodes
                sizeHolder.add(reachable.size());
                visited.addAll(reachable);
            }
        }   
        int[] ret = new int[sizeHolder.size()];
        for (int k = 0; k < sizeHolder.size(); k++) {
            ret[k] = sizeHolder.get(k);
        }
        Arrays.sort(ret);
        return ret;
    }

    public Set<String> getAdjacentsWithDFS(String vertex) {
        Stack<String> stack = new Stack<>();
        Set<String> visited = new HashSet<String>(0);
        stack.push(vertex); // push current node to the top of the stack for processing
        visited.add(vertex);
        while (stack.size() > 0) {
            vertex = stack.pop(); // replace node with the value of the item on the top of the stack
            for (String adj : graph.get(vertex)) {
                if (! visited.contains(adj)) {
                    stack.push(adj);
                    visited.add(adj);
                }
            }
        }
        return visited;
    }

    public void makeGraph(String[] data) {
        for (int i = 0; i < data.length; i++) {
            String s = data[i];
            String key = "" + i;
            graph.put(key, new TreeSet<>());
            String[] verts = s.split(" ");
            for (String adj : verts) {
                graph.get(key).add(adj);
            }
        }
    }
}
