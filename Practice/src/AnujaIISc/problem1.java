package AnujaIISc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class problem1 {
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
	static void generate(Set<String> st, String s) 
    { 
        if (s.length() == 0) { 
            return; 
        } 
  
        // If current string is not already present. 
        if (!st.contains(s)) { 
            st.add(s); 
  
            // Traverse current string, one by one 
            // remove every character and recur. 
            for (int i = 0; i < s.length(); i++) { 
                String t = s; 
                t = t.substring(0, i) + t.substring(i + 1); 
                generate(st, t); 
            } 
        } 
        return; 
    } 
	public static int Count(String str) {
		int n = str.length();
		HashSet<Character> set = new HashSet<>();
		for(int i=0;i<n;i++) {
			set.add(str.charAt(i));
		}
		return set.size();
	}
	public static long countSubstring(String str) {
		TreeSet<String> setSub = new TreeSet<>();
		int n = str.length();
	    for (int i = 0; i < n; i++)  
	        for (int len = 1; len <= n - i; len++)  
	        { 
	   
//	            arrList.add(index++,str.substring(i, i+len));
	        	//arr[index++] = str.substring(i, i+len);
	            setSub.add(str.substring(i, i+len));
	        } 
		return setSub.size();
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
//		int L = s.nextInt();
//		int Q = s.nextInt();
		String str = s.nextLine();
		int n = str.length(); 
		
		long abc = countSubstring(str);
		 System.out.println(abc);
		ArrayList<String> arrList = new ArrayList<>();
		TreeSet<String> setSub = new TreeSet<>();

	    int index = 0; 
	    for (int i = 0; i < n; i++)  
	        for (int len = 1; len <= n - i; len++)  
	        { 
	   
//	            arrList.add(index++,str.substring(i, i+len));
	        	//arr[index++] = str.substring(i, i+len);
	            setSub.add(str.substring(i, i+len));
	        } 
	    System.out.println(setSub.size());
	
//	    ArrayList<Integer> countList = new ArrayList<>();
//	    
//	    int index2 = 0;
//	   // System.out.println(setSub);
//	    Iterator<String> it = setSub.iterator();
//	    while(it.hasNext()) {
//	    	String a = it.next();
//	    	//System.out.println(index+" "+a);
//	    	countList.add(index2,Count(a));
//	    	index2++;
//	    }
//	    
//	    for(int i=0;i<sub_count;i++) {
//	    	int c = Count(arrList.get(i));
//	    	countList.add(i,c);
//	    //	count[i]=c;
//	    }
//	    for(String st: arrList) {
//			setSub.add(st);
//		}
		
	//	System.out.println(countList);
//	    System.out.println(arrList.size());
//	    for(int i=0;i<Q;i++) {
//	    	long q = s.nextLong();
//	   // 	int length = count.length;
//	    	if(q>setSub.size()) {
//	    		System.out.println(-1);
//	    	}
//	    	else if(q<=setSub.size()) {
//	    		System.out.println(countList.get((int)q-1));
//	    	}else {
//	    		System.out.println(-1);
//	    	}
//	    	
//	    }
		
	}
}
