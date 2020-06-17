package Round648;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeC {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++){
        	int k = s.nextInt();
        	a[k-1]=i;
        }
        for(int i=0;i<n;i++){
        	int k = s.nextInt();
        	b[k-1]=i;
        }
        
        HashMap<Integer, Integer> right = new HashMap<>();
        HashMap<Integer, Integer> left = new HashMap<>();
        
        for(int i=0;i<n;i++){
          int p1 = a[i];
          int p2 = b[i];
           
           int dis;
           if(p1>p2){
           	 dis = p1-p2;
           }
           else 
               dis = p1 +  (n-p2);
           	if(right.get(dis)==null) {
           		right.put(dis, 1);
           	}else {
           		int cnt=right.get(dis);
           		right.put(dis,cnt+1);
           	}
        }
        
        for(int i=0;i<n;i++){
           int p1 = a[i];
           int p2 = b[i];
           int dis;
           if(p1<p2){
           	 dis = p2-p1;
           }
           else 
               dis = p2 +  (n-p1);
               
           if(left.get(dis)==null) {
          		left.put(dis, 1);
          	}else {
          		int cnt=left.get(dis);
          		left.put(dis,cnt+1);
          	}
        }
        
        
        int ans = 1;
        Set<Integer> set = right.keySet();
        for(int i:set){
        	ans= Math.max(ans,right.get(i));
        }
        
        Set<Integer> set2 = left.keySet();
        for(int i:set2){
        	ans= Math.max(ans,left.get(i));
        }
        
        
        System.out.println(ans);
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
