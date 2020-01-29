package DFS;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSSearch {
    private static int V;
    private static LinkedList<Integer> adjacents[];

    static class Graph {
        public Graph(int v) {
            V = v;
            adjacents = new LinkedList[v];
            for(int i = 0; i < v;i++){
                adjacents[i] = new LinkedList<>();
            }
        }

        public void addEdge(int v, int w) {

            adjacents[v].add(w);
        }


        public void DFS(int v) {
            boolean visited[] = new boolean[V];
            DFSUtil(v, visited);
        }

        private void DFSUtil(int v, boolean[] visited) {
            visited[v] = true;
            System.out.println(v +",");

            Iterator<Integer> itr = adjacents[v].listIterator();

            while(itr.hasNext()){
                int n = itr.next();
                if(!visited[n])
                    DFSUtil(n, visited);
            }
        }
    }


    public static void main(String args[])
    {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");

        g.DFS(2);
    }
}