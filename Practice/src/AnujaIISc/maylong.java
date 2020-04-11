package AnujaIISc;

import java.util.Scanner;

public class maylong {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			int a = s.nextInt();
			System.out.println((int)Math.floor((a+3)/2));
		}
	}
}
