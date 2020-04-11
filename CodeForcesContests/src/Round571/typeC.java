package Round571;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeC {
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
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		int count1=0;
		int[] arr = new int[str1.length()+1];
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)=='1') {
				arr[i+1]=arr[i]+1;
				count1++;
			}else {
				arr[i+1]=arr[i];
			}
		}
	//	System.out.println(count1);
		int count=0;
		for(int i=0;i<str2.length();i++) {
			if(str2.charAt(i)=='1') {
				count++;
			}
		}
	//	System.out.println(count);
		int len2 = str2.length();
		int ans=0;
		for(int i=0;i<=str1.length()-len2;i++) {
//			String str3 = str1.substring(i,i+len2);
			//System.out.println(str3);
			int total = arr[i+len2]-arr[i];
			//System.out.println(total);
			if((total-count)%2==0) {
				ans++;
			}
		}
		System.out.println(ans);
		
	}
}
