package Education76;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeC{
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			int i = 0;
			int j = 1;
			int ans  = Integer.MAX_VALUE;
			HashSet<Integer> set = new HashSet<>();
			set.add(arr[i]);
//			j++;
			for(int k=j;k<n;k++) {
				if(set.contains(arr[k])) {
					int l = i;
					while(arr[l]!=arr[k] && l<k) {
						set.remove(arr[l]);
						l++;
					}
//					System.out.println("l: "+l+" k: "+k);
					if(ans>(k-l+1)) {
						ans = (k-l)+1;
					}
					set.remove(arr[k]);
					i=l+1;
				}
				set.add(arr[k]);
			}
			if(ans==Integer.MAX_VALUE) {
				ans=-1;
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
