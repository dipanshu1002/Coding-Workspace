package Code_Melange;

import java.util.*;
public class MAX2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		String X = s.next();
		long A = Long.parseLong(X,2);
		long power = 0;
		while(A%2==0 && A>0) {
			A=A/2;
			power++;
		}
		System.out.println(power);
		
	}
}
