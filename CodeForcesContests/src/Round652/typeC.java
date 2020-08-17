package Round652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeC {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			int k = s.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			int[] w = new int[k];
			for(int i=0;i<k;i++) {
				w[i]=s.nextInt();
			}
			Arrays.sort(arr);
			int st  = n-1;
			int e = n-1;
			long happy = 0;
			Arrays.sort(w);
			for(int i=0;i<k;i++) {
				happy+=arr[e];
				e--;
			}
			int p=0;
			while(p<k && w[p]==1) {
				happy+=arr[st];
				st--;
				p++;
			}
			int l = e;
			for(int i=p;i<k;i++) {
				happy+=arr[l-w[i]+2];
				l=l-w[i]+1;
			}
			System.out.println(happy);
			
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
