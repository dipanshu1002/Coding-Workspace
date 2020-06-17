package Round645;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;
public class typeC {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			long x1 = s.nextLong();
			long y1 = s.nextLong();
			long x2 = s.nextLong();
			long y2 = s.nextLong();
			long row = x2-x1;
			long col = y2 - y1;
			long min1 = Math.min(row, col);
			long pts = row+col-1;
			long ans = min1*(min1+1);
			long rem = pts-2*min1;
			ans+=(rem*min1);
			out.println(ans+1);
			
		}
		out.flush();
		
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
