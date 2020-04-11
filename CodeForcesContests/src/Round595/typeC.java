package Round595;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeC {
	static ArrayList<Integer> v = new ArrayList<>();
	
	static int help(int p) {
		int s = 0, e = v.size()-1;
		int ans = -1;
		while(s<=e) {
			int mid = (s+e)/2;
			if(v.get(mid)>=p) {
				ans = mid;
				e = mid-1;
			}else{
				s = mid+1;
			}
		}
		return v.get(ans);
	}
	static void call(int sum, int i, int[] a) {
		if(i==20) {
			v.add(sum);
			return;
		}
		call(sum+a[i],i+1,a);
		call(sum,i+1,a);
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int Q = s.nextInt();
		
			int[] a = new int[20];
			a[0]=1;
			for(int i=1;i<20;i++) {
				a[i]=(3*a[i-1]);
			}
			call(0,0,a);
			Collections.sort(v);
			for(int q=0;q<Q;q++) {
				int k = s.nextInt();
				int ans = help(k);
				System.out.println(ans);
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
