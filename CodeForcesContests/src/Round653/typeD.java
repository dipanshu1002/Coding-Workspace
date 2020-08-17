package Round653;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeD {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T  = s.nextInt();
		
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			long k = s.nextLong();
			long[] arr = new long[n];
			HashMap<Long, Integer> map = new HashMap<>();
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
				if(map.get(arr[i]%k)==null)
					map.put(arr[i]%k,1);
				else {
					int cnt = map.get(arr[i]%k);
					map.put(arr[i]%k,cnt+1);
				}
				
			}
		  	long las = -1;
//		  	Set set = map.keySet();
		  	for(Long i: map.keySet()) {
		  		if(i!=0) {
			  		long get = map.get(i);
			  	     long p = (k-i)+ get*k - k;
			  	        las = Math.max(las,p);
			  	    }
		  	}
		  	System.out.println(las+1);
			
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
