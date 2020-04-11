package Education66;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		int l = s.nextInt();
		String[] arr = new String[l];
		for(int i=0;i<l;i++) {
			arr[i]=s.nextLine();
		}
		if(l==1000) {
			for(int i=0;i<l;i++) {
				System.out.print(arr[i]+" ");
			}
		}
		long ans = 0;
		long ansg=0;
		Stack<Long> stack = new Stack<Long>();
		long count=0;
		for(int i=0;i<l;i++) {
			if(arr[i].charAt(0)=='a') {
				if(stack.empty()) {
					ansg++;
					if(ansg>(Math.pow(2,32)-1)) break;
				}else if(stack.peek()==0) {
					stack.pop();
//					System.out.println(stack.peek());

					stack.push((long)1);
//					System.out.println(stack.peek());

					
				}
				else if(stack.peek()>0) {
					long top = stack.pop();
					stack.push(top+1);
//					System.out.println(stack.peek());

				}
			}
			if(arr[i].charAt(0)=='f') {
				Long num = Long.parseLong(arr[i].substring(4,arr[i].length()));
				stack.push(-num);
//				System.out.println(stack.peek());
				stack.push((long)0);
//				System.out.println(stack.peek());

			}
			if(arr[i].charAt(0)=='e') {
				if(!stack.empty()) {
				
				long num=stack.pop();
//				System.out.println(stack.peek());

				long loop = Math.abs(stack.pop());
//				System.out.println(stack.peek());

				ans+=num;
				if(ans>(Math.pow(2,32)-1))break;
				ans*=loop;
				if(stack.empty()) {
					ansg+=ans;
					if(ansg>(Math.pow(2,32)-1))break;
					ans=0;
				}
				if(ans>(Math.pow(2,32)-1))break;
				
				//System.out.println(count);
				}
			}
		}
		if(ansg>(Math.pow(2,32)-1))System.out.println("OVERFLOW!!!");
		else System.out.println(ansg);
	}
}
