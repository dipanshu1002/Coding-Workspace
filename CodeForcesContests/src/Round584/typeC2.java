package Round584;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class typeC2 {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			String str = s.nextLine();
			boolean ans = true;
			for(int j=0;j<10;j++) {
				long[] dp = new long[n];
				int i =n-1;
				while(i>=0) {
					long p = (int)str.charAt(i);
					if(p<j) {
						break;
					}
					if(p==j) {
						dp[i]=1;
					}
					i--;
				}
				long s1 = -1;
				long s2 = -1;
				boolean ans2 = true;
				for(int k=0;k<n;k++) {
					int p = (int)str.charAt(k);
					if(dp[k]==0) {
						if(p<j) {
							if(s1==-1) {
								dp[k]=1;
								s1=p;
							}else if(s1<=p) {
								dp[i]=1;
								s1=p;
							}else {
								ans2 = false;
								break;
							}
						}
						else {
							if(s2==-1) {
								dp[k]=2;
								s2=p;
							}else if(s2<=p) {
								dp[k]=2;
								s2=p;
							}else {
								ans2= false;
								break;
							}
						}
					}
					
				}
				if(ans2==true) {
					for(int k=0;k<n;i++) {
						System.out.print(dp[k]);
					}
					System.out.println();
					ans = false;
					break;
				}
			}
			if(ans) {
				System.out.println("-");
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
