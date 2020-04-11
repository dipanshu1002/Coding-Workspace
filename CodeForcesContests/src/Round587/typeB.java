package Round587;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeB {
	static class Pair{
		int data;
		int x;
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		Pair[] arr = new Pair[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=new Pair();
			arr[i].data=s.nextInt();
			arr[i].x=i;
		}
		
		Arrays.sort(arr,new Comparator<Pair>() {

			@Override
			public int compare(Pair arg0, Pair arg1) {
				
				return arg1.data-arg0.data;
			}
			
		});
		int[] seq = new int[n];
		long shots = 0;
		for(int i=0;i<n;i++) {
			shots+=(arr[i].data*(i)+1);
			seq[i]=(arr[i].x+1);
		}
		System.out.println(shots);
		for(int i=0;i<n;i++) {
			System.out.print(seq[i]+" ");
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
