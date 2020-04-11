package Education71;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
	static class Pair{
		int x;
		int y;
	}
	public static  void main(String[] args) {
		
		FastReader s = new FastReader();
		int n = s.nextInt();
		int m = s.nextInt();
		int[][] A = new int[n][m];
		int[][] B = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				A[i][j]=s.nextInt();
			}
		}
		int op = 0;
		ArrayList<Pair> list = new ArrayList<>();
		int flag = 0;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<m-1;j++) {
				if(A[i][j]==1) {
					if(A[i+1][j]==1 && A[i][j+1]==1 && A[i+1][j+1]==1) {
						op++;
						Pair p = new Pair();
						p.x = (i+1);
						p.y = (j+1);
						list.add(p);
						B[i][j]=1;
						B[i+1][j]=1;
						B[i+1][j+1]=1;
						B[i][j+1]=1;
					}else {
						continue;
					}
				}
			}
			
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(A[i][j]==B[i][j]) {
					continue;
				}else {
					flag=1;
					break;
				}
			}
			if(flag==1) {
				break;
			}
		}
		if(flag==1) {
			System.out.println(-1);
		}else {
			System.out.println(op);
			for(Pair p: list) {
				System.out.println(p.x+" "+p.y);
			}
		}
	}
}
