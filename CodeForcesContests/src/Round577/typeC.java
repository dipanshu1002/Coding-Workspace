package Round577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeC {
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
	
	static boolean check(long[] arr, int n, long mid, long k) {
		long sum = 0;
		for(int i=(n/2);i<n;i++) {
			if(arr[i]<mid) {
				sum+=(mid-arr[i]);
			}
		}
		if(sum<=k) {
			return true;
	}else {
		return false;
	}
}

	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		long k = s.nextLong();
		long[] arr = new long[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextLong();
		}
		Arrays.sort(arr);
		long mid = arr[n/2];
		long start = mid;
		long end = (long)Math.pow(10,10);
		long ans = mid;
		while(start<=end) {
			long m = (start+end)/2;
			if(check(arr,n,m,k)) {
				ans = m;
				start = m+1;
			}
			else {
				end = m-1;
			}
		}
		System.out.println(ans);
			
		}
		
		
	}

