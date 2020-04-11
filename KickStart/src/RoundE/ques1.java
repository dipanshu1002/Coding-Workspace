package RoundE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import java.util.*;

public class ques1 {
static class FastReader 
	
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
	
static class Graph 
{ 
    public int V;   // No. of vertices 
    public LinkedList<Integer> adj[]; // Adjacency List Represntation 
  
    // Constructor 
    Graph(int v) { 
        V = v; 
        adj = new LinkedList[v]; 
        for(int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 
  
    // Function to add an edge into the graph 
    void addEdge(int v,int w) { 
        adj[v].add(w); 
        adj[w].add(v); 
    }
    void removeEdge(int v, int w) {
    	Iterator<Integer> it = adj[v].iterator();
    	int id=0;
    	while(it.hasNext()) {
    		Integer i = it.next();
    		if(i==w) {
    			break;
    		}else {
    			id++;
    		}
    	}
    	int id2=0;
    	Iterator<Integer> it2 = adj[w].iterator();
    	while(it2.hasNext()) {
    		Integer i = it2.next();
    		if(i==v) {
    			break;
    		}else {
    			id2++;
    		}
    	}
    	adj[v].remove(id);
    	adj[w].remove(id2);
    }
  
    // A recursive function that uses visited[] and parent to detect 
    // cycle in subgraph reachable from vertex v. 
    Boolean isCyclicUtil(int v, Boolean visited[], int parent) 
    { 
        // Mark the current node as visited 
        visited[v] = true; 
        Integer i; 
  
        // Recur for all the vertices adjacent to this vertex 
        Iterator<Integer> it = adj[v].iterator(); 
        while (it.hasNext()) 
        { 
            i = it.next(); 
  
            // If an adjacent is not visited, then recur for that 
            // adjacent 
            if (!visited[i]) 
            { 
                if (isCyclicUtil(i, visited, v)) 
                    return true; 
            } 
  
            // If an adjacent is visited and not parent of current 
            // vertex, then there is a cycle. 
            else if (i != parent) 
                return true; 
        } 
        return false; 
    } 
  
    // Returns true if the graph contains a cycle, else false. 
    Boolean isCyclic() 
    { 
        // Mark all the vertices as not visited and not part of 
        // recursion stack 
        Boolean visited[] = new Boolean[V]; 
        for (int i = 0; i < V; i++) 
            visited[i] = false; 
  
        // Call the recursive helper function to detect cycle in 
        // different DFS trees 
        for (int u = 0; u < V; u++) 
            if (!visited[u]) // Don't recur for u if already visited 
                if (isCyclicUtil(u, visited, -1)) 
                    return true; 
  
        return false; 
    }
}
	static class Edges{
		int src;
		int des;
		int weight;
	}
	static class Pair{
		int x;
		int y;
	}
	public static int topParent(int[] parent,int i) {
		if(parent[i]==i) {
			return parent[i];
		}
		else {
			int ans = topParent(parent,parent[i]);
			return ans;
		}
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int N = s.nextInt();
			int M = s.nextInt();
			Graph graph = new Graph(N+1);
			long count = 0;
			for(int i=0;i<M;i++) {
				int a = s.nextInt();
				int b = s.nextInt();
				graph.addEdge(a,b);
				if(graph.isCyclic()) {
					graph.removeEdge(a,b);
				}else {
					count++;
				}
			}
			long sum = count + ((N-1-count)*2);
			System.out.println("Case #"+(t+1)+": "+sum);
			
			
			
			
			
			
			
			
			
			
//			ArrayList<Pair> list = new ArrayList<>();
//			HashSet<Pair> set = new HashSet<Pair>();
//			Edges[] g = new Edges[M];
//			for(int i=0;i<M;i++) {
//				Edges edge = new Edges();
//				edge.src = s.nextInt();
//				edge.des = s.nextInt();
//				edge.weight = 1;
//				g[i]=edge;
//			}
//			int[] arr = new int[N+1];
//			for(int i=1;i<=N;i++) {
//				arr[i]=2;
//			}
//			int[] parent = new int[N+1];
//			for(int i=0;i<N+1;i++) {
//				parent[i]=i;
//			}
//			for(int i=0;i<M;i++) {
//				Pair p = new Pair();
//				p.x = s.nextInt();
//				arr[p.x]=1;
//				p.y = s.nextInt();
//				arr[p.y]=1;
//				list.add(p);
//				if(set.contains(p)) {
//					continue;
//				}else {
//				set.add(p);
//				}
//			}
//			
//			System.out.println(set);
//			long sum = 0;
//			sum+=(set.size());
//			sum+=(2*(N-1-set.size()));
//			System.out.println("Case #"+(t+1)+": "+sum);
	}
}
}
