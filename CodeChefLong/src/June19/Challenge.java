package June19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Challenge {
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
		//3 array - n,m,mx2 - store info
		// out(-1)
		//for(i=0;i<n; 
		FastReader s = new FastReader();
		int N  = s.nextInt();
		int M = s.nextInt();
		int[] arr = new int[N]; 
		for(int i=0;i<N;i++) {
			arr[i]=s.nextInt();
		}
		int[] arr2 = new int[M];
		for(int i=0;i<M;i++) {
			arr2[i]=s.nextInt();
		}
		int[][] arr3 = new int[M][2];
		for(int i=0;i<M;i++) {
			for(int j=0;j<2;j++) {
				arr3[i][j]=s.nextInt();
			}
		}
		System.out.println(-1);
		for(int i=0;i<(N+1)/2;i++) {
			System.out.print('C');
		}
		for(int i=(N+1)/2;i<N;i++) {
			System.out.print('G');
		}
		System.out.println();
		
			
		}
		
}
