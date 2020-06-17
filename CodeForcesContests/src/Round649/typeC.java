package Round649;

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
			ArrayList<Integer> arr = new ArrayList<>();
			HashSet<Integer> ans = new HashSet<>();
			ArrayList<Integer> list = new ArrayList<>();
			for(int i=0;i<n;i++) {
				int a = s.nextInt();
				arr.add(a);
			}
			int cur = 0;
			int a = 0;
			for(int i=0;i<n;i++) {
				int f = 0;
				for(int j=0;j<arr.get(i);j++) {
					if(ans.contains(j))
						continue;
					ans.add(j);
					list.add(i,j);
					f=1;
					break;
				}
				if(f==0) {
					a=1;
					break;
				}
				
			}
			if(a==1) {
				System.out.println(-1);
			}else {
				for(int i:list)
					System.out.print(i+" ");
				System.out.println();
			}
			
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
