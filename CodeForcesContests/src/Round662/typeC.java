package Round662;

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
			int[] arr = new int[n];
		      for(int i=0;i<n;i++)
		         arr[i] = s.nextInt();
		         
		     int[] freq = new int[100002];
//		     Arrays.fill(freq, -1);
		     for(int i=0;i<n;i++)
		       freq[arr[i]]++;
		       
		     long max = -1;
		     for(int i=1;i<freq.length;i++){
		     	max = Math.max(max ,freq[i]);
		     }
		     int count = 0;
		     for(int i=1;i<freq.length;i++){
		     	if(freq[i]==max)
		     	   count++;
		     }
		     
		     int st = 0 , e = n-1;
		     int ans  = n-1;
		     while(st<=e){
		     	 int  m = (st+e)/2;
		     	 long p = (long)(max-1)*(m+1) + count-1;
		     	 if(p<n){
		     	 	ans  = m;
		     	 	st = m+1;
		     	 }
		     	 else
		     	    e = m-1;
		     }
		     
		     
		  System.out.println(ans);
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
