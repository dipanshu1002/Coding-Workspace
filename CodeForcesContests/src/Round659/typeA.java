package Round659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeA {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		while(T-- >0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
				arr[i]=s.nextInt();
			int[] temp = arr.clone();
			Arrays.sort(temp);
			int max = temp[n-1];
			if(max==0) {
				int k = 0;
				for(int i=0;i<=n;i++) {
					System.out.println((char)('a'+(k%26)));
					k++;
				}
				continue;
					
					
			}
			int k  = 0;
			int prevNum = -1;
			int curNum = -1;
			char[][] str = new char[n+1][max];
			for(int i=0;i<max;i++) {
				str[0][i]='a';
			}
			for(int i=1;i<=n;i++) {
				curNum = arr[i-1];
				for(int j=0;j<curNum;j++) {
					str[i][j]=str[i-1][j];
				}
				for(int j=curNum;j<max;j++)
						if(((int)(str[i-1][j])+1)>122)
							str[i][j]='a';
						else
							str[i][j]=(char)(str[i-1][j]+1);
							
						
			}
			for(int i=0;i<=n;i++) {
				for(int j=0;j<max;j++) {
					System.out.print(str[i][j]);
				}
				System.out.println();
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
