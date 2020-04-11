package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeC {
	static class Segment{
		int L;
		int R;
		int V;
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int N = s.nextInt();
			ArrayList<Segment> arr = new ArrayList<Segment>();
			
			for(int i=0;i<N;i++) {
				Segment st = new Segment();
				st.L  =s.nextInt();
				st.R  =s.nextInt();
				st.V  =s.nextInt();
				arr.add(st);
			}
			Collections.sort(arr, new Comparator<Segment>() {

				@Override
				public int compare(Segment seg1, Segment seg2) {
					if(seg1.V==seg2.V) {
						if(seg1.L==seg2.L) {
							return seg1.R-seg2.R;
						}
						return seg1.L-seg2.L;
					}
					return seg1.V - seg2.V;
				}
				
			});
			int flag = 0;
			
			//Segment s1 = arr.get(0);
			int cnt = 0;
			int i = 1;
			while(arr.size()>=3) {
				Segment s1 = arr.get(0);
				Segment s2 = arr.get(1);
				Segment s3 = arr.get(2);
				if(s1.V!=s2.V) {
					arr.remove(0);
					continue;
				}
				else {
					
					if(s1.R >= s2.L) {
						if( s2.V==s3.V) {
							if(s1.R>=s3.L) {
								if(s2.R >= s3.L) {
									flag = 1;
									break;
								}
								else {
									arr.remove(1);
									continue;
								}
							}
							else {
								arr.remove(0);
								continue;
							}
						}
						else {
							arr.remove(0);
							arr.remove(1);
							continue;
							}
					}
					else {
						arr.remove(0);
						continue;
					}
				}
			}
			
			if(flag==1) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
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
