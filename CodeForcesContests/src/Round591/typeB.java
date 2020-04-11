package Round591;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class typeB {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int q = s.nextInt();
		for(int t=0;t<q;t++) {
			char[] str1 = s.nextLine().toCharArray();
			char[] str2 = s.nextLine().toCharArray();
			HashSet<Character> set1 = new HashSet<>();
			HashSet<Character> set2 = new HashSet<>();
			for(char c: str1) {
				set1.add(c);
			}
			for(char c: str2) {
				set2.add(c);
			}
			int flag = 0;
			for(char c: set1) {
				if(set2.contains(c)) {
					flag = 1;
					System.out.println("YES");
					break;
				}
			}
			if(flag==0) {
				System.out.println("NO");
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
