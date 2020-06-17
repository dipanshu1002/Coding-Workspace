package Round646;

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
			String str = s.next();
			int length = str.length();
	         long[] dp  = new long[length+2];
	         for(int i=0;i<length;i++){
	            dp[i+1] = str.charAt(i)-'0';  
	         }
	         
	         for(int i=1;i<=length;i++)
	              dp[i]+=dp[i-1];
	              
	              
	        long fans = Integer.MAX_VALUE;
	        for(int i=0;i<=length;i++){
	           	long x = dp[i];
	           	long a = i - x;
	           	long y = dp[length]-dp[i];
	           	long z = (length-i)-y;
	           	long ans1 = x+z;
	           	long ans2 = a+y;
	           	ans1 =Math.min(ans1,ans2);
	           	fans = Math.min(fans,ans1);
	          
	        }
	      
	            
	       System.out.println(fans);
	         
	         
	         
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
