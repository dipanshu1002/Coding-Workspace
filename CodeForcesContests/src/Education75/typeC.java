package Education75;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeC {
	public static void main(String[] args) {
	FastReader s = new FastReader();
	int T = s.nextInt();
	for(int t=0;t<T;t++) {
		String str = s.next();
		Queue<Character> qO = new LinkedList<>();
		Queue<Character> qE = new LinkedList<>();
		Queue<Character> qAns = new LinkedList<>();
		
		for(int i=0;i<str.length();i++) {
			if((int)(str.charAt(i)-'0')%2==0) {
				qE.add(str.charAt(i));
			}else {
				qO.add(str.charAt(i));
			}
		}
		while(!qO.isEmpty() && !qE.isEmpty()) {
			if(qO.peek()<qE.peek()) {
				qAns.add(qO.remove());
			}else {
				qAns.add(qE.remove());
			}
		}
		if(qO.isEmpty()) {
			while(!qE.isEmpty()) {
				qAns.add(qE.remove());
			}
		}
		if(qE.isEmpty()) {
			while(!qO.isEmpty()) {
				qAns.add(qO.remove());
			}
		}
		for(char c: qAns) {
			System.out.print(c);
		}
		System.out.println();
		
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
