package Jan19;
import java.util.Scanner;
public class ADASCOOL {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
		int N = s.nextInt();
		int M = s.nextInt();
		if(N*M%2==0) {
			System.out.println("YES");
		}
		if(N*M%2==1) {
			System.out.println("NO");
		}
		}
	}
}
