package Round505;
import java.util.*;
public class typeB {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long k = s.nextLong();
		if(2*n-1<k) {
			System.out.println(0);
		}else if(k<3){
			System.out.println(0);
		}else if(k>n){
			System.out.println(((n-(k-n))-1)/2 + 1);
		}else if(k<=n) {
			System.out.println((k-3)/2 + 1);
		}
		
	}
}
