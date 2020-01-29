package BFS;

import java.util.Iterator;
import java.util.LinkedList;

public class BFSSearch {

    private static int V;

    private static LinkedList<Integer> adjacents[];

    static class Graph {
        public Graph(int v){
            V = v;
            adjacents = new LinkedList[v];
            for(int i = 0 ; i < v; i++) {
                adjacents[i] = new LinkedList<>();
            }
        }

        public void addEdge(int v, int w) {
            adjacents[v].add(w);
        }

        public void BFS(int source) {
            // mark all the verticies as not visited and set to false
            boolean visited[] = new boolean[V];

            // mark the source as visited and add it to the q.

            LinkedList<Integer> q = new LinkedList<>();

            visited[source] = true;

            q.add(source);

            while(q.size() != 0) {
                source = q.poll();
                System.out.println(source + ", ");

                Iterator<Integer> itr = adjacents[source].listIterator();

                while (itr.hasNext()){
                    int n = itr.next();

                    if(!visited[n]){
                        visited[n] = true;
                        q.add(n);
                    }
                }
            }
        }
    }


    public static void main(String[] args) {

        Graph graph = new Graph(8);
        graph.addEdge(1,5);
        graph.addEdge(1,4);
        graph.addEdge(1,2);
        graph.addEdge(2,7);
        graph.addEdge(2,6);
        graph.addEdge(2,3);


        graph.BFS(1);
    }
}
