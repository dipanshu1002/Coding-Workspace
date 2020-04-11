package Round560;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeC {
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
		int n =s.nextInt();
		String str = s.next();
		int op=0;
		ArrayList<Character> al = new ArrayList<Character>();
		for(int i=0;i<n;i++) {
			al.add(str.charAt(i));
		}
		for(int i=0;i<al.size();i++) {
			if(i%2==0) {
				if((i+1)<al.size()) {
				if(al.get(i)==al.get(i+1)) {
					al.remove(i);
					i--;
					op++;
				}
				}
			}
		}
		
		if(al.size()%2!=0) {
			op++;
			al.remove(al.size()-1);
		}
		System.out.println(op);
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i));
		}
		
		}
	}

