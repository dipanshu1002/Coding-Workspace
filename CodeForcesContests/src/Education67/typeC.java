package Education67;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class typeC {
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
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int m = s.nextInt();
		int left = -1;
		int right = -1;
		int[] arr = new int[n+1];
		int flag=0;
		for(int i=0;i<m;i++) {
			int t = s.nextInt();
			int l = s.nextInt();
			int r = s.nextInt();
			if(t==0) {
				if(l>=left && l<=right && r<=right && r>=left) {
					flag = 1;
				}else {
					
				}
			}
			if(t==1) {
				if(left==-1 && right==-1) {
					left = l;
					right = r;
					
					
				}
			}
		}
	}
}