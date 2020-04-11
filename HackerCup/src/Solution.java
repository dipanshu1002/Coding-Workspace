
import java.io.*;
import java.util.*;

public class Solution {
   
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner s = new Scanner(System.in);
        long t = Long.parseLong(br.readLine());
        for(int i_t = 1;i_t<=t;i_t++){
            String ans = "N";
        	char arr[] = br.readLine().toCharArray();
        	int n = arr.length;
        	int count = 0;
        	
        	for(int i = 0;i<n;i++)
        	if(arr[i]=='B') count++;
        	
        	if(count<n/2){ 
        		ans = "N";
        	}
        	else{
        	    if(arr[n-1]=='.')
        	    ans = "Y";
        	    else{
        	        for(int i = 1;i<n;i++){
        	            if(arr[i]=='.')
        	            {
        	                ans = "Y";
        	                break;
        	            }
        	            
        	        }
        	        
        	        
        	    }
        	}
            System.out.println("Case #"+i_t+": "+ans);
        }
    }
}

            
            
            
            
            
        
    
            
        
         
        
         
         
            
        
        
        
       
    
    