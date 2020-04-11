package GlobalRound5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeB {
	static class Car{
		int id;
		int it;
		int et;
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int[] in = new int[n];
		int[] out = new int[n];
		for(int i=0;i<n;i++) {
			in[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)out[i]=s.nextInt();
		boolean[] p = new boolean[n+1];
		int j = 0;
		int o = 0;
		for(int i=0;i<n;i++) {
			if(p[in[i]]==false) {
				while(j<n && out[j]!=in[i]) {
					o++;
					p[out[j]]=true;
					j++;
				}
				j++;
			}
		}
		System.out.println(o);
		
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
