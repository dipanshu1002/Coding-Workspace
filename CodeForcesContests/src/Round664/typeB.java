package Round664;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeB {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = 1;
		while(T-- > 0) {
			int n = s.nextInt();
			int m = s.nextInt();
			int x = s.nextInt()-1, y = s.nextInt()-1;
			//left
			int[][]mat = new int[n][m];
//			System.out.println("x: "+x+"y: "+y);
			for(int i=y;i>=0;i--){
//				System.out.println("left");
				mat[x][i]=1;
				System.out.println((x+1)+" "+(i+1));
			}
			x--;
			y=0;
//			System.out.println(x);
			for(int i=x;i>=0;i--) {
				if(mat[i][0]==0) {
					mat[i][0]=1;
					System.out.println((i+1)+" "+(0+1));
				}
//				System.out.println(x);
			}
			for(int i=0;i<n;i++) {
				if(mat[i][0]==0) {
					mat[i][0]=1;
					System.out.println((i+1)+" "+(0+1));
				}
			}
			y = 1;
			int k=0;
			while(y<m) {
				if(k%2==0) {
					for(int i=n-1;i>=0;i--) {
						if(mat[i][y]==0) {
							mat[i][y]=1;
							System.out.println((i+1)+" "+(y+1));
						}
					}
					k^=1;
				}
					else {
						for(int i=0;i<n;i++){
							if(mat[i][y]==0) {
								mat[i][y]=1;
								System.out.println((i+1)+" "+(y+1));
							}
						}
						k^=1;
					}
			y++;
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
