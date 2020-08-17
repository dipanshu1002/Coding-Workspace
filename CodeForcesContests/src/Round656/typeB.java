package Round656;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeB {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		while(T-->0) {
			int n = s.nextInt();
		      
		      int[] arr = new int[2*n];
		      for(int i=0;i<2*n;i++)
		         arr[i]=s.nextInt();
		      
		      
		    HashSet<Integer> set = new HashSet<>();
		      ArrayList<Integer> ans = new ArrayList<>();
		      set.add(arr[0]);
		      ans.add(arr[0]);
		      for(int i=1;i<2*n;i++){
		      	if(!set.contains(arr[i])){
		      		ans.add(arr[i]);
		      		set.add(arr[i]);
		      	}
		      }
		      
		      for(int i:ans)
		    	  System.out.print(i+" ");
		         
		         
		         System.out.println();;
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
