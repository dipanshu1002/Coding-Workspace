package Education67;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class typeB {
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
		int n = s.nextInt();
		String str = s.nextLine();
		int m = s.nextInt();
		String[] arr = new String[m];
		int[][] arr2 = new int[n+1][26];
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=1;i<=str.length();i++) {
			for(int j=0;j<26;j++) {
				arr2[i][j]=arr2[i-1][j];
			}
			arr2[i][(int)str.charAt(i-1)-97]=arr2[i-1][(int)str.charAt(i-1)-97]+1;
			
		}
		for(int i=0;i<m;i++) {
			String str2=s.nextLine();
			//System.out.println(str2);
			int[] arr3 = new int[26];
			for(int j=0;j<str2.length();j++) {
				arr3[(int)str2.charAt(j)-97]+=1;
			}
//			for(int f=0;f<26;f++) {
//				System.out.print(arr3[f]+" ");
//			}
//			System.out.println();
			
			for(int k = str2.length();k<n+1;k++) {
				int flag=0;
				for(int l=0;l<26;l++) {
					//System.out.print(arr2[k][l]+" ");
					if(arr2[k][l]>=arr3[l]) {
						continue;
					}
					else {
						flag=1;
						break;
					}
					
				}
			//	System.out.println();
//				System.out.println(flag);
				if(flag==1) {
					continue;
				}
				if(flag==0) {
					System.out.println(k);
					break;
				}
			}
			
			
		}
		
	}
	
}
