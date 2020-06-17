package Round648;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeA {
	static class Pair{
		int x;
		int y;
		Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			int m = s.nextInt();
			int[][]arr = new int[n][m];
			int move = Math.min(n,m);
			ArrayList<Pair> list = new ArrayList<>();
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					arr[i][j]=s.nextInt();
					if(arr[i][j]==1) {
						list.add(new Pair(i,j));
						
					}
				}
			}
			int r = 0;
			int c = 0;
			int f = 0;
			for(int i=0;i<n;i++) {
				f = 0;
				for(int j=0;j<m;j++) {
					if(arr[i][j]==1) {
						f = 1;
						break;
					}
					
				}
				if(f==0) {
					r++;
				}
			}
			for(int i=0;i<m;i++) {
				f = 0;
				for(int j=0;j<n;j++) {
					if(arr[j][i]==1) {
						f = 1;
						break;
					}
					
				}
				if(f==0) {
					c++;
				}
			}
			int ans = Math.min(r, c);
			if(ans%2==0) {
				System.out.println("Vivek");
			}else {
				System.out.println("Ashish");
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
