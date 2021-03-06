package Round558;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeB {
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
		int[][] arr = new int[11][n+1];
		for(int i=1;i<=n;i++) {
			int a=s.nextInt();
			for(int j=0;j<11;j++) {
				if(j==a) {
					arr[j][i]=arr[j][i-1]+1;
				}
				else {
				arr[j][i]=arr[j][i-1];
				}
			}
		}
		for(int i=1;i<11;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
