package JanLunch19;

import java.util.Scanner;


public class dis {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long T = s.nextLong();
		for(long t=0;t<T;t++) {
			int N=s.nextInt();
			double[]a=new double[N+1];
			double[]b=new double[N+1];
			for(int i=1;i<=N;i++) {
				a[i]=s.nextDouble();
			}
			for(int i=1;i<=N;i++) {
				b[i]=s.nextDouble();
			}
			int flag=0;
			if(a[N]==b[1]) {
			for(int i=2;i<=N-1;i++) {
				if(((a[i]+b[i])<a[N]) || (Math.abs(a[i]-b[i])>a[N])) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("Yes");
			}else if(flag==1) {
				System.out.println("No");
			}
			}
			else {
				System.out.println("No");
			}
			
			
	}
}
}
