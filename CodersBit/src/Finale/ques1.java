package Finale;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class ques1 {
	static double area(int x1, int y1, int x2, int y2, int x3, int y3) 
	{ 
	   return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0); 
	} 
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int N = s.nextInt();
		
		int[][] arr = new int[N][2];
		for(int i=0;i<N;i++) {
			arr[i][0]=s.nextInt();
			arr[i][1]=s.nextInt();
		}
		int[] power = new int[N-2];
		int cnt = 0;
		for(int i=0;i<N-2;i++) {
			for(int j=i+1;j<N-1;j++) {
				for(int k = j+1;k<N;k++) {
					int pt1x = arr[i][0];
					int pt1y = arr[i][1];
					int pt2x = arr[j][0];
					int pt2y = arr[j][1];
					int pt3x = arr[k][0];
					int pt3y = arr[k][1];
					for(int p = 0; p<N;p++) {
						if(p==i ||( p==j || p==k))continue;
						else {
							
							 double A = area(pt1x, pt1y, pt2x, pt2y, pt3x, pt3y); 
							  
							   /* Calculate area of triangle PBC */   
							   double A1 = area(arr[p][0], arr[p][1], pt2x, pt2y, pt3x, pt3y); 
							  
							   /* Calculate area of triangle PAC */   
							   double A2 = area (pt1x, pt1y, arr[p][0], arr[p][1], pt3x, pt3y); 
							  
							   /* Calculate area of triangle PAB */    
							   double A3 = area (pt1x, pt1y, pt2x, pt2y, arr[p][0], arr[p][1]);
							   if(A==(A1+A2+A3)) {
								   cnt++;
							   }
							    
						}
					}	
					power[cnt]++;
					cnt=0;
					
				}
			}
		}
		for(int i=0;i<N-2;i++) {
			System.out.print(power[i]+" ");
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
