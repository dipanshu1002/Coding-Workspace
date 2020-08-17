package Round662;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeB {
	static class Pair{
		int num;
		int cnt;
		Pair(int num){
			this.num = num;
			cnt = 1;
		}
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
		HashSet<Integer> set8 = new HashSet<Integer>();
		HashSet<Integer> set6 = new HashSet<Integer>();
		HashSet<Integer> set4 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		int[] freq = new int[100001];
		
		for(int i=0;i<n;i++) {
			int a = s.nextInt();
			freq[a]++;
			if(freq[a]>=8) {
				set8.add(a);
				set6.remove(a);
			}
			else if(freq[a]>=6) {
				set6.add(a);
				set4.remove(a);
			}
			else if(freq[a]>=4) {
				set4.add(a);
				set2.remove(a);
			}
			else if(freq[a]>=2) {
				set2.add(a);
			}
			
			
			
		}
		int m = s.nextInt();
		for(int i=0;i<m;i++) {
			char[] str = s.next().toCharArray();
			int o  = s.nextInt();
			if(str[0]=='+') {
				freq[o]++;
				if(freq[o]>=8) {
					set8.add(o);
					if(set6.contains(o))set6.remove(o);
				}
				else if(freq[o]>=6) {
					set6.add(o);
					if(set4.contains(o))set4.remove(o);
				}
				else if(freq[o]>=4) {
					set4.add(o);
					if(set2.contains(o))set2.remove(o);
				}
				else if(freq[o]>=2) {
					set2.add(o);
				}
				
			if(set8.size()>=1) {
				System.out.println("YES");
			}else if(set6.size()>1) {
				System.out.println("YES");
			}else if((set6.size()==1 && set4.size()>=1) || (set6.size()==1 && set2.size()>=1)) {
				System.out.println("YES");
			}else if(set4.size()>1) {
				System.out.println("YES");
			}else if((set4.size()==1 && set2.size()>=2)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
			
		}else {
			freq[o]--;
			if(freq[o]<2) {
				if(set2.contains(o))set2.remove(o);
			}else if(freq[o]<4) {
				if(set4.contains(o))set4.remove(o);
				set2.add(o);
			}else if(freq[o]<6) {
				if(set6.contains(o))set6.remove(o);
				set4.add(o);
			}
			else if(freq[o]<8) {
				if(set8.contains(o))set8.remove(o);
				set6.add(o);
			}
			
			if(set8.size()>=1) {
				System.out.println("YES");
			}else if(set6.size()>1) {
				System.out.println("YES");
			}else if((set6.size()==1 && set4.size()>=1) || (set6.size()==1 && set2.size()>=1)) {
				System.out.println("YES");
			}else if(set4.size()>1) {
				System.out.println("YES");
			}else if((set4.size()==1 && set2.size()>=2)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
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
