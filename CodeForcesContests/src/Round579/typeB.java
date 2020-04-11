package Round579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

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
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			int[] arr = new int[4*n];
			for(int i=0;i<4*n;i++) {
				arr[i]=s.nextInt();
			}
			Arrays.sort(arr);
		//	System.out.println(Arrays.toString(arr));
			long ar = arr[0]*arr[4*n-1];
			int l = 0;
			int r =( arr.length-1);
			int flag = 0;
			while(l<r) {
				if((arr[l]==arr[l+1]) && (arr[r]==arr[r-1]) && ((arr[l]*arr[r])==ar)) {
					l+=2;
					r-=2;
					continue;
				}else {
					flag=1;
					break;
				}
			}
			if(flag==1) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
		
	}
}
