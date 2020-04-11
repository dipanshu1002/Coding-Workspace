package Round590;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeC {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int q = s.nextInt();
		for(int t=0;t<q;t++) {
			int n = s.nextInt();
			char[] arr1 = s.nextLine().toCharArray();
			char[] arr2 = s.nextLine().toCharArray();
			for(int i=0;i<n;i++)
				if(arr1[i]=='1'||arr1[i]=='2') arr1[i]='1';
				else arr1[i]='2';
			
			for(int i=0;i<n;i++)
				if(arr2[i]=='1'||arr2[i]=='2') arr2[i]='1';
				else arr2[i]='2';

			int xor = 0;
			int i = 0;
			while(i<n) {
				if(arr1[i]=='1' && xor==0) {
					i++;
					continue;
				}else if(arr1[i]=='2' && arr2[i]=='2' && xor==0) {
					i++;
					xor=1;
					continue;
				}else if(arr1[i]=='2' && arr2[i]!='2' && xor==0) {
					break;
				}
				if(arr2[i]=='2' && arr1[i]=='2' && xor==1) {
					i++;
					xor=0;
					continue;
				}else if(arr2[i]=='1' && xor==1) {
					i++;
					continue;
				}else if(arr2[i]=='2' && arr1[i]!='2' && xor==1) {
					break;
				}
			}
			if(i==n && xor==1) System.out.println("YES");
			else System.out.println("NO");
			
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
