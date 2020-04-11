package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeC {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int i =1;
		int j = n*n;
		ArrayList<Integer>[] arr = new ArrayList[n];
		for(int k=0;k<n;k++) {
			arr[k]=new ArrayList<Integer>();
		}
		
		int check = 0;
		int xor = 0;
		if(n%2==0) {
		while(i<=j) {
			
			arr[check%n].add(i);
			arr[check%n].add(j);
			i++;
			j--;
			check++;
		}
		}else {
			while((j-i)>=n) {
				arr[check%n].add(i);
				arr[check%n].add(j);
				i++;
				j--;
				check++;
			}
			for(int k=i;k<i+n;k++) {
				arr[check%n].add(k);
				check++;
			}
		}
		for(int x=0;x<n;x++) {
			for(int el: arr[x]) {
				System.out.print(el+" ");
			}
			System.out.println();
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
