package Round656;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeD {
	static int start(String str, int len, char c){
//		System.out.println(str);
		if(len<=0)
		   return 0;
		   
		if(len==1){
			if(str.charAt(0)==c)
			   return 0;
			   
			   
			   return 1;
		}
	   int cnt  = 0;
	   for(int i=0;i<len/2;i++){
	   	   if(str.charAt(i)!=c)
	   	       cnt++;
	   }
	   
	 String str2  = str.substring(len/2);
	   int ans1 = start(str2,len/2,(char)(c+1));
	   int ans2 = end(str2,len/2,(char)(c+1));
	   
	   int ans = cnt + Math.min(ans1,ans2);
	   return ans;

	}
	static int end(String str, int len, char c){
//		System.out.println(str);
		if(len<=0)
		   return 0;
		   
		if(len==1){
			if(str.charAt(0)==c)
			   return 0;
			   
			   
			   return 1;
		}
	   int cnt  = 0;
	   for(int i=len-1;i>=len/2;i--){
	   	   if(str.charAt(i)!=c)
	   	       cnt++;
	   }
	   
	 String str2  = str.substring(0, len/2);
	   int ans1 = start(str2,len/2,(char)(c+1));
	   int ans2 = end(str2,len/2,(char)(c+1));
	   
	   int ans = cnt + Math.min(ans1,ans2);
	   return ans;

	}

				  
	 
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		while(T-->0) {
			int n = s.nextInt();
			String str = s.next();
			int ans1 = start(str,str.length(),'a');
			int ans2 = end(str,str.length(),'a');
			int fin = Math.min(ans1,ans2);
			System.out.println(fin);
				     
			
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
