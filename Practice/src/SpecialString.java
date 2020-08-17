import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class SpecialString {
	
		
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int p = s.nextInt();
		String str = s.nextLine();
		char[] arr = str.toCharArray();
		boolean ans = false;
		char e= (char)(p-1+'a');
		int i = n-1;
		if(n==1) {
			if(arr[0]!=e)
			System.out.println((char)(arr[0]+1));
			else
				System.out.println("NO");
			return;
		}
		while(i>=2) {
			while(arr[i]<e) {
				arr[i]=(char)(int)(arr[i]+1);
				if(arr[i-1]!=arr[i] && arr[i-2]!=arr[i]) {
					ans = true;
					break;
				}
			}
			if(ans)
				break;
			i--;
		}
		if(i==0) {
			for(int j=0;j<=e-'a';j++) {
				if(arr[i]!=(char)(j+'a')) {
					arr[i+1]=(char)(j+'a');
					break;
				}
			}
		}
		if(i==1) {
			while(arr[i]<e) {
				arr[i]=(char)(int)(arr[i]+1);
				if(arr[i-1]!=arr[i]) {
					ans = true;
					break;
				}
			}
			if(!ans && arr[0]!=e) {
				arr[0]=(char)(int)(arr[0]+1);
				arr[1]='a';
			}else if(!ans && arr[0]==e) {
				System.out.println("NO");
				return;
			}
			
				
		}
		if((i+1)<arr.length) {
			for(int j=0;j<=e-'a';j++) {
				if(arr[i-1]!=(char)(j+'a') && arr[i]!=(char)(j+'a')) {
					arr[i+1]=(char)(j+'a');
					break;
				}
			}
		}
		if((i+2)<arr.length) {
			for(int j=0;j<=e-'a';j++) {
				if(arr[i]!=(char)(j+'a') && arr[i+1]!=(char)(j+'a')) {
					arr[i+2]=(char)(j+'a');
					break;
				}
			}
		}
		if((i+3)<arr.length) {
			for(int j=0;j<=e-'a';j++) {
				if(arr[i+1]!=(char)(j+'a') && arr[i+2]!=(char)(j+'a')) {
					arr[i+3]=(char)(j+'a');
					break;
				}
			}
		}
		int j = i+4;
		while(j<arr.length) {
			arr[j]=arr[j-3];
			j++;
		}
		
		for(char c:arr)
			System.out.print(c);
		 System.out.println();
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
