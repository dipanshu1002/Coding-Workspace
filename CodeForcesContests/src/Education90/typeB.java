package Education90;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeB {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			char[] str = s.next().toCharArray();
			int mv = 0;
			int cnt0=0;
			int cnt1=0;
			int i=0;
			while(i<str.length-1) {
				if(str[i]=='0' && str[i+1]=='1') {
					mv++;
					i+=2;
				}else if(str[i]=='1' && str[i+1]=='0') {
					mv++;
					i+=2;
				}else {
					if(str[i]=='0')
						cnt0++;
					else
						cnt1++;
					i++;
				}
			}
			if(i==(str.length-1)) {
				if(str[i]=='0')
					cnt0++;
				else
					cnt1++;
				
			}
//			System.out.println(mv);
//			System.out.println(Math.min(cnt0,cnt1));
			if((mv+Math.min(cnt0,cnt1))%2==0){
				System.out.println("NET");
			}else {
				System.out.println("DA");
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
