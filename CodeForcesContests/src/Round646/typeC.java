package Round646;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class typeC {
	static class TreeNode<T> {
		public T data;
		public ArrayList<TreeNode<T>> children;
		
		public TreeNode(T data){
			this.data = data;
			children = new ArrayList<>();
		}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int N = s.nextInt();
			int X = s.nextInt();
			int[][] arr = new int[N][N];
			for(int i=0;i<N-1;i++) {
				int sv = s.nextInt();
				int fv = s.nextInt();
				arr[sv-1][fv-1]=1;
				arr[fv-1][sv-1]=1;
			}
//			for(int i=0;i<N;i++) {
//				for(int j=0;j<N;j++) {
//					System.out.print(arr[i][j]);
//				}
//				System.out.println();
//			}
			int cnt = 0;
			for(int i=0;i<N;i++) {
				if(arr[X-1][i]==1) {
					cnt++;
				}
			}
			if(cnt==1) {
				System.out.println("Ayush");
				continue;
			}
			if(N%2==1) {
				System.out.println("Ashish");
			}else {
				System.out.println("Ayush");
			}
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
