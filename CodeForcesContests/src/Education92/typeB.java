package Education92;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeB {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		while(T-->0) {
			int n = s.nextInt(), k = s.nextInt(), z = s.nextInt();
		      int[] arr= new int[n];

		      for(int i=0;i<n;i++){
		        arr[i]=s.nextInt();
		        
		      }
		      
		      int[] pre = new int[n];
		      pre[0] =arr[0];
		      for(int i=1;i<n;i++)
		         pre[i]=(pre[i-1]+arr[i]);
		      
		      int finalAns = pre[k];

		      for(int i=1;i<n;i++){
		      	int step = i;
		        int temp = pre[i];
		      	if(step<=k){
		      		int rem = k-step;
		      		int pos = Math.min(rem,2*z);
		      		if(pos%2==1){
		      			temp+=arr[i-1];
		      			temp+=((pos/2)*(arr[i]+arr[i-1]));
		      			int rem1  = k - ((step + (pos/2)*2 + 1));
		      			temp+=(pre[i+rem1]-pre[i]);
		      		}
		      		
		      		else{
		      			temp+=((pos/2)*(arr[i]+arr[i-1]));
		      			int rem1  =  k - ((step + (pos/2)*2 ));
		      			temp+=(pre[i+rem1]-pre[i]);
		      		}
		      	
		      	 
		      	  finalAns = Math.max(finalAns,temp);	
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
