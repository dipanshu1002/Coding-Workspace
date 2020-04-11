package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeA {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			long N = s.nextLong();
			ArrayList<Integer> list = new ArrayList<>();
			while(N>0) {
				list.add((int)N%10);
				N/=10;
			}
			Collections.reverse(list);
			int[] arr = new int[list.size()];
			int j =0;
			for(int i: list) {
				arr[j]=i;
				j++;
			}
			int in = 0;
			int max = arr[0];
			if(arr[1]==0) {
				int i=1;
				while(i<arr.length && arr[i]==0) {
					i++;
				}
				if(i==arr.length) {
					System.out.println(0);
					continue;
				}
				for(int k=i;k<arr.length;k++) {
					System.out.print(arr[k]);
				}
				System.out.println();
				continue;
			}else {
			for(int i=1;i<arr.length;i++) {
				if(arr[i]>max) {
					max = arr[i];
					in = i;
				}else if(arr[i]<max) {
					break;
				}
			}
			for(int i=0;i<arr.length;i++) {
				if(i==in)continue;
				else {
					System.out.print(arr[i]);
				}
			}
			System.out.println();
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
