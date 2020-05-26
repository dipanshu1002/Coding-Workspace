package CG2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;

public class prob2 {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int N = s.nextInt();
			PriorityQueue<Long> gForce = new PriorityQueue<>(Collections.reverseOrder());
			PriorityQueue<Long> opp = new PriorityQueue<>(Collections.reverseOrder());
			for(int i=0;i<N;i++) {
			gForce.add(s.nextLong());
			}
			for(int i=0;i<N;i++) {
				opp.add(s.nextLong());
			}
			int count = 0;
			while(gForce.size()>0 && opp.size()>0) {
				if(gForce.peek()>opp.peek()) {
					gForce.remove();
					opp.remove();
					count++;
				}else {
					opp.remove();
				}
			}
			out.println(count);
			
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
