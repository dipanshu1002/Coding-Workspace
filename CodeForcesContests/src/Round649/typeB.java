package Round649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeB {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			int[] arr = new int[n];
	 
	        for(int i=0;i<n;i++) {
	          arr[i]=s.nextInt();
	        }
	          
	        ArrayList<Integer> ans = new ArrayList<>();
	         int l = 0;
	         int i=1;
	         TreeSet<Integer> set = new TreeSet<>();
	         while(i<n){
	         	while(i<n && arr[i]>=arr[i-1]){
	         		i++;
	         	}
	         	set.add(l);
	         	set.add(i-1);
	         	l = i-1;
	         	while(i<n && arr[i]<=arr[i-1]){
	         		i++;
	         	}
	         	set.add(l);
	         	set.add(i-1);
	         	
	         }
	        
	        for(Integer in: set)
	         ans.add(arr[in]);
	         
	         
	        System.out.println(ans.size());
	         for(int in: ans)
	            System.out.print(in+" ");
	        
	       
	           
	           
	           System.out.println();
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
