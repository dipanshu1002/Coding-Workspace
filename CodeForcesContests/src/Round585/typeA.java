package Round585;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeA {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int a1 = s.nextInt();
		int a2 = s.nextInt();
		int k1 = s.nextInt();
		int k2 = s.nextInt();
		int n = s.nextInt();
		int n2 = n;
		int p = 0;
		
		n-=(a1*(k1-1));
		n-=(a2*(k2-1));
		if((a1+a2)<n) {
			System.out.print(a1+a2+" ");
		}else if(n>=0) {
			System.out.print(n+" ");
		}else if(n<0) {
			System.out.print(0+" ");
		}
		if(k2<k1) {
			int tot = n2/k2;
			if(a2>tot) {
			n2-=(k2*tot);
			}else {
				tot = a2;
				n2-=(k2*tot);
			}
			int tot2 = n2/k1;
			if(a1>tot2) {
				tot+=tot2;
			}else {
				tot+=a1;
			}
			System.out.println(tot);
		}else {
			int tot = n2/k1;
			if(a1>tot) {
			n2-=(k1*tot);
			}else {
				tot = a1;
				n2-=(k1*tot);
			}
			int tot2 = n2/k2;
			if(a2>tot2) {
				tot+=tot2;
			}else {
				tot+=a2;
			}
			System.out.println(tot);
			
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
