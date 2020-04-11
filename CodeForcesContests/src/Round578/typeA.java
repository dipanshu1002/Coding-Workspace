package Round578;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeA {
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
		int[] arr = new int[10];
		String str = s.nextLine();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='L') {
				int j = 0;
				while(j<10 && arr[j]==1) {
					j++;
				}
				arr[j]=1;
			}else if(str.charAt(i)=='R') {
				int j=9;
				while(j>=0 && arr[j]==1) {
					j--;
				}
				arr[j]=1;
			}else {
				int j = (int)(str.charAt(i)-'0');
				arr[j]=0;
			}
		}
		for(int i: arr) {
			System.out.print(i);
		}
		System.out.println();
//		System.out.println(Arrays.toString(arr));
	}
}
