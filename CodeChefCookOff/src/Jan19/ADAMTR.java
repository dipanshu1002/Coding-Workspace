package Jan19;
import java.util.Scanner;
public class ADAMTR {
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long T=s.nextInt();
		for(long t=0;t<T;t++) {
			int N = s.nextInt();
			long[][] A = new long[N][N];
			long[][] B = new long[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
				A[i][j]=s.nextInt();
				}
			}
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
				B[i][j]=s.nextInt();
				}
			}
			int swaps = 0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(B[i][j]==A[i][j]) {
						continue;
					}
					else {
						
					}
				}
			}
			
			
	}
}
}
