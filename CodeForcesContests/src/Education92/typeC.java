package Education92;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeC {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		while(T-->0) {
			char[] str = s.next().toCharArray();
			int len = str.length;
			int finalAns = len;
		      for(int i=0;i<10;i++){
		      	for(int j=0;j<10;j++){
		      		int ans = 0;
		      		int k = 0;
		      		for(int x=0;x<len;x++){
		      			int q = str[x]-'0';
		      			if(k==0){
		      				if(q==i){
		      					ans++;
		      					k = k^1;
		      				}
		      			}
		      			
		      	   	else{
		      				if(q==j){
		      					ans++;
		      					k = k^1;
		      				}
		      			}
		      		}
		      		
		      		if(ans%2==1 && i!=j)
		      		 ans--;
		      		 
		      		int req = len - ans;
		      		finalAns = Math.min(req,finalAns);
		      	}
		      }
		      
		    System.out.println(finalAns);
			
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
