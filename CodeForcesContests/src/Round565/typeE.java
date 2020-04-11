package Round565;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeE {
	static class Graph 
    { 
        int V; 
        LinkedList<Integer> adjListArray[]; 
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
	public static void main(String[] args) {
		FastReader s = new FastReader();
		long T = s.nextLong();
		for(long t = 0; t<T;t++) {
			int n = s.nextInt();
			long m = s.nextLong();
			Graph graph = new Graph();
			
			graph.adjListArray = new LinkedList[n];
			for(int i = 0; i < n ; i++){ 
                graph.adjListArray[i] = new LinkedList<>(); 
            } 
			
			for(int i=0;i<m;i++) {
				int l =s.nextInt();
				int r = s.nextInt();
				l--;
				r--;
				graph.adjListArray[l].add(r);
				graph.adjListArray[r].add(l);
			}
			int[] visited = new int[n+1];
			HashSet<Integer> s1 = new HashSet<Integer>();
			HashSet<Integer> s2 = new HashSet<Integer>();
			//Iterator<Integer> iter = graph.adjListArray.iterator();
			
			for(int i=0;i<n;i++) {
				if(visited[i]==0) {
					s1.add(i+1);
					for(int j : graph.adjListArray[i]) {
						visited[j]=1;
					}
				}
				else {
					s2.add(i+1);
				}
			}
			if(s1.size()<s2.size()){
				System.out.println(s1.size());
				for(int i: s1)
				   System.out.print(i+" ");
				System.out.println();
				}
				
				
				else{
				System.out.println(s2.size());
				for(int i: s2)
					System.out.print(i+" ");
				   
				System.out.println();
		}
	}
	}
}
