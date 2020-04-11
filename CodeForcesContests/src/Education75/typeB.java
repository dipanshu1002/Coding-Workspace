package Education75;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeB {
	static class Pair{
		int x;
		int y;
	}
	public static void main(String[] args) {
	FastReader s = new FastReader();
	int T = s.nextInt();
	for(int t=0;t<T;t++) {
		int n = s.nextInt();
		int cnt0 = 0;
		int cnt1 = 0;
		int cntO=0;
		int min = 1000000;
		for(int i=0;i<n;i++) {
			String str = s.nextLine();
			if(str.length()<min) {
				min = str.length();
			}
			if(str.length()%2!=0) {
				cntO++;
			}
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)=='1') {
					cnt1++;
				}else {
					cnt0++;
				}
			}
		}
		if(cnt1%2==0 && cnt0%2==0) {
			System.out.println(n);
		}else if(cnt1%2!=0 && cnt0%2!=0) {
			if(cntO>=2) {
				System.out.println(n);
			}else if(min>1){
				System.out.println(n-1);
			}else {
				System.out.println(n-2);
			}
		}else {
			if(cntO>=1) {
				System.out.println(n);
			}else {
				System.out.println(n-1);
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
