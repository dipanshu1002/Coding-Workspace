package August19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class KS1 {
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
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int N = s.nextInt();
			long[] arr = new long[N];
			for(int i=0;i<N;i++) {
				arr[i]=s.nextLong();
			}
		long[] preXor = new long[N];
		HashMap<Long,ArrayList<Long>> map = new HashMap<>();
		ArrayList<Long> start = new ArrayList<>();
		start.add((long)0);
		map.put((long)0,start);
		preXor[0]=arr[0];
		if(preXor[0]==0) {
			map.get(preXor[0]).add((long)1);
		}else {
			ArrayList<Long> list = new ArrayList<>();
			list.add((long)1);
			map.put(preXor[0],list);
		}
		for(int i=1;i<N;i++) {
			preXor[i]=preXor[i-1]^arr[i];
			if(map.get(preXor[i])==null) {
				ArrayList<Long> list = new ArrayList<>();
				list.add((long)i+1);
				map.put(preXor[i],list);
			}else {
				map.get(preXor[i]).add((long)i+1);
			}
		}
		//System.out.println(map);
		Set<Long> set = map.keySet();
		//System.out.println(set);
		long total = 0;
		for(long ele: set) {
			ArrayList<Long> list = map.get(ele);
			long[] abs = new long[list.size()];
			int j=0;
			for(long l: list) {
				abs[j]=l;
				j++;
			}
			long sum = 0;
			for(int i=(abs.length-1);i>=0;i--) {
				sum+=(i*abs[i]-((abs.length-1-i)*abs[i]));
			}
			sum -=((abs.length*(abs.length-1))/2);
			total+=sum;
		}
		
		System.out.println(total);
		
		}
		
		
	}
}

