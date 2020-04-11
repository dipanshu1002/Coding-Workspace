package Round505;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeC {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int k = s.nextInt();
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		if(n==k) {
			System.out.println(str1);
			return;
		}
		Stack<Character> st = new Stack<>();
		Queue<Character> temp = new LinkedList<>();
		Queue<Character> ans = new LinkedList<>();
		int i = 0;
		int len = 0;
		int xor = 0;
		while(i<n && len<k) {
			if(str1.charAt(i)=='(') {
				xor=0;
				st.push(str1.charAt(i));
				i++;
				continue;
			}
			else if(str1.charAt(i)==')' && xor==0) {
				ans.add(st.pop());
				ans.add(')');
				len+=2;
				xor=1;
				i++;
				continue;
			}
			else if(str1.charAt(i)==')' && xor==1) {
				while(!ans.isEmpty()) {
					temp.add(ans.remove());
				}
				ans.add(st.pop());
				while(!temp.isEmpty()) {
					ans.add(temp.remove());
				}
				ans.add(')');
				i++;
				len+=2;
				continue;
			}
		}
		while(!ans.isEmpty()) {
			System.out.print(ans.remove());
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
