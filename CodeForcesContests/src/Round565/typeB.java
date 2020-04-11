package Round565;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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
		long T = s.nextLong();
		for(long t=0;t<T;t++) {
			int N = s.nextInt();
			long[] arr = new long[N];
			for(int i=0;i<N;i++) {
				arr[i]=(s.nextLong()%3);
			}
			int count0 = 0;
			for(int i=0;i<N;i++) {
				if(arr[i]==0)
					count0++;
			}
			int count1 = 0;
			for(int i=0;i<N;i++) {
				if(arr[i]==1)
					count1++;
			}
			int count2 = 0;
			for(int i=0;i<N;i++) {
				if(arr[i]==2)
					count2++;
			}
			long a = (long)Math.min(count1,count2);
			long b = (long)Math.max(count1,count2);
			long term3 = (b-a)/3;
			System.out.println(count0+a+term3);
		}
	}
}
