package DataStructures.Graphs;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * All Paths from Source to Target Node
 * Description
 * Given a directed acyclic graph (DAG) of n nodes labelled from 0 to n - 1,
 * count all possible paths from node 0 to node n - 1, and return the number of paths.
 * The graph is given as follows: graph[i] is a list of all nodes you can visit from node i
 * (i.e. , there is a directed edge from node i to node graph[i][j]).
 * Example:
 * Input:
 * If graph = [[1,2],[3],[3],[]], the input can be taken as follows:
 * first line: (number of nodes) 4
 * second line: (nodes you can visit from first node) 1 2
 * third line: (nodes you can visit from second node) 3
 * fourth line: (nodes you can visit from third node) 3
 * fifth line:( nodes you can visit from fourth node) -1
 * Note: input -1 implies no node can be visited from the given node.
 * Output: 2
 * Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
 */
// Class name should be "Source",
// otherwise solution won't be accepted
import java.util.ArrayList;
import java.util.List;

// A directed graph using
// adjacency list representation
public class Source {
    // No. of vertices in graph
    private int v;
    // adjacency list
    private ArrayList<Integer>[] adjList;
    // Constructor
    public Source(int vertices)
    {
        // initialise vertex count
        this.v = vertices;
        // initialise adjacency list
        initAdjList();
    }

    // utility method to initialise
    // adjacency list
    @SuppressWarnings("unchecked")
    private void initAdjList()
    {
        adjList = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    // add edge from u to v
    public void addEdge(int u, int v)
    {
        // Add v to u's list.
        adjList[u].add(v);
    }

    // Prints all paths from
    // 's' to 'd'
    public int printAllPaths(int s, int d)
    {
        boolean[] isVisited = new boolean[v];
        ArrayList<Integer> pathList = new ArrayList<>();

        // add source to path[]
        pathList.add(s);

        // Call recursive utility
        return printAllPathsUtil(s, d, isVisited, pathList,0);
    }

    // A recursive function to print
    // all paths from 'u' to 'd'.
    // isVisited[] keeps track of
    // vertices in current path.
    // localPathList<> stores actual
    // vertices in the current path
    private int printAllPathsUtil(Integer u, Integer d,
                                   boolean[] isVisited,
                                   List<Integer> localPathList,int count)
    {

        if (u.equals(d)) {
//            System.out.println(localPathList);
            // if match found then no need to traverse more till depth
            return count+1;
        }

        // Mark the current node
        isVisited[u] = true;

        // Recur for all the vertices
        // adjacent to current vertex
        for (Integer i : adjList[u]) {
            if (!isVisited[i]) {
                // store current node
                // in path[]
                localPathList.add(i);
                count = printAllPathsUtil(i, d, isVisited, localPathList,count);

                // remove current node
                // in path[]
                localPathList.remove(i);
            }
        }

        // Mark the current node
        isVisited[u] = false;
        return count;
    }

    // Driver program
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int vertices = scanner.nextInt();
        // Create a sample graph
        Source g = new Source(vertices);
        for(int i=0;i<vertices;i++){
            List<Integer> neighbours = new ArrayList<>();
            String in = scanner.nextLine();
            System.out.println(in);
        }
//        g.addEdge(0, 1);
//        g.addEdge(0, 2);
//        g.addEdge(0, 3);
//        g.addEdge(2, 0);
//        g.addEdge(2, 1);
//        g.addEdge(1, 3);
//        // arbitrary source
//        int s = 2;
//        // arbitrary destination
//        int d = 3;
//        System.out.println(g.printAllPaths(s, d));
    }
}
