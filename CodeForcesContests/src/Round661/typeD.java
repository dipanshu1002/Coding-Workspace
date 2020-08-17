package Round661;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeD {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		while(T-->0) {
			int n = s.nextInt();
			char[] str = s.next().toCharArray();
			int cnt0 = 0;
			int cnt1 = 0;
			int ans = 0;
			ArrayList<Integer>list = new ArrayList<>();
			Stack<Integer> st0 = new Stack();
			Stack<Integer> st1 = new Stack();
			for(int i=0;i<str.length;i++) {
				if(str[i]=='0') {
					if(cnt1==0) {
						ans++;
						cnt0++;
						st0.add(ans);
						list.add(ans);
					}else {
						int ele = st1.pop();
						list.add(ele);
						st0.add(ele);
						cnt1--;
						cnt0++;
					}
				} //str[i]=='1'
				else {
					if(cnt0==0) {
						ans++;
						cnt1++;
						st1.add(ans);
						list.add(ans);
					}else {
						int ele = st0.pop();
						list.add(ele);
						st1.add(ele);
						cnt1++;
						cnt0--;
					}
				}
			}
			System.out.println(ans);
			for(int i:list) {
				System.out.print(i+" ");
			}
			System.out.println();
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
