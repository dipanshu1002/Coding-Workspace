package Round563;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeB {
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
		
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		HashSet<Long> set = new HashSet<Long>();
		long[] arr = new long[n];
		int oddF = 0;
		int evenF = 0;
		arr[0]=s.nextLong();
		if(arr[0]%2==0) {
			evenF=1;
		}else {
			oddF=1;
		}
		for(int i=1;i<n;i++) {
			arr[i]=s.nextLong();
		}
		for(int i=0;i<n;i++) {
			if(oddF==1 && arr[i]%2!=0) {
				continue;
			}else if(evenF==1 && arr[i]%2==0) {
				continue;
			}
			else {
				oddF=0;
				evenF=0;
				break;
			}
		}
		if(oddF==0 && evenF==0) {
			Arrays.sort(arr);
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			
		}else {
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
				}
			
		}
		
	}
}