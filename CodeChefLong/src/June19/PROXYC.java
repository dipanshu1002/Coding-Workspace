package June19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROXYC {
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
		FastReader s = new FastReader();
		long T = s.nextLong();
		for(long t=0;t<T;t++) {
			int D = s.nextInt();
			String str = s.next();
			int pre = 0;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='P') {
					pre++;
				}
			}
			double avg = (double)pre/D;
			int reqd = (int)Math.ceil(0.75*D);
			//System.out.println(reqd);
			int pro = reqd - pre;
			if(pro<=0) {
				System.out.println(0);
				continue;
			}
			int ans=0;
			int flag=0;
			for(int i=2;i<D-2;i++) {
				if(str.charAt(i)=='A') {
					if((str.charAt(i+1)=='P'||str.charAt(i+2)=='P')&&(str.charAt(i-1)=='P'||str.charAt(i-2)=='P'))
						ans++;
					if(ans>=pro) {
						System.out.println(pro);
						flag=1;
						break;
						
					}
				}
			}
			
			if(flag==0)
				System.out.println(-1);

				
			}
		}
	}

