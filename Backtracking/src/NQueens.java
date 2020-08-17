import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NQueens {
	static boolean isPossible(int[][] arr, int n, int rows, int col) {
		//column
		for(int i=rows-1;i>=0;i--) {
			if(arr[i][col]==1)
				return false;
		}
		//upper left diagonal
		for(int i=rows-1, j=col-1;i>=0 && j>=0;i--, j--) {
			if(arr[i][j]==1)
				return false;
		}
		//upper right diagonal
		for(int i=rows-1, j=col+1;i>=0 && j<n; i--, j++) {
			if(arr[i][j]==1)
				return false;
		}
		return true;
	}
	static void placeNQueens(int[][] arr, int n, int rows) {
		if(rows>=n) {
//			print matrix
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
		for(int j=0;j<n;j++) {
			if(isPossible(arr, n, rows, j)) {
				arr[rows][j]=1;
				placeNQueens(arr,n,rows+1);
				arr[rows][j]=0;
			}
		}
		
	}
	public static void main(String[] args) {
		FastReader s  = new FastReader();
		int n = s.nextInt();	
		int[][] arr = new int[n][n];
		System.out.println(1);
		placeNQueens(arr, n, 0);
		
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
