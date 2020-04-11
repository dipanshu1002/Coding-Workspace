package SemiFinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class ques2 {
	public static int max = 0;
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
	
	
	public static void subset(int[]arr,int left,int right,int sum,HashSet<Integer> set) {
//		System.out.println("("+left+","+right+","+sum+","+set+")");
		if(left>right) {
			if(sum>max) {
				max=sum;
				return;
			}
			return;
			
		}
	
	String[] str = Integer.toString(arr[left]).split("");
	int[] array = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
	Integer[] what = Arrays.stream( array ).boxed().toArray( Integer[]::new );
	Set<Integer> targetSet = new HashSet<Integer>(Arrays.asList(what));
	HashSet<Integer> cloned_set = new HashSet<Integer>();
	
	cloned_set.addAll(targetSet);
	targetSet.retainAll(set);
	int flag=0;
	if(targetSet.size()>=1) {
		flag=1;
	}
	if(flag==0) {
		HashSet<Integer> newSet = new HashSet<Integer>();
		newSet.addAll(set);
		newSet.addAll(cloned_set);
		
		subset(arr,left+1,right,sum+arr[left],newSet);
	}
	subset(arr,left+1,right,sum,set);
		
	}
	public static void main(String[] args) {
		
		FastReader s = new FastReader();
		long T = s.nextLong();
		for(long t=0;t<T;t++) {
			max=0;
			int N = s.nextInt();
			int[] arr = new int[N];
			for(int i=0;i<N;i++) {
				arr[i]=s.nextInt();
			}
			HashSet<Integer> set = new HashSet<Integer>();
			int sum = 0;
			subset(arr,0,N-1,0,set);
			System.out.println(max);
		}
	}	
}
