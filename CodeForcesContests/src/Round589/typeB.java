package Round589;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeB {
	static long mod = (long)Math.pow(10,9)+7;
	public static long power(long a, long n) {
		if(n==0) {
			return 1;
		}
		if(n%2==0) {
			return power((a*a)%mod,n/2);
		}
		else {
			return (a%mod*power((a*a)%mod,n/2)%mod)%mod;
		}
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int h = s.nextInt();
		int w = s.nextInt();
		int[][] mat = new int[h][w];
		int[] arrH = new int[h];
		for(int i=0;i<h;i++) {
			arrH[i]=s.nextInt();
		}
		int[] arrW = new int[w];
		for(int i=0;i<w;i++) {
			arrW[i]=s.nextInt();
		}
		
		for(int i=0;i<h;i++) {
			int j = arrH[i];
			for(int k=0;k<j;k++) {
				mat[i][k]=1;
			}
		}
		for(int i=0;i<w;i++) {
			int j = arrW[i];
			for(int k=0;k<j;k++) {
				mat[k][i]=1;
			}
		}
		//System.out.println(mat[0][0]);
		//Check for Valid
		for(int i=0;i<h;i++) {
			int j = arrH[i];
			//System.out.println(j);
			int cnt=0;
			int k=0;
			while( k<w && mat[i][k]==1) {
				k++;
				cnt++;
			}
			if(cnt>j) {
				System.out.println(0);
				return;
			}
		}
		
		for(int i=0;i<w;i++) {
			int j = arrW[i];
			int cnt = 0;
			int k = 0;
			while(k<h && mat[k][i]==1) {
				k++;
				cnt++;
			}
			if(cnt>j) {
				System.out.println(0);
				return;
			}
		}
		//=========================
		int ans = 0;
		int flag=0;
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				flag = 0;
				if(mat[i][j]==1) {
					continue;
				}else {
					int t = i-1;
					while(t>=0) {
						if(mat[t][j]==1) {
							t--;
							continue;
						}else {
							flag=1;
							break;
						}
					}
					if(flag==0) {
						continue;
					}else if(flag==1) {
						int l = j-1;
						while(l>=0) {
							if(mat[i][l]==1) {
								l--;
								continue;
							}else {
								flag=2;
								break;
							}
						}
						if(flag==2) {
							ans++;
						}
					}
				}
			}
		}
		long ans2 = power(2,(long)ans);
		System.out.println(ans2);
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
