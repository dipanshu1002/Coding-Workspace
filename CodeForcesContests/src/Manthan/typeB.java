package Manthan;

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
		int n = s.nextInt();
		long[] arr = new long[n];
		HashSet<Long> set = new HashSet<>();
		HashSet<Long> set2 = new HashSet<>();
		
		for(int i=0;i<n;i++) {
			arr[i]=s.nextLong();
		}
		int flag = 0;
		int k = arr.length;
		for(int j=arr.length-1;j>=0;j--) {
			if(!set.contains(arr[j])) {
				set.add(arr[j]);
			}
			else {
				k=j;
				flag = 1;
				break;
			}
		}
		
		
		for(int i=0;i<=k;i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
			}else {
				break;
			}
		}
		int ans1 = n-set.size();
		for(int i=0;i<arr.length;i++) {
			if(!set2.contains(arr[i])) {
				set2.add(arr[i]);
			}
			else {
				k=i;
				flag = 1;
				break;
			}
		}
		for(int i=arr.length-1;i>=k;i--) {
			if(!set2.contains(arr[i])) {
				set2.add(arr[i]);
			}else {
				break;
			}
		}
		System.out.println(Math.min(n-set2.size(),n-set.size()));
	
	
		
	}
}
