import java.util.Scanner;

public class CLBATH{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long T = s.nextLong();
		for(long t=0;t<T;t++) {
			long v1= s.nextLong();
			long t1 = s.nextLong();
			long v2=s.nextLong();
			long t2=s.nextLong();
			long v3=s.nextLong();
			long t3=s.nextLong();
			double ratio = (double)(t2-t3)/(t3-t1);
		//	System.out.println(ratio);
			if(ratio<0) {	
				System.out.println("NO");
			
			}
			else {
			double vy= (double)v3/(1+ratio);
			double vx = v3-vy;
			if (vy<=v2 && vx<=v1) {
				System.out.println(vx+" "+vy);
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			}
			
		}
	}
}
