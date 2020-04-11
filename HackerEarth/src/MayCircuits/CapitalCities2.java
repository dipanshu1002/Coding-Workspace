package MayCircuits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.*;


public class CapitalCities2 {
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
	
	static class Struct{
		Long num;
		int ind;
	}
	static class SortByNum implements Comparator<Struct>{
		public int compare(Struct a, Struct b) {
			return a.num.compareTo(b.num);
		}
	}
	
	public static void main(String[] args) {
    	FastReader s = new FastReader();
		int N = s.nextInt();
		long K = s.nextLong();
		//long[] arr = new long[N];
		Struct[] arr = new Struct[N];
		long[] sum = new long[N];

		HashMap<Long,Integer> map = new HashMap<Long,Integer>();
		for(int i=0;i<N;i++) {
			Struct p = new Struct();
			p.num=s.nextLong();
			p.ind = i+1;
			arr[i]=p;
		}
		Arrays.sort(arr, new SortByNum());
		sum[0]=arr[0].num;
//		for(int i=0;i<N;i++) {
//			System.out.println(arr[i].num+" "+arr[i].ind);
//		}
		for(int i=1;i<N;i++) {
			sum[i]=arr[i].num+sum[i-1];
		}
		long[] dist=new long[N];
		dist[0] = -(N-1)*arr[0].num+sum[N-1]-sum[0];
		for(int i=1;i<N;i++) {
			dist[i]= i*arr[i].num - (N-1-i)*arr[i].num - sum[i-1] + sum[N-1]-sum[i];
		}

		long index=N;
		
		long ans = Long.MAX_VALUE;;
		long[] arr2 = new long[N];
		for(int i =0;i<N;i++) {
			arr2[i]=dist[i]-K;
			if((dist[i]-K)<0) {
				arr2[i]=Math.abs(dist[i]-K)%2;
			}
		}
		long min = arr2[0];
		for(int i=0;i<N;i++) {
			if(arr2[i]<=min) {
				min=arr2[i];
			}
		}
		for(int i=0;i<N;i++) {
			if(arr2[i]==min) {
				int index2 = arr[i].ind;
				if(index2<index)index=index2;
			}
		}
		System.out.println(index+" "+min);

		
	}
}