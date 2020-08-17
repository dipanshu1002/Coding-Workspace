package Round660;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeA {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		while(T-->0) {
			int n = s.nextInt();
		      if(n<31){
		      	System.out.println("NO");
		      }
		      else if(n==36 ){
		      	System.out.println("YES");
		      	System.out.println(5+" "+6+" "+10+" "+15);
		
		      }
		      else if(n==44){
			      	System.out.println("YES");
			      	System.out.println(6+" "+7+" "+10+" "+21);
		      	
		      }
		      else if(n==40){
		    		System.out.println("YES");
			      	System.out.println(6+" "+10+" "+15+" "+9);
		      	
		      }
		      
		      else{
		    	  System.out.println("YES");
			      	System.out.println(6+" "+14+" "+10+" "+(n-30));
		     
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
