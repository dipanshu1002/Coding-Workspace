package Education89;

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
			int n = s.nextInt();
			int x = s.nextInt();
			int m = s.nextInt();
			int sr = x;
			int er = x;
			
			for(int i=0;i<m;i++) {
//				System.out.println(sr+","+er);
				int l = s.nextInt();
				int r = s.nextInt();
				if(l<=sr && er<=r) {
					sr = l;
					er = r;
				}
				else if(l<=sr && sr<=r) {
					sr=l;
				}else if(er>=l && er<=r) {
					er = r;
				}
			}
			System.out.println(er-sr+1);
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
