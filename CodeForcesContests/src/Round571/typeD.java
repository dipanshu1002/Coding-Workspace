package Round571;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeD {
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
		double[] arr = new double[n];
		int[] floor = new int[n];
		int[] ceil = new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=s.nextDouble();
			floor[i]=(int)Math.floor(arr[i]);
			ceil[i]=(int)Math.ceil(arr[i]);
			sum=sum+floor[i];
		}
		if(sum==0) {
			for(int i=0;i<n;i++) System.out.println(floor[i]);
			//System.out.println();
		}else {
			sum=Math.abs(sum);
			for(int i=0;i<n;i++) {
				if(ceil[i]>floor[i]) {
					sum--;
					floor[i]=ceil[i];
					if(sum==0)break;
				}
			}
			for(int i=0;i<n;i++) {
				System.out.println(floor[i]);
			}
		}
	}
}