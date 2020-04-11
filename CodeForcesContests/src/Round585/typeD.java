package Round585;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeD {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		String str = s.nextLine();
		int l = 0;
		int r = n-1;
		long sum1 = 0;
		long sum2 = 0;
		int ql=0;
		int qr=0;
		while(l<=r) {
			if(str.charAt(l)!='?') {
				sum1+=(str.charAt(l)-'0');
				l++;
			}else if(str.charAt(l)=='?') {
				l++;
				ql++;
			}
			if(str.charAt(r)!='?') {
				sum2+=(str.charAt(r)-'0');
				r--;
			}else if(str.charAt(r)=='?') {
				r--;
				qr++;
			}
		}
		
		if(sum1==sum2 && ql==qr) {
			System.out.println("Bicarp");
		}else if(sum1+(ql*9) > (sum2 + (qr*9))){
			System.out.println("Monocarp");
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
