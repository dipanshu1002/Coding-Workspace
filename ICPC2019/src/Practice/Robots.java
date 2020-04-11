package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Robots {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			String str = s.nextLine();
			int flag = 0;
			for(int i=0;i<str.length()-1;i++) {
				if((char)str.charAt(i)=='.') {
					continue;
				}
				else {
					for(int j =i+1;j<str.length();j++) {
						if(str.charAt(j)!='.') {
							int a = str.charAt(i)-'0';
							int b = str.charAt(j)-'0';
							if((j-b)<=(a+i)) {
								flag = 1;
								System.out.println("unsafe");
								break;
							}	
						}
					}
					if(flag==1) {
						break;
					}
				}
			}
			if(flag==0)
				System.out.println("safe");
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
