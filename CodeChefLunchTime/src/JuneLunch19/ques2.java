package JuneLunch19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class ques2 {
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
	static int mergeSort(Integer arr[], int array_size) 
	{ 
	    Integer temp[] = new Integer[array_size]; 
	    return _mergeSort(arr, temp, 0, array_size - 1); 
	} 
	
	/* An auxiliary recursive method that sorts the input array and 
	  returns the number of inversions in the array. */
	static int _mergeSort(Integer arr[], Integer temp[], int left, int right) 
	{ 
	    int mid, inv_count = 0; 
	    if (right > left) { 
	        /* Divide the array into two parts and call _mergeSortAndCountInv() 
	       for each of the parts */
	        mid = (right + left) / 2; 
	
	        /* Inversion count will be the sum of inversions in left-part, right-part 
	      and number of inversions in merging */
	        inv_count = _mergeSort(arr, temp, left, mid); 
	        inv_count += _mergeSort(arr, temp, mid + 1, right); 
	
	        /*Merge the two parts*/
	        inv_count += merge(arr, temp, left, mid + 1, right); 
	    } 
	    return inv_count; 
	} 
	
	/* This method merges two sorted arrays and returns inversion count in 
	   the arrays.*/
	static int merge(Integer arr[], Integer temp[], int left, int mid, int right) 
	{ 
	    int i, j, k; 
	    int inv_count = 0; 
	
	    i = left; /* i is index for left subarray*/
	    j = mid; /* j is index for right subarray*/
	    k = left; /* k is index for resultant merged subarray*/
	    while ((i <= mid - 1) && (j <= right)) { 
	        if (arr[i] <= arr[j]) { 
	            temp[k++] = arr[i++]; 
	        } 
	        else { 
	            temp[k++] = arr[j++]; 
	
	            /*this is tricky -- see above explanation/diagram for merge()*/
	            inv_count = inv_count + (mid - i); 
	        } 
	    } 
	
	    /* Copy the remaining elements of left subarray 
	   (if there are any) to temp*/
	    while (i <= mid - 1) 
	        temp[k++] = arr[i++]; 
	
	    /* Copy the remaining elements of right subarray 
	   (if there are any) to temp*/
	    while (j <= right) 
	        temp[k++] = arr[j++]; 
	
	    /*Copy back the merged elements to original array*/
	    for (i = left; i <= right; i++) 
	        arr[i] = temp[i]; 
	
	    return inv_count; 
	} 

	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int N = s.nextInt();
			int D = s.nextInt();
			int[] arr = new int[N+1];
			for(int i=1;i<=N;i++) {
				arr[i]=s.nextInt();
			}
			if(D==1) {
				int sum=0;
				Integer[] arr1 =Arrays.stream(arr).boxed().toArray(Integer[]::new);
				sum=mergeSort(arr1,arr.length);
				System.out.println(sum);
				continue;
			}
			int[] arr2 = new int[D];
			int pos=0;
			int flag=0;
			TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
			ArrayList<Integer>[] arrList = new ArrayList[D];
			for(int i=0;i<D;i++) {
				arrList[i]=new ArrayList<Integer>();
			}
			for(int i=1;i<=N;i++) {
				map.put(arr[i],i);
				if((arr[i]-map.get(arr[i]))%D!=0){
					flag=1;
				}
			}
			if(flag==1) {
				System.out.println(-1);
				continue;
			}
		//	System.out.println(map);
			for(int i: map.keySet()) {
				arrList[i%D].add(map.get(i));
			}
		//	System.out.println(arrList[1]);
			int sum=0;
			for(int i=0;i<D;i++) {
				Integer[] arrNew = arrList[i].toArray(new Integer[arrList[i].size()]);
				sum+=mergeSort(arrNew,arrList[i].size());
				
			}
			System.out.println(sum);
		
			
			
		}

	}

}
