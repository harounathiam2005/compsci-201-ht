import java.util.*;
import java.util.Stack;

public class Ograph {
    Map<String,Set<String>> myGraph = new HashMap<>();
    public int[] components(String[] data) {
        makeGraph(data);
        Set<String> visited = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (String v : myGraph.keySet()) {
            if (! visited.contains(v)) {
                Set<String> reachable = dfs(v);
                visited.addAll(reachable);
                list.add(reachable.size());
            }
        }
        return new int[0];
    }

    private Set<String> dfs(String vertex) {
        Stack<String> stack = new Stack<>(0);
        Set<String> visited = new HashSet<>(0);
        stack.push(vertex);
        visited.add(vertex);
        while (stack.size() > 0) {
            String v = stack.pop();
            for (String adj : myGraph.get(v)) {
                if (! visited.contains(v)) {
                    visited.add(adj);
                    stack.push(adj);
                }
            }
        }
        return visited;
    }

    public void makeGraph(String[] data) {
        Map<Integer,HashSet<String>> map = new HashMap<>(0);
        
    }
}
