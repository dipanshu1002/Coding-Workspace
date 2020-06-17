package Round645;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;
public class typeD {
	
	public static void main(String[] args) {
		FastReader s = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int n = s.nextInt();
		int d = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int[] hugs = new int[2*n];
		int[] days = new int[2*n];
		
		ArrayList<Integer> win = new ArrayList<>();
		for(int i=0;i<n;i++) {
			for(int j=1;j<=arr[i];j++) {
				win.add(j);
			}
		}
//		for(int x: win) {
//			System.out.print(x+" ");
//		}
		System.out.println();
		long ans = maxCircularSum(win,win.size(),d);
		out.println(ans);
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
