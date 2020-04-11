import java.util.Scanner;

public class CLIPXL {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long T = s.nextLong();
		for(long t= 0; t<T; t++) {
			long X = s.nextLong();
			long Y = s.nextLong();
			if(X<=Y) {
				System.out.println(0);
			}
			else {
				System.out.println(X-Y);
			}
		}
	}
}
