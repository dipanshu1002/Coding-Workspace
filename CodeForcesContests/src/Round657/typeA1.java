package Round657;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeA1 {
	static boolean check(String s, String t){
//		String temp = s;
		StringBuilder temp = new StringBuilder(s);
		for(int i=0;i<s.length();i++){
			if(temp.charAt(i)=='?')
			   temp.replace(i,i+1,"z");
		}
		long res = 0;
		for (int i = 0; i <= s.length()-7; i++){  
	        int j; 
	        for (j = 0; j < 7; j++) 
	            if (temp.charAt(i+j) != t.charAt(j)) 
	                break; 
	        if (j == 7)   
	        { 
	           res++; 
	           j = 0; 
	        } 
	    } 
	    if(res==1)
	     return true;
	     
	     
	     return false;
		
		
		
	}

	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		while(T-- > 0) {
			
			int N = s.nextInt();
			char[] str = s.next().toCharArray();
				  
				    char[] se = {'a','b','a','c','a','b','a'};
				     boolean fans = false;
				  StringBuilder ans1=new StringBuilder();
				     for(int i=0;i<N;i++){
				     	if(str[i]=='a' || str[i]=='?'){
				     		if(i+6<N){
				     			String temp = str;
				     			boolean ans= true;
				     			for(int j=0;j<7;j++){
				     				if(temp[i+j]=='?')
				     				   temp[i+j] = se[j];
				     				   
				     				   
				     				 if(temp[i+j]!=se[j]){
				     				 	ans= false;
				     				 	break;
				     				 }
				     			}
				     			
				     			
				     			if(ans){
				     				if(check(temp,se)){
				     					fans = true;
				     					ans1.append(temp);
				     					break;
				     				}
				     			}
				     		}
				     	}
				     }
				     
				     
				     if(fans){
				     	System.out.println("Yes");
				     	for(int i=0;i<N;i++){
				     		if(ans1.charAt(i)=='?')
				     		  System.out.print('z');
				     		   
				     		   
				     		   else
				     		     System.out.print(ans1.charAt(i));
				     	}
				     System.out.println();
				     }
				     
				     else
				        System.out.println("No");
				    
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
