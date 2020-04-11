package December18;

import java.util.Scanner;

public class maxep {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N=s.nextInt();
		int c=s.nextInt();
		int C=1000;
		int l=1;
		int r=N;
		int mid=(l+r)/2 + (l+r)/4;
		
		
		while(l<r && C>0) {
			System.out.println(1+" "+mid);
			System.out.flush();
			C-=1;
			int a=s.nextInt();
			if(a==0) {
				l=mid+1;
				mid=l + (r-l)/7;
			}
			else if(a==1) {
				
				C-=c;
				System.out.println(2);
				System.out.flush();
				r=mid ;
				mid=l+ (r-l)/c;
			}
			
			
			
		}
		if(C>0||l==r) {
		System.out.println(3+" "+l);
		System.out.flush();
		}
		else {
			System.out.println("-1");
			System.out.flush();
		}
		s.close();
		System.out.close();
	}
}
