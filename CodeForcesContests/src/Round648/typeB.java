package Round648;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeB {
	static boolean solve(ArrayList<Integer> list){
		for(int i=1;i<list.size();i++){
			if(list.get(i-1)>list.get(i))
			   return false;
		}
		return true;
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			int[] arr1 = new int[n];
			int[] arr2 = new int[n];
			for(int i=0;i<n;i++) {
				arr1[i]=s.nextInt();
			}
			for(int i=0;i<n;i++) {
				arr2[i]=s.nextInt();
			}
			ArrayList<Integer> a1 = new ArrayList<>();
			ArrayList<Integer> b1 = new ArrayList<>();
	        
	        for(int i=0;i<n;i++){
	        	if(arr2[i]==0)
	        	   a1.add(arr1[i]);
	        	   
	        	   
	        	   else
	        	      b1.add(arr1[i]);
	        }
	        
	        if(a1.size()>0 && b1.size()>0)
	           System.out.println("Yes");
	         
	         
	         else{
	           boolean 	ans = solve(a1)& solve(b1);
	           if(ans)
	              System.out.println("Yes");
	              
	              else
	                 System.out.println("No");
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
