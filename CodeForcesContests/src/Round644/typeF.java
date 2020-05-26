package Round644;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeF {

public static boolean check2(char[] ans, Character[][] str, int n, int m) {
	int count = 0;
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			if(ans[j]!=str[i][j]) {
				count++;
				if(count>1) {
					return false;
				}
			}
		}
		count = 0;
	}
	
	return true;
}
public static void main(String[] args) {
	FastReader s = new FastReader();
	int T = s.nextInt();
	for(int t=0;t<T;t++) {
		int n = s.nextInt();
		int m = s.nextInt();
		Character[][] str = new Character[n][m];
		char[] ans = new char[m];
		for(int i=0;i<n;i++) {
			String st = s.next();
			for(int j=0;j<m;j++) {
				str[i][j]=st.charAt(j);
			}
		}
		
		for(int i=0;i<m;i++) {
			ans[i]=str[0][i];
		}
		boolean flag = false;
		for(int j=0;j<m;j++) {
			boolean check = false;
			for(int k=0;k<26;k++) {
				ans[j]=(char)(k+97);
				check = check2(ans,str,n,m);
				if(check==true) {
					flag = true;
					break;
				}
			}
			if(check==true) {
				break;
			}
			ans[j]=str[0][j];
		}
		if(flag==false) {
			System.out.println(-1);
		}else {
			for(char c: ans) System.out.print(c);
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
