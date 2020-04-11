package August19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class ZOMCAV {
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
			long[] arr = new long[N+1];
			long[] zom = new long[N];
			long[] pre = new long[N+2];
			for(int i=0;i<N;i++) {
				arr[i+1]=s.nextLong();
			}
			for(int i=1;i<=N;i++) {
				long l = i-arr[i];
				long r = i+arr[i];
				//System.out.println("l: "+l);
				if(l<1) {
					pre[1]+=1;
				}else {
					pre[(int)l]+=1;
				}
				if(r<=N && l<=r) {
					pre[(int)r+1]-=1;
				}else if(r>=(N+1) && l<=N) {
					pre[(int)N+1]-=1;
				}
				
			}
			for(int i=1;i<=(N+1);i++) {
				pre[i]=pre[i-1]+pre[i];
			}
//			for(long i: pre) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
			HashMap<Long,Integer> map = new HashMap<>();
			for(int i=1;i<=N;i++) {
				if(map.get(pre[i])!=null) {
					int cnt = map.get(pre[i]);
					map.put(pre[i],cnt+1);
				}else {
					map.put(pre[i],1);
				}
			}
			
			for(int i=0;i<N;i++) {
				zom[i]=s.nextLong();
			}
//			HashMap<Long,Integer> map2 = new HashMap<>();
//			for(int i=1;i<=N;i++) {
//				if(map2.get(zom[i])!=null) {
//					int cnt = map2.get(zom[i]);
//					map2.put(zom[i],cnt+1);
//				}
//				else {
//					map2.put(zom[i],1);
//				}
//			}
//			System.out.println(map);
//			System.out.println(map2);
			int flag=0;
			Arrays.sort(zom);
//			System.out.println(Arrays.toString(zom));
			pre[0]=Integer.MAX_VALUE;
			pre[pre.length-1]=Integer.MAX_VALUE;
			Arrays.sort(pre);
			for(int i=0;i<N;i++) {
				if(pre[i]!=zom[i]) {
					flag=1;
					break;
				}else {
					continue;
				}
			}
//			Set<Long> set2 = map2.keySet();
//			for(Long k: set2) {
//				if(map.containsKey(k) && map.get(k)==map2.get(k)) {
//					continue;
//				}else {
//					flag=1;
//					break;
//				}
//			}
			if(flag==1) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
			
		}
	}
}
