package Assignment;
import java.util.*;

public class UGIsTree {
    private int vertexCount;
    private static LinkedList<Integer> adj[];
    UGIsTree(int vertexCount) {
        this.vertexCount = vertexCount;
        this.adj = new LinkedList[vertexCount];
        for (int i = 0; i < vertexCount; ++i) {
            adj[i] = new LinkedList<Integer>();
        }
    }
    public void addEdge(int v, int w) {
        if (!isValidIndex(v) || !isValidIndex(w)) {
            return;
        }
        adj[v].add(w);
        adj[w].add(v);
    }
    private boolean isValidIndex(int i) {
        // Write code here
        return i>=0;
    }
    private boolean isCyclic(int v, boolean visited[], int parent) {
        // Write code here
        visited[v] = true;
        Integer i;
        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext())
        {
            i = it.next();
            if (!visited[i])
            {
                if (isCyclic(i, visited, v))
                    return true;
            }
            else if (i != parent)
                return true;
        }
        return false;
    }

    public boolean isTree() {
        // Write Code here
        boolean visited[] = new boolean[vertexCount];
        for (int i = 0; i < vertexCount; i++)
            visited[i] = false;
        if (isCyclic(0, visited, -1))
            return false;
        for (int u = 0; u < vertexCount; u++)
            if (!visited[u])
                return false;
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Get the number of nodes from the input.
        int noOfNodes =  sc.nextInt();
        // Get the number of edges from the input.
        int noOfEdges = sc.nextInt();

        UGIsTree graph = new UGIsTree(noOfNodes);
        // Adding edges to the graph
        for (int i = 0; i <noOfEdges; ++i) {
            graph.addEdge(sc.nextInt(),sc.nextInt());
        }
        if (graph.isTree()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
