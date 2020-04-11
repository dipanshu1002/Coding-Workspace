package BinarySearch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class binarySearch {
	
	//NORMAL BS ( Any occurrence )
	static int BS(int[] arr, int key) {
		int s = 0;
		int e = arr.length - 1;
		int ans = -1;
		while(s<=e) {
			int m = (s+e)/2;
			if(arr[m]==key) ans = m ;
			else if(arr[m]>key) e=m-1;
			else s=m+1;
		}
		return ans;
	}
	
	// BS (First Occurence)  //return index if found //else return -1
	static int BSFO(int[] arr, int key) {
		int s = 0;
		int e = arr.length - 1;
		int ans = -1;
		while(s<=e) {
			int m = (s+e)/2;
			if(arr[m]==key) {
				ans = m;
				e=m-1;
			}
			else if(arr[m]>key) e=m-1;
			else s=m+1;
		}
		return ans;
	}
	
	//BS (Last Occurence)
	static int BSLO(int[] arr, int key) {
		int s = 0;
		int e = arr.length - 1;
		int ans = -1;
		while(s<=e) {
			int m = (s+e)/2;
			if(arr[m]==key) {
				ans = m;
				s=m+1;
			}
			else if(arr[m]>key) e=m-1;
			else s=m+1;
		}
		return ans;
	}
	
	//BS Lower Bound (First index of element >= key)
	static int BSLB(int[] arr, int key) {
		int s = 0;
		int e = arr.length - 1;
		int ans = -1;
		while(s<=e) {
			int m = (s+e)/2;
			if(arr[m]>=key) {
				ans = m;
				e=m-1;
			}
			else s=m+1;
		}
		return ans;
	}
	
	//BS Upper Bound ( Last index of element <= key)
	static int BSUB(int[] arr, int key) {
		int s = 0;
		int e = arr.length - 1;
		int ans = -1;
		while(s<=e) {
			int m = (s+e)/2;
			if(arr[m]>=key) {
				ans = m;
				e=m-1;
			}
			else s=m+1;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		FastReader s = new FastReader();
		HashSet<Integer> set = new HashSet<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(2,3);
		map.put(1,4);
		System.out.println(map);
		set.add(1);
		set.add(3);
		set.add(5);
		set.add(2);
		set.add(4);
		set.add(10);
		set.add(6);
		System.out.println(set);
		
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
