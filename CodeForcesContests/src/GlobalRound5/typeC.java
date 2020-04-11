package GlobalRound5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeC{
	static class Point{
		long x;
		long y;
		long z;
	}
	static long Distance(Point a, Point b) {
		return Math.abs(a.x-b.x)+Math.abs(a.y-b.y)+Math.abs(a.z-b.z);
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		Point[] arr = new Point[n];
		for(int i=0;i<n;i++) {
			arr[i]= new Point();
			arr[i].x = s.nextLong();
			arr[i].y = s.nextLong();
			arr[i].z = s.nextLong();
		}
		boolean[] check = new boolean [n];
		for(int i=0;i<n-1;i++) {
			long dist = Long.MAX_VALUE;
			int index = n;
			if(check[i]!=true) {
				for(int j=i+1;j<n;j++) {
					if(check[j]!=true) {
						long calc = Distance(arr[i],arr[j]);
						if(calc<dist) {
							dist = calc;
							index = j;
						}
					}
				}
				System.out.println(i+1 +" "+(index+1));
				check[index]=true;
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
