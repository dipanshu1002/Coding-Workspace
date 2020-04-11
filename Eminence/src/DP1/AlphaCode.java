package DP1;
import java.util.Scanner;
import java.util.ArrayList;

public class AlphaCode  {

	static int mod = 1000000007;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        while(!str.equals("0")){
            int[] arr = new int[str.length()];
            for(int i=0;i<str.length();i++){
                arr[i]=str.charAt(i)-48;
            }
            int[] output = new int[arr.length+1];
            output[0]=1;
            output[1]=1;
           for(int i=2;i<output.length;i++) {
        	   if(output[i-1]==0) {
        		   output[i]=0;
        		   continue;
        	   }
        	   if(arr[i-1]!=0) {
        		   output[i]=output[i-1];
        		   if(arr[i-2]!=0 && (arr[i-2]*10 + arr[i-1])<=26) {
        			   output[i]+=output[i-2]%mod;
        		   }
        	   }
        	   else if(arr[i-1]==0) {
        		   if(arr[i-2]>0 && arr[i-2]<3) {
        			   output[i]=output[i-2];
        		   }
        		   else {
        			   output[i]=0;
        		   }
        	   }
           }
           System.out.println(output[arr.length]);
           str=s.nextLine();
        }

	}
}
