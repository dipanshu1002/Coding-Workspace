package May19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class q1 {
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
		long T = s.nextLong();
		for(long t=0;t<T;t++) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			double[] diff = new double[n];
			diff[0]=arr[1]-arr[0];
			
			for(int i=1;i<n-1;i++) {
				diff[i]=arr[i+1]-arr[i];
				}
			
			diff[n-1] = (arr[n-1]-arr[0])/(double)(n-1);
			
			if(diff[0]==diff[n-1]) {
				System.out.print(arr[0]+" ");
				for(int i=1;i<n;i++) {
					arr[i]=(int)(arr[0] + i*diff[0]);
					System.out.print(arr[i]+" ");
				}
			}
			else {
			int a = arr[1]-arr[0];
			int b = arr[2]-arr[1];
			int c = arr[n-1]-arr[n-2];
			int d = arr[3]-arr[2];
			if(((arr[n-1]-arr[0])/(n-1))==d && ((arr[n-1]-arr[0])/(double)(n-1))%1==0) {
				arr[1]=arr[0]+d;
			}
			if(b==d && a!=b) {
				arr[0]=arr[n-1]-(n-1)*d;
			}
			if(a==b && a!=c) {
				arr[n-1]=arr[n-2]+a;
			}
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			}
			System.out.println();
				}
			}
			
			
			
		}
		


