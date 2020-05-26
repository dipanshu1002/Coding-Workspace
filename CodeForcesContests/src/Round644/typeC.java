package Round644;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;
public class typeC {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			long[] arr = new long[n];
			ArrayList<Long> even = new ArrayList<>();
			ArrayList<Long> odd = new ArrayList<>();
			ArrayList<Long> set = new ArrayList<>();
			
			for(int i=0;i<n;i++) {
				arr[i]=s.nextLong();
				if(arr[i]%2==0) {
					even.add(arr[i]);
				}else if(arr[i]%2==1) {
					odd.add(arr[i]);
				}
				set.add(arr[i]);
			}
//			System.out.println("Size: "+odd.size()+" "+even.size());
			if(odd.size()%2==0 && even.size()%2==0) {
//				System.out.println("Size: "+odd.size()+" "+even.size());
				System.out.println("YES");
				continue;
			}
	       	 int ans = 0;
	       	 for(Long temp : even) {
	       		 if(set.contains(temp-1)) {
	       			 ans = 1;
	       			 break;
	       		 }
	       		 if(set.contains(temp+1)) {
	       			 ans = 1;
	       			 break;
	       		 }
	       	 }
	       	 if(ans==1) {
	       		 System.out.println("YES");
	       	 }else {
	       		 System.out.println("NO");
	       	 
	       	 
		       	 
		       	
		       	
		       	
		       	
		       	
		       }
		}
		out.flush();
		
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
