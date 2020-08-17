package Round652;
import java.util.*;
public class typeA {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			if(n%4==0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
