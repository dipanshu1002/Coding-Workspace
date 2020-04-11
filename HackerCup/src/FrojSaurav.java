import java.util.*;
public class FrojSaurav {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int T = s.nextInt();
	String[] arr = new String[T];
	for(int t=0;t<T;t++) {
		String st = s.next();
		arr[t]=st;
		int cnt=0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)=='B') {
				cnt++;
			}
		}
		if(cnt>=(st.length()/2)&& cnt<=(st.length()-2)) {
			System.out.println("Case #"+(t+1)+": "+"Y");
		}else {
			System.out.println("Case #"+(t+1)+": "+"N");
		}
	}
}
}
