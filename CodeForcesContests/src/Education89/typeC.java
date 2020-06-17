package Education89;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeC{
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			int m = s.nextInt();
			int[][] arr =new int[n+m][2];
			for(int i=0;i<(n+m);i++) {
				arr[i][0]=0;
				arr[i][1]=0;
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					int k = s.nextInt();
					arr[i+j][k]++;
				}
			}
			int  x = 0;
			int y = n+m-2;
			int cnt = 0;
			while(x<y) {
				int a = arr[x][0]+arr[y][0];
				int b = arr[x][1]+arr[y][1];
//				System.out.println(a+","+b);
				cnt+=(Math.min(a, b));
				x++;
				y--;
			}
			System.out.println(cnt);
			
			
			
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
