package RoundE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class CherrishMesh {
	
	public static int topParent(int i, int[] parent) {
		if(parent[i]==i) {
			return i;
		}else {
			return topParent( parent[i], parent);
		}
	}
	
	// Find by Path Compression
	public static int find(int i, int[] parent) {
		if(parent[i]==i) {
			return parent[i];
		}else {
			parent[i]=find(parent[i],parent);
			return parent[i];
		}
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int N = s.nextInt();
			int M = s.nextInt();
			int[] parent = new int[N+1];
			for(int i=0;i<=N;i++) {
				parent[i]=i;
			}
			int  count = 0;
			for(int i=0;i<M;i++) {
				int a = s.nextInt();
				int b = s.nextInt();
				int p1 = find(a,parent);
				int p2 = find(b,parent);
				if(p1!=p2) {
				parent[p2]=p1;
				count++;
				}
			}
			long sum = count + ((N-1-count)*2);
			System.out.println("Case #"+(t+1)+": "+sum);
			
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
