package Round588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeD {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		TreeMap<Long, ArrayList<Integer>> map = new TreeMap<>(Collections.reverseOrder());
		for(int i=0;i<n;i++) {
			a[i]=s.nextLong();
			if(map.get(a[i])==null) {
				ArrayList<Integer> list = new ArrayList<>();
				map.put(a[i],list);
				map.get(a[i]).add(i);
			}else {
				map.get(a[i]).add(i);
			}
		}
		for(int i=0;i<n;i++) {
			b[i]=s.nextLong();
		}
		Set<Long> set = map.keySet();
		HashSet<Long> ansSet = new HashSet<>();
		long sum = 0;
		for(Long l : set) {
			if(map.get(l).size()>1) {
				ansSet.add(l);
				for(int j : map.get(l)) {
					sum+=b[j];
				}
			}
		}
		for(Long l : set) {
			if(ansSet.contains(l)) continue;
			else {
				int flag1 = 0;
				for(Long j: ansSet ) {
					if(j==l) continue;
					else if((l&j)==l) {
							flag1 = 1;
							break;	
						}
				}
				if(flag1==1) {
					ansSet.add(l);
					sum+=b[map.get(l).get(0)];
				}
			}
		}
		System.out.println(sum);
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
