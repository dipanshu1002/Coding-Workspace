package Round646;

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
			int N = s.nextInt();
			int x = s.nextInt();
			int[] arr = new int[N];
			int odd = 0;
			int even = 0;
			for(int i=0;i<N;i++) {
				arr[i]=s.nextInt();
				if(arr[i]%2==0) even++;
				else odd++;
			}
			  if(x>N) {
			System.out.println("No");
			continue;
		}
		if(odd==0) {
			System.out.println("No");
			continue;
		}
//		System.ou{t.println(odd);
		if(x%2==1) {
			
			if(odd>=x) {
				System.out.println("Yes");
			}
			else {
				if(odd%2==1) {
					System.out.println("Yes");
				}else if(even>=(x-(odd-1))){
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}
		}else if(x%2==0) {
			
			if(odd>=(x-1) && even>=1) {
				System.out.println("Yes");
			}else if(odd%2==1 && even>0) {
				System.out.println("Yes");
			}else if(even>=(x-(odd-1))){
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
		} 
	         
		
//			boolean ans = false;
//			for(int i=1;i<=Math.min(odd,x);i=i+2){
//		       	  int reqd = x-i;
//		       	  if(even>=reqd)
//		       	     ans = true;
//		       }
//		       
//		       
//		       if(ans)
//		          System.out.println("Yes");
//		          
//		          
//		        else
//		           System.out.println("No");
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
