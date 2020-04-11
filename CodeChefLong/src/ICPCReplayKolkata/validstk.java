package ICPCReplayKolkata;

import java.util.Scanner;

public class validstk {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T=s.nextInt();
		for(int t=0;t<T;t++) {
			int N=s.nextInt();
			int count=0;
			int flag=0;
			for(int i=0;i<N;i++) {
				int a=s.nextInt();
				if(a==1) {
					count++;
				}
				else if(a==0 && count==0) {
					flag=1;
				}
				else if(a==0) {
					count--;
				}
			}
			if(flag==0) {
				System.out.println("Valid");
			}
			else if(flag==1) {
				System.out.println("Invalid");
			}
		}
	}
}
