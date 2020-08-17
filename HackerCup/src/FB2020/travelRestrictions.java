package FB2020;
// Solution Credits - Dipanshu Munjal

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class travelRestrictions {
	static void dfs(ArrayList<ArrayList<Integer>> adj,boolean[] visited, int s) {
		visited[s]=true;
		for(int i: adj.get(s)) {
			if(!visited[i])
				dfs(adj,visited,i);
		}
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=1;t<=T;t++) {
			System.out.println("Case #"+t+": ");
			int n = s.nextInt();
			ArrayList<ArrayList<Integer> > adj  
            = new ArrayList<ArrayList<Integer> >(n);
			for (int i = 0; i < n; i++) 
	            adj.add(new ArrayList<Integer>()); 
			char[] in = s.next().toCharArray();
			char[] out = s.next().toCharArray();
			boolean[][] visited = new boolean[n][n];
			for(int i=0;i<n;i++) {
				if(in[i]=='Y') {
					if(i>0 && out[i-1]=='Y')
					adj.get(i-1).add(i);
					
					if(i+1<n && out[i+1]=='Y')
						adj.get(i+1).add(i);
				}
				if(out[i]=='Y') {
					if(i>0 && in[i-1]=='Y')
						adj.get(i).add(i-1);
					if(i+1<n && in[i+1]=='Y')
						adj.get(i).add(i+1);
				}
			}
			
			
			for(int i=0;i<n;i++) {
				dfs(adj,visited[i],i);
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(visited[i][j]) {
						System.out.print("Y");
					}else {
						System.out.print("N");
					}
				}
				System.out.println();
			}
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
