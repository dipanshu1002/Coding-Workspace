package Education88;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeB{
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n  =s.nextInt();
			int m  = s.nextInt();
			int x = s.nextInt();
			int y = s.nextInt();
			y = Math.min(y, 2*x);
			char[][] arr = new char[n][m];
			for(int i=0;i<n;i++) {
				arr[i]=s.next().toCharArray();
			}
			long cost = 0;
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(arr[i][j]=='*') {
						continue;
					}else if((j+1)<m && arr[i][j]=='.'&&arr[i][j+1]=='.') {
						cost+=y;
						j++;
					}else {
						cost+=x;
					}
				}
			}
			System.out.println(cost);
			
//			for(int i=0;i<n;i++) 
//				for(int j=0;j<m;j++) {
//					System.out.print(arr[i][j]);
//				}
//				System.out.println();
//			}
//			
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
