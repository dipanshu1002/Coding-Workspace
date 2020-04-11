package May19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class q2 {
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
			int r = s.nextInt();
			int c = s.nextInt();
			int flag = 0;
			int[][] arr = new int[r][c];
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					arr[i][j]=s.nextInt();
				}
			}
			
			//corners
			if(arr[0][0]>=2 || arr[0][c-1]>=2 || arr[r-1][0]>=2 || arr[r-1][c-1]>=2) {
				flag=1;
			}
			if(flag==1) {
				System.out.println("Unstable");
				continue;
			}
			//first and last row
			for(int j=1;j<c-1;j++) {
				if(arr[0][j]>=3||arr[r-1][j]>=3) {
					flag = 1;
					break;
				}
			}
			if(flag==1) {
				System.out.println("Unstable");
				continue;
			}
			//first and last column
			for(int i=1;i<r-1;i++) {
				if(arr[i][0]>=3||arr[i][c-1]>=3) {
					flag = 1;
					break;
				}
			}
			if(flag==1) {
				System.out.println("Unstable");
				continue;
			}
			//middle
			for(int i=1;i<r-1;i++) {  
				for(int j=1;j<c-1;j++) {
					if(arr[i][j]>=4) {
						flag=1;
						break;
					}
				}
					if(flag==1) {
						break;
				}
			}
			
			if(flag==1) {
				System.out.println("Unstable");
			}else if(flag==0){
				System.out.println("Stable");
			}
		}
		
		
	}

}
