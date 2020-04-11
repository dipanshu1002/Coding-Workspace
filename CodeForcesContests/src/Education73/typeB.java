package Education73;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeB{
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		char[][] mat = new char[n][n];
		int xor = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j]=='\0') {
					if(xor==0) {
						mat[i][j]='W';
						xor=xor^1;
						if((i+2)<n && (j+1)<n) {
							mat[i+2][j+1]='B';
						}
						if((i+1)<n && (j+2)<n) {
							mat[i+1][j+2]='B';
						}
						if((i+2)<n && (j-1)>=0) {
							mat[i+2][j-1]='B';
						}
						if((i+1)<n && (j-2)>=0) {
							mat[i+1][j-2]='B';
						}
					}
					else if(xor==1) {
						mat[i][j]='B';
						xor=xor^1;
						if((i+2)<n && (j+1)<n) {
							mat[i+2][j+1]='W';
						}
						if((i+1)<n && (j+2)<n) {
							mat[i+1][j+2]='W';
						}
						if((i+2)<n && (j-1)>=0) {
							mat[i+2][j-1]='W';
						}
						if((i+1)<n && (j-2)>=0) {
							mat[i+1][j-2]='W';
						}
					}
				}else {
					continue;
				}
			}
				
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]);
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
