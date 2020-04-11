package July19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class PRTAGN {
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
			int Q = s.nextInt();
			HashSet<Integer> set = new HashSet<Integer>();
			int odd = 0;
			int even = 0;
			for(int q=0;q<Q;q++) {
				int X = s.nextInt();
				int count = Integer.bitCount(X);
				if(set.contains(X)) {
					System.out.println(even+" "+odd);
					continue;
				}else {
					set.add(X);
					if(count%2==0) {
						int tempOdd = odd;
						int tempEven = even;
						even+=tempEven;
						even++;
						odd+=tempOdd;
					}
					else {
						int tempOdd = even;
						int tempEven = odd;
						even+=tempEven;
						odd++;
						odd+=tempOdd;
					}
				}
				System.out.println(even+" "+odd);
			}
			
		}
	}

}
