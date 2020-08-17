package Round654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeD {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt(), k = s.nextInt();
		  	int[][]arr = new int[n][n];
		  	if(k%n==0)
		  		System.out.println(0);
		  	else
		  		System.out.println(2);
		  	int p = 0;
		  	int q = 0;
		  	int f = 0;
		  	int d1 = 0;
		  	int d2 = n-2;
		  	while(k>0) {
		  		if(p==n) {
		  			p=0;
		  			q=(q+1)%n;
		  		}
		  		arr[p][q]=1;
		  		p++;
		  		q=(q+1)%n;
		  		k--;
		  	}
		  	int maxr = -1;
		  	int minr = n+1;
		  	int sum = 0;
		  	for(int i=0;i<n;i++) {
		  		for(int j=0;j<n;j++) {
		  			if(arr[i][j]==1)
		  				sum+=arr[i][j];
		  		}
		  		maxr = Math.max(sum,maxr);
		  		minr = Math.min(sum,minr);
		  		sum=0;
		  	}
		  	
		  	int maxc = -1;
		  	int minc = n+1;
		  	sum=0;
		  	for(int i=0;i<n;i++) {
		  		for(int j=0;j<n;j++) {
		  			if(arr[j][i]==1)
		  				sum+=arr[j][i];
		  		}
		  		maxc = Math.max(sum,maxc);
		  		minc = Math.min(sum, minc);
		  		sum=0;
		  	}
//		  	System.out.println(maxr+" "+minr+" "+maxc+" "+minc);
//		  	System.out.println("f: "+((maxr-minr)*(maxr-minr) + (maxc-minc)*(maxc-minc)));
		  	for(int i=0;i<n;i++) {
		  		for(int j=0;j<n;j++) {
		  			System.out.print(arr[i][j]);
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
