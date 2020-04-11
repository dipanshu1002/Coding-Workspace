package DP2;
import java.util.*;
public class LCS {
	
	public static int maxLCS(String str1, String str2) {
		if(str1.length()==0||str2.length()==0) {
			return 0;
		}
		if(str1.charAt(0)==str2.charAt(0)) {
			return (1 + maxLCS(str1.substring(1),str2.substring(1)));
		}
		else {
			int ans1= maxLCS(str1.substring(1),str2);
			int ans2 = maxLCS(str1,str2.substring(1));
			int ans3=maxLCS(str1.substring(1),str2.substring(1));
			return Math.max(ans1,Math.max(ans2,ans3));
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		String str2 = s.next();
		int ans = maxLCS(str1,str2);
		System.out.println(ans);
		
	}
}
