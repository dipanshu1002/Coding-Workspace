package Jan19;

import java.util.Scanner;

public class ADAKNG {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int R = s.nextInt();
			int C = s.nextInt();
			int K = s.nextInt();
			int r1=0,c1=0,r2=0,c2 =0;
			if(R-K<1) {
				r1 = 1;
			}
			else {
				r1=R-K;
			}
			if(R+K>8) {
				r2=8;
			}
			else {
				r2=R+K;
			}
			if(C-K<1) {
				c1 = 1;
			}
			else {
				c1=C-K;
			}
			if(C+K>8) {
				c2=8;
			}
			else {
				c2=C+K;
			}
			System.out.println(((Math.abs(r2-r1)+1)*(Math.abs(c2-c1)+1)));
		}
	}
}
