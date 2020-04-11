package RoundG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class Shifts {
	
		// Return true if there exists a sub-array of array[0..n] with given sum
		public static boolean subsetSum(int[] A, int n, int sum)
		{
			// return true if sum becomes 0 (subset found)
			if (sum == 0) {
				return true;
			}

			// base case: no items left or sum becomes negative
			if (n < 0 || sum < 0) {
				return false;
			}

			// Case 1. include current item in the subset (A[n]) and recur
			// for remaining items (n - 1) with remaining sum (sum - A[n])
			boolean include = subsetSum(A, n - 1, sum - A[n]);

			// Case 2. exclude current item n from subset and recur for
			// remaining items (n - 1)
			boolean exclude = subsetSum(A, n - 1, sum);

			// return true if we can get subset by including or excluding the
			// current item
			return include || exclude;
		}

		
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int N = s.nextInt();
			int H = s.nextInt();
			long[] A = new long[N];
			for(int i=0;i<N;i++) {
				A[i]=s.nextLong();
			}
			long[] B = new long[N];
			for(int i=0;i<N;i++) {
				B[i]=s.nextLong();
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
