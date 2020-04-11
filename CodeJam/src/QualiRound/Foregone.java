package QualiRound;
import java.util.*;

public class Foregone {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int t=1;t<=T;t++) {
			int N = s.nextInt();
			for(Integer i=1;i<N;i++) {
				Integer B = N-i;
				String str1 = i.toString();
				String str2 = B.toString();
				int flagA=0;
				int flagB=0;
				for(int j=0;j<str1.length();j++) {
					if(str1.charAt(j)=='4') {
						flagA=1;
						continue;
					}
				}
				for(int j=0;j<str2.length();j++) {
					if(str2.charAt(j)=='4') {
						flagB=1;
						continue;
					}
				}
				if(flagA==0 && flagB==0) {
					System.out.println("Case #"+t+": "+Integer.parseInt(str1)+" "+Integer.parseInt(str2));
					break;
				}
			}
		}
	}
}
