package DataStructures.Graphs;
import java.util.*;

import java.util.ArrayList;
import java.util.List;

// Class name should be "Source",
// otherwise solution won't be accepted
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
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int vertices = scanner.nextInt();
        // Create a sample graph
        Source g = new Source(vertices);
        int i=0;
        while(scanner.hasNextLine()){
            String in = scanner.nextLine();
            Scanner sc = new Scanner(in);
            if(!in.equals("")){
                while (sc.hasNextInt()) {
                    int value = sc.nextInt();
                    if(value!=-1){
                        g.addEdge(i, value);
                    }
                }
                i++;
            }
        }
        int s = 0;
        int d = vertices-1;
        System.out.println(g.printAllPaths(s, d));
    }
}
