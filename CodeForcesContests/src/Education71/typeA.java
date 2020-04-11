package Education71;
import java.util.*;
public class typeA {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int b = s.nextInt();
			int p = s.nextInt();
			int f = s.nextInt();
			int h = s.nextInt();
			int c = s.nextInt();
			int tot = b/2;
			long ans = 0;
			if(h>=c) {
				if(p>=tot) {
					System.out.println(h*tot);
					continue;
				}else {
					if(f>=(tot-p)) {
					ans+=(p*h+ c*(tot-p));
					}else {
						ans+=(p*h+(c*f));
					}
					System.out.println(ans);
					continue;
				}
			}else {
				if(f>=tot) {
					System.out.println(c*tot);
					continue;
				}else {
					if(p>=(tot-f)) {
					ans+=(f*c+ h*(tot-f));
					}else {
						ans+=(f*c+ (h*p));
					}
					System.out.println(ans);
					continue;
				}
			}
			//int ans = 0;
			
		}
	}
}
