package Round647;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeB {
	static int solve(int[] arr ,int[] freq ,int n){
		for(int i=1;i<1024;i++){
  	  	int[] dp  = new int[1024];
  	  	for(int j=0;j<n;j++){
  	  		dp[i^arr[j]]++;
  	  	}
  	  	boolean ans  = true;
  	  	for(int j=0;j<1024;j++){
  	  		if(freq[j]!=dp[j]){
  	  		   ans = false;
  	  		   break;
  	  		}
  	  	}
	  	  	
  	  	
  	  	if(ans)
  	  	 return i;
  	  	 
  	  }
	  	  
  	  return -1;



	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			int[] arr = new int[n];
			int[] freq = new int[1024];
	  	  	for(int i=0;i<n;i++){
	  	  		arr[i]=s.nextInt();
	  	  		freq[arr[i]]++; 
	     	} 
				  	  
		  	System.out.println(solve(arr,freq,n));
				  	
				  	
				  	
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
