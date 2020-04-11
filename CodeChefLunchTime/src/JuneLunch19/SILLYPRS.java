package JuneLunch19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class SILLYPRS {
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
			int N = s.nextInt();
			long[] arr1 = new long[N];
			long[] arr2 = new long[N];
			long sum1 = 0;
			long sum2 = 0;
			for(int i=0;i<N;i++) {
				arr1[i]=s.nextLong();
				sum1+=arr1[i];
			}
			for(int i=0;i<N;i++) {
				arr2[i]=s.nextLong();
				sum2+=arr2[i];
			}
			int count1=0;
			int count2=0;
			int count3=0;
			int count4=0;
			for(int i=0;i<N;i++) {
				if((arr1[i]%2)==0)count1++;
				else if(arr1[i]%2==1)count2++;
				
				if(arr2[i]%2==0) count3++;
				else if(arr2[i]%2==1) count4++;
			}
			int e = (int)Math.min(count1,count3);
			int o = (int)Math.min(count2,count4);
			int p = N - e - o;
			System.out.println((sum1 + sum2)/2 - (p/2));
		}
	}
}
