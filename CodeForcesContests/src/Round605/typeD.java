package Round605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeD {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int[] dp1 = new int[n];
		int[] dp2 = new int[n];
		dp1[n-1]=1;
		int max = 1;
		for(int i = n-2;i>=0;i--) {
			if(arr[i]<arr[i+1]) {
				dp1[i]=1+dp1[i+1];
				if(max<dp1[i]) {
					max = dp1[i];
				}
			}else {
				dp1[i]=1;
			}
		}
		dp2[0]=1;
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[i-1]) {
				dp2[i]=dp2[i-1]+1;
			}else {
				dp2[i]=1;
			}
		}
		for(int i=1;i<n-1;i++) {
			if(arr[i-1]<arr[i+1]) {
				int len = dp2[i-1]+dp1[i+1];
				if(len>max) {
					max = len;
				}
			}
		}
		System.out.println(max);
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
