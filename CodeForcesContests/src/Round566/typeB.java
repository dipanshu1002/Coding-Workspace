package Round566;

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
		//Scanner s = new Scanner(System.in);
		FastReader s = new FastReader();
		int h = s.nextInt();
		int w = s.nextInt();
		char[][] arr = new char[h][w];
		int star=0;
		int flag=0;
		for(int i=0;i<h;i++) {
			String str=s.next();
			for(int j=0;j<w;j++) {
				arr[i][j]=str.charAt(j);
				if(arr[i][j]=='*'){
						star++;
				}
			}
		}
//		for(int i=0;i<h;i++) {
//			for(int j=0;j<w;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println(star);
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if(arr[i][j]=='*') {
					int row = i-1;
					int c1=0;
					while(row>=0 && arr[row][j]=='*') {
						c1++;
						row--;
					}
					row = i+1;
					int c2=0;
					while(row<h && arr[row][j]=='*') {
						c2++;
						row++;
					}
					int col=j-1;
					int c3=0;
					while(col>=0 && arr[i][col]=='*') {
						c3++;
						col--;
					}
					col=j+1;
					int c4=0;
					while(col<w && arr[i][col]=='*') {
						col++;
						c4++;
					}
					int total=0;
					if(c1>0 && c2>0 && c3>0 && c4>0) {
						total=c1+c2+c3+c4+1;
					}
					if(total==star) {
						flag=1;
					}
				}
			}
		}
		if(flag==1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		
	}
}
