package Round1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class WinOrLose {
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
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int N = s.nextInt();
			int[] arrV = new int[N];
			int[] arrP = new int[N];
			int win=0;
			for(int i=0;i<N;i++) {
				arrV[i]=s.nextInt();
			}
			Arrays.sort(arrV);
			for(int i=0;i<N;i++) {
				arrP[i]=s.nextInt();
			}
			Arrays.sort(arrP);
			
			for(int i=0;i<N;i++) {
				if(arrP[i]<=arrV[i]) {
					win=1;
					break;
				}
			}
			if(win==1) {
				System.out.println("LOSE");
			}else {
				System.out.println("WIN");
			}
		}
	}
}
