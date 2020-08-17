package Round664;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeA {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		while(T-- > 0) {
			long r = s.nextLong();
			long g = s.nextLong();
			long b = s.nextLong();
			long w = s.nextLong();
			long min = Math.min(r,Math.min(g,b));
			long odd = 0;
			long even = 0;
			if(r%2==0) {
				even++;
			}
			else {
				odd++;
			}
			if(g%2==0) {
				even++;
			}
			else {
				odd++;
			}
			if(b%2==0) {
				even++;
			}
			else {
				odd++;
			}

			if(w%2==0) {
				if(odd<=1) {
					System.out.println("Yes");
				}
				else if(odd==2) {
					System.out.println("No");
				}else if(odd==3 && min>0)
					System.out.println("Yes");
			}else {
				if(odd==0) {
					System.out.println("Yes");
				}
				else if(odd==1) {
					System.out.println("No");
				}
				else if(odd>=2 && min>0) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
//				if(odd==3)
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
