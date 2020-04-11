package Round596;
import java.util.*;
public class typeA {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		if((b-a)==1) {
			String str = a+"9";
//			System.out.println(str);
			int c = Integer.valueOf(str);
			System.out.println(c+" "+(c+1));
		}else if(b==a) {
			String str = a+"1";
			int c = Integer.valueOf(str);
			System.out.println(c+" "+(c+1));
		}else if(a==9 && b==1){
			System.out.println(99+" "+100);
		}else {
		
			System.out.println(-1);
		}
	}
}

