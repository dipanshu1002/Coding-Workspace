package Mar19;
import java.util.*;
public class TRVLCHEF {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long T = s.nextLong();
		for(long t=0;t<T;t++) {
			int N = s.nextInt();
			long D=s.nextLong();
			long[] arr=new long[N];
			for(int i=0;i<N;i++) {
				arr[i]=s.nextLong();
			}
			Arrays.sort(arr,1,arr.length);
			/*for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}*/
			int flag=0;
			for(int i=1;i<N;i++) {
				long diff = Math.abs(arr[i]-arr[i-1]);
				if(diff<=D) {
					continue;
				}
					flag=1;
					break;
				
			}
			if(flag==1) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
			
		}
		
	}

}
