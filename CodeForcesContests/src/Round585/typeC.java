package Round585;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class typeC {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		String str1 = s.nextLine();
		String str2 = s.nextLine();
	
	     ArrayList<Integer> v1 = new ArrayList<>();
	     ArrayList<Integer> v2 = new ArrayList<>();
	     for(int i=0;i<n;i++){
	     	if(str1.charAt(i)!=str2.charAt(i)){
	     		if(str1.charAt(i)=='a')
	     		   v1.add(i+1);	     		   
	     		   else
	     		     v2.add(i+1);
	     	}
	     }
	     
	     if((v1.size()%2)!=(v2.size()%2)){
	     	System.out.println(-1);
	     }
	     
	     else{
	     	long p = v1.size()%2;
	     	long count = 0;
	     	if(p==1)
	     	   count = 2;
	     	   
	     	 count +=( (v1.size()/2)  +  (v2.size()/2));
	     	 System.out.println(count);
	     	 
	     	if(p==0){
	     	for(int i=0;i<v1.size();i+=2)
	     		System.out.println(v1.get(i)+" "+v1.get(i+1));
	     	  
	     	 for(int i=0;i<v2.size();i+=2)
	     		 System.out.println(v2.get(i)+" "+v2.get(i+1));
	     	  
	     	}
	     	
	     	else{
	     	   int n1= v1.size();
	     	   int n2 = v2.size();
	     	   System.out.println(v1.get(n1-1)+" "+v1.get(n1-1));
	     	   System.out.println(v1.get(n1-1)+" "+v2.get(n2-1));
	     		for(int i=0;i<v1.size()-1;i+=2)
	     			System.out.println(v1.get(i)+" "+v1.get(i+1));
	    
	     	  
	     	 for(int i=0;i<v2.size()-1;i+=2)
	     		 System.out.println(v2.get(i)+" "+v2.get(i+1));
	     	}
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
