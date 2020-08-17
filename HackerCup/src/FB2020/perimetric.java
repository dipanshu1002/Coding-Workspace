package FB2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class perimetric {
	static long mod = (long)Math.pow(10,9)+7;
	static class Pair{
		long end;
		long height;
		Pair(long end, long h) {
			this.end = end;
			this.height = h;
		}
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=1;t<=T;t++) {
			System.out.print("Case #"+t+": ");
			int N = s.nextInt(), K = s.nextInt(), W = s.nextInt();
			long[] L = new long[N];
			long[] H = new long[N];
			for(int i=0;i<K;i++)
				L[i]=s.nextLong();
			
			int A1 = s.nextInt(), B1 = s.nextInt(), C1 = s.nextInt(), D1 = s.nextInt();
			for(int i=0;i<K;i++)
				H[i]=s.nextLong();
			int A2 = s.nextInt(), B2 = s.nextInt(), C2 = s.nextInt(), D2 = s.nextInt();
			 for(int i=K;i<N;i++){
			        L[i] = (A1*L[i-2] + B1*L[i-1] + C1)%D1 + 1 ;
			        H[i] =  (A2*H[i-2] + B2*H[i-1] + C2)%D2 + 1 ;
			    }
			Deque<Pair> queue = new LinkedList<>();
			long per = (2%mod*(H[0]+W)%mod)%mod;

			queue.add(new Pair(L[0]+W, H[0]));
			long ans = per;
			for(int i=1;i<N;i++) {
				Pair p = queue.peek();
				if(L[i]<=p.end) {
					if(H[i]>=p.height) {
						long a1 = (2%mod*(L[i]%mod-L[i-1]%mod+ mod)%mod)%mod;
						long a2 = (2%mod*(H[i]%mod-p.height%mod + mod)%mod)%mod;
						per= (per%mod+((a1%mod + a2%mod)%mod))%mod;
						ans= (ans%mod*per%mod)%mod;
						queue.clear();
						queue.add(new Pair(L[i]+W, H[i]));
					}else {
						while(queue.peekLast().height<=H[i]) {
							queue.pollLast();
						}
						queue.add(new Pair(L[i]+W, H[i]));
						long a1 = (2%mod*(L[i]%mod-L[i-1]%mod+ mod)%mod)%mod;
						per=(per%mod+(a1%mod))%mod;
						ans= (ans%mod*per%mod)%mod;

					}
				}else {
					while(!queue.isEmpty() && L[i]>p.end) {
						queue.poll();
						p = queue.peek();
					}
					if(queue.isEmpty()) {
						queue.add(new Pair(L[i]+W, H[i]));
						per= (per%mod+((2%mod*(H[i]%mod+W%mod)%mod)%mod))%mod;
						ans= (ans%mod*per%mod)%mod;

					}else {
						i--;
						
					}
				}
//				System.out.println(per);
			}
		System.out.println(ans);

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
