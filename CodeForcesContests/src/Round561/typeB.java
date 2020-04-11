package Round561;

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
		int n= s.nextInt();
		int flag = 0;
	
		for(int d=1;d<n/2;d++) {
			
			if(n%d==0 && d>4 && n/d>4) {
				flag = 1;
				int r = d;
				int c = n/d;
				 char[][] str = new char[r][c];
		            String fin="";
		            for(int i=0;i<r;i++) {
		            	for(int j=0;j<c;j++) {
		            		if((j%5-i%5+5)%5==0){
		            			str[i][j]='a';
		            			fin+=str[i][j];
		            		}
		            		else if((j%5-i%5+5)%5==1){
		            			str[i][j]='e';
		            			fin+=str[i][j];
		            		}
		            		else if((j%5-i%5+5)%5==2){
		            			str[i][j]='i';
		            			fin+=str[i][j];
		            		}
		            		else if((j%5-i%5+5)%5==3){
		            			str[i][j]='o';
		            			fin+=str[i][j];
		            		}
		            		else if((j%5-i%5+5)%5==4){
		            			str[i][j]='u';
		            			fin+=str[i][j];
		            		}
		            	}
		            }
		           System.out.println(fin);
		           if(flag==1) {
		        	   break;
		           }
		            
		        }
		        }
		if(flag==0) {
			System.out.println(-1);
		        
			}
		}

}
