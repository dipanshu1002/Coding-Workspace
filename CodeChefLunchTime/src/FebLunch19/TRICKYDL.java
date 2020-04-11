package FebLunch19;

import java.util.Scanner;

public class TRICKYDL {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long T = s.nextLong();
		for(long t=0;t<T;t++) {
			long A = s.nextLong();
			long MaxProfit = 0;
			int D = 1;
			int D2 = 1;
			while((A*D - Math.pow(2, D)+1)>0) {
				
				long profit = (long)(A*D - Math.pow(2, D)+1);
				if(profit>MaxProfit) {
					MaxProfit = profit;
					D2 = D;
				}
				D++;
			}
			System.out.println((D-1)+" "+D2);
		}
	}
}
