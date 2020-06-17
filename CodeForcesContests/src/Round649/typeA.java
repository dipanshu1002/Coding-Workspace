package Round649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeA {
	
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			int x = s.nextInt();
			int[] arr = new int[n];
			int[] pre = new int[n];
			long sum=0;
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
				sum+=arr[i];
			}
			if(sum%x!=0) {
				System.out.println(n);
				continue;
			}
			
			int l1 = 0;
			int l2 = 0;
			int l3 = 0;
			int l4 = 0;
			for(int i=0;i<n;i++) {
				if(arr[i]%x!=0) {
					l1++;
					break;
				}else {
					l1++;
				}
			}
			for(int j=n-1;j>=0;j--) {
				if(arr[j]%x!=0) {
					l3++;
					break;
				}else {
					l3++;
				}
			}
			if(l1>=n || l3>=n) {
				System.out.println(-1);
				continue;
			}
				
			l2 = n-l1;
			
			l4 = n-l3;
			System.out.println(Math.max(l1,Math.max(l2,Math.max(l3, l4))));
		
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
