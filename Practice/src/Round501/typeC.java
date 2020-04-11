package Round501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeC {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		char[] str = s.nextLine().toCharArray();
		char[] str2 = s.nextLine().toCharArray();
		int[] freq =  new int[26];
		int[] freq2 = new int[26];
		for(int i=0;i<n;i++) {
			freq[str[i]-'a']++;
			freq2[str2[i]-'a']++;
		}
		for(int i=0;i<n;i++) {
			if(freq[i]!=freq2[i]) {
				System.out.println(-1);
				return;
			}
		
		}
		//System.out.println(str);
		ArrayList<Integer> list = new ArrayList<>();
		int cnt = 0;
		for(int i=0;i<n;i++) {
			if(str[i]==str2[i]) {
				continue;
			}
			else {
				int j = i+1;
				while(j<n && str[j]!=str2[i]) {
					j++;
				}
				if(j==n) {
					System.out.println(-1);
				}
			//	int k = j;
				for(int k=j;k>i;k--) {
					char t = str[k];
					str[k]=str[k-1];
					str[k-1]=t;
					list.add(k);
					cnt++;
				}
			}
		}
//		System.out.println(str);
		System.out.println(cnt);
		for(int i: list) {
			System.out.print(i+" ");
		}
//		System.out.println(list);
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
