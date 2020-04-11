package Round568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;


public class typeB {
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
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		for(int i=0;i<n;i++) {
			String str1 = s.nextLine();
			String str2 = s.nextLine();
			if(i==7) {
				
			}
			ArrayList<Character> ar1 = new ArrayList<>();
			ArrayList<Integer> arr1  = new ArrayList<Integer>();
			String str3="";
			ar1.add(str1.charAt(0));
			int count=1;
			for(int j=1;j<str1.length();j++) {
				if(str1.charAt(j)==str1.charAt(j-1)) {
					count++;
				}
				else {
					arr1.add(count);
					count=1;
					ar1.add(str1.charAt(j));
				}
			}
			arr1.add(count);
			ArrayList<Character> ar2 = new ArrayList<>();
			ArrayList<Integer> arr2  = new ArrayList<Integer>();
			String str4="";
			ar2.add(str2.charAt(0));
			int count2=1;
			for(int j=1;j<str2.length();j++) {
				if(str2.charAt(j)==str2.charAt(j-1)) {
					count2++;
				}
				else {
					arr2.add(count2);
					count2=1;
					ar2.add(str2.charAt(j));
				}
			}
			arr2.add(count2);
			int flag=0;
//			System.out.println(str4);
//			System.out.println(arr2);
			if(ar1.size()!=ar2.size()) {
				System.out.println("NO");
				continue;
			}
			for(int j=0;j<ar1.size();j++) {
				if(ar1.get(j)!=ar2.get(j) || arr2.get(j)<arr1.get(j)) {
					flag=1;
					break;
				}
			}
			if(flag==1) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
		
				
			}
		}
	}
}
