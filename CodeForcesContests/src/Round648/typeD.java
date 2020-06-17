package Round648;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeD {
	static class Pair{
		int x;
		int y;
		Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	static class Graph { 
	    int V; 
	    List<List<Integer> > adj; 
	  
	    Graph(int V) 
	    { 
	        this.V = V; 
	        adj = new ArrayList<>(V); 
	        for (int i = 0; i < V; i++) { 
	            adj.add(i, new ArrayList<>()); 
	        } 
	    } 
	  
	    // add edge to graph 
	    void addEdge(int s, int d) 
	    { 
	        adj.get(s).add(d); 
	        adj.get(d).add(s); 
	    } 
	  
	    // BFS function to find path 
	    // from source to sink 
	   boolean BFS(int s, int d) 
	    { 
	        // Base case 
	        if (s == d) 
	            return true; 
	  
	        // Mark all the vertices as not visited 
	        boolean[] visited = new boolean[V]; 
	  
	        // Create a queue for BFS 
	        Queue<Integer> queue 
	            = new LinkedList<>(); 
	  
	        // Mark the current node as visited and 
	        // enqueue it 
	        visited[s] = true; 
	        queue.offer(s); 
	  
	        // it will be used to get all adjacent 
	        // vertices of a vertex 
	        List<Integer> edges; 
	  
	        while (!queue.isEmpty()) { 
	            // Dequeue a vertex from queue 
	            s = queue.poll(); 
	  
	            // Get all adjacent vertices of the 
	            // dequeued vertex s. If a adjacent has 
	            // not been visited, then mark it visited 
	            // and enqueue it 
	            edges = adj.get(s); 
	            for (int curr : edges) { 
	                // If this adjacent node is the 
	                // destination node, then return true 
	                if (curr == d) 
	                    return true; 
	  
	                // Else, continue to do BFS 
	                if (!visited[curr]) { 
	                    visited[curr] = true; 
	                    queue.offer(curr); 
	                } 
	            } 
	        } 
	  
	        // If BFS is complete without visiting d 
	        return false; 
	    } 
	  
	     boolean isSafe( 
	        int i, int j, int[][] M) 
	    { 
	        int N = M.length; 
	        if ( 
	            (i < 0 || i >= N) 
	            || (j < 0 || j >= N) 
	            || M[i][j] == 0) 
	            return false; 
	        return true; 
	    } 
	}
	  
	    // Returns true if there is a 
	    // path from a source (a 
	    // cell with value 1) to a 
	    // destination (a cell with 
	    // value 2) 
	    static boolean findPath(char[][] arr) 
	    { 
	        // Source and destination 
	        int s = -1, d = -1; 
	        int N = arr.length; 
	        int M = arr[0].length; 
	        int V = N * M + 2; 
	        Graph g = new Graph(V); 
	  
	        // Create graph with n*n node 
	        // each cell consider as node 
	        int k = 1; // Number of current vertex 
	        for (int i = 0; i < N; i++) { 
	            for (int j = 0; j < M; j++) { 
	                if (arr[i][j] != 0) { 
	  
	                    // connect all 4 adjacent 
	                    // cell to current cell 
	                    if (g.isSafe(i, j + 1, arr)) 
	                        g.addEdge(k, k + 1); 
	                    if (g.isSafe(i, j - 1, arr)) 
	                        g.addEdge(k, k - 1); 
	                    if (j < N - 1
	                        && g.isSafe(i + 1, j, arr)) 
	                        g.addEdge(k, k + N); 
	                    if (i > 0 && g.isSafe(i - 1, j, arr)) 
	                        g.addEdge(k, k - N); 
	                } 
	  
	                // source index 
	                if (arr[i][j] == 'G') 
	                    s = k; 
	  
	                // destination index 
	                if (arr[i][j] == 2) 
	                    d = k; 
	                k++; 
	            } 
	        } 
	  
	        // find path Using BFS 
	        return g.BFS(s, d); 
	    } 
	
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			int m = s.nextInt();
			char[][] arr = new  char[n][m];
			for(int i=0;i<n;i++) {
				arr[i]=s.next().toCharArray();
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(arr[i][j]=='B') {
						if((i-1>=0)) {
							if(arr[i-1][j]=='.') {
								arr[i-1][j]='#';
							}
						}
						if((i+1)<n){
							if(arr[i+1][j]=='.')
								arr[i+1][j]='#';
						}
						if((j-1>=0)) {
							if(arr[i][j-1]=='.') {
								arr[i][j-1]='#';
							}
						}
						if((j+1)<m){
							if(arr[i][j+1]=='.')
								arr[i][j+1]='#';
						}
						
					}
				}
			}
			 int[][] M = { { 0, 3, 0, 1 }, 
                     { 3, 0, 3, 3 }, 
                     { 2, 3, 3, 3 }, 
                     { 0, 3, 3, 3 } }; 
 
       System.out.println( 
           ((findPath(M)) ? "Yes" : "No")); 
			
		System.out.println(Arrays.deepToString(arr));
			
		}
	}
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
 
}
