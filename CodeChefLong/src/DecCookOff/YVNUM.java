package DecCookOff;

import java.util.Scanner;

public class YVNUM {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int P=s.nextInt();
		int l= (int)Math.log10(P)+1;
		
		for(int i=0;i<l-1;i++) {
			int N=P;
			double K = Math.log10(N);
			K=K-Math.floor(K);
			int X=(int)Math.pow(10, K);
			int M= N - X*(int)Math.pow(10,l-1);
			int S= M*(int)Math.pow(10, l-2)+X;
			int T=N*(int)Math.pow(10, l) + S;
			P=S;
			System.out.println(T);
		}
	}
	
}
