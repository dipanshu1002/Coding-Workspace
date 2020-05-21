package Codeforces;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class Skier {
	static class Pair{
		int x;
		int y;
		int x2;
		int y2;
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + x;
			result = prime * result + y;
			result = prime * result + x2;
			result = prime * result + y2;
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
			Pair other = (Pair) obj;
			if (this.x != other.x)
				return false;
			if (this.y != other.y)
				return false;
			if (this.x2 != other.x2)
				return false;
			if (this.y2 != other.y2)
				return false;
			return true;
		}
	}
	public static Pair reverse(Pair p) {
		Pair p2 = new Pair();
		p2.x = p.x2;
		p2.y = p.y2;
		p2.x2 = p.x;
		p2.y2 = p.y;
		return p2;
	}

	public static void main(String[] args) {
		FastReader s = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			HashSet<Pair> set = new HashSet<>();
			int x = 0;
			int y = 0;
			long cost = 0;
			char[] str = s.nextLine().toCharArray();
			for(int i=0;i<str.length;i++) {
				Pair p1 = new Pair();
				switch(str[i]) {
				case 'N':
					p1.x = x;
					p1.y = y;
					p1.x2 = x;
					p1.y2 = ++y;
					if(set.contains(p1))cost+=1;
					else {
						set.add(p1);
						set.add(reverse(p1));
						cost+=5;
					}
					break;
				case 'S':
					p1.x = x;
					p1.y = y;
					p1.x2 = x;
					p1.y2 = --y;
					if(set.contains(p1))cost+=1;
					else {
						set.add(p1);
						set.add(reverse(p1));
						cost+=5;
					}
					
					break;
				case 'E':
					p1.x = x;
					p1.y = y;
					p1.x2 = ++x;
					p1.y2 =y;
					if(set.contains(p1))cost+=1;
					else {
						set.add(p1);
						set.add(reverse(p1));
						cost+=5;
					}
					break;
				case 'W':
					p1.x = x;
					p1.y = y;
					p1.x2 = --x;
					p1.y2 = y;
					if(set.contains(p1))cost+=1;
					else {
						set.add(p1);
						set.add(reverse(p1));
						cost+=5;
					}
					break;
				}
			}
			System.out.println(cost);
		}
		out.flush();
		
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
