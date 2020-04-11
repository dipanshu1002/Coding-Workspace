package Round589;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeA {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int l = s.nextInt();
		int r = s.nextInt();
		HashSet<Integer> set = new HashSet<>();
		int flag = 0;
		for(int i=l;i<=r;i++) {
			int j = i;
			//System.out.println(j);
			while(j>0) {
				if(set.contains(j%10)) {
					flag = 1;
					set.clear();
					break;
				}else {
					flag=0;
					set.add(j%10);
					//System.out.println(set);
					j/=10;
				}	
			}
			if(flag==1) {
				//System.out.println(set);
				set.clear();
				continue;
			}else if(flag==0) {
				System.out.println(i);
				break;
			}
		}
		if(flag==1) {
			System.out.println(-1);
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
