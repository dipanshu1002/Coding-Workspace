package Round657;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeA {
	static class Pair{
		int index;
		char c;
		Pair(int in, char c){
			index = in;
			this.c = c;
		}
	}
	static int isSubstring( 
	        String s1, String s2) 
	    { 
	        int M = s1.length(); 
	        int N = s2.length(); 
	  
	        /* A loop to slide pat[] one by one */
	        for (int i = 0; i <= N - M; i++) { 
	            int j; 
	  
	            /* For current index i, check for 
	            pattern match */
	            for (j = 0; j < M; j++) 
	                if (s2.charAt(i + j) 
	                    != s1.charAt(j)) 
	                    break; 
	  
	            if (j == M) 
	                return i; 
	        } 
	  
	        return -1; 
	    } 
	  static boolean isSub(char[] str, char[] s2) {
		  for(int i=0;i<str.length;i++) {
			  if(str[i]=='?')
				  str[i]='d';
		  }
		  int cnt = 0;
		  for(int i=0;i<=str.length-7;i++) {
			  int j;
			  for(j=0;j<7;j++) {
				  if(str[i+j]!=s2[j])
					  break;
			  }
			  if(j==7) {
				  cnt++;
			  }
		  }
		  if(cnt==1)
			  return true;
		  else
			  return false;
		  
	  }
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			char[] s2 = s.next().toCharArray();
			char[] s1 = {'a','b','a','c','a','b','a'};
			ArrayList<Pair> list = new ArrayList<>();
			int cnt = 0;
			boolean before = false;
			boolean added = false;
			boolean fans =false;
			char[] ans1 = new char[n];
			for(int i=0;i<=s2.length-7;i++) {
				if(s2[i]=='a'||s2[i]=='?') {
					boolean ans = true;
					char[] temp = s2.clone();
					for(int j=0;j<7;j++) {
						if(temp[i+j]=='?')
							temp[i+j]=s1[j];
						if(temp[i+j]!=s1[j]) {
							ans = false;
							break;
						}
					}
					if(ans) {
						if(isSub(temp,s1)) {
							fans =true;
							ans1 = temp;
						}
					}
				}
			}
			if(fans) {
				System.out.println("YES");
				for(int i=0;i<n;i++) {
					if(ans1[i]=='?')
						System.out.print('d');
					else
						System.out.print(ans1[i]);
				}
				System.out.println();
			}else
				System.out.println("NO");
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
