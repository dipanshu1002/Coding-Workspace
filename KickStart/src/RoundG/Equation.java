package RoundG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Equation {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int N = s.nextInt();
			long M = s.nextLong();
			long[] arr = new long[N];
			long max = -1;
			for(int i=0;i<N;i++) {
				arr[i]=s.nextLong();
				if(arr[i]>max)max = arr[i];
			}
		
//			System.out.println(pow); 
			long maxk = -1;
			long k = 0;
			while(k<=10000000) {
				long sum = 0;
				for(int i=0;i<N;i++) {
					sum+=(arr[i]^k);
				}
				if(sum<=M) {
					maxk = k;
					k++;
				}else {
					k++;
				}
			}
			System.out.println(maxk);
			
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
