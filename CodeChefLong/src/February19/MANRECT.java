package February19;

import java.util.Scanner;

public class MANRECT {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(long t=0;t<T;t++) {
			System.out.println("Q "+0+" "+0);
			System.out.flush();
		//	System.out.println(1+2);
			int A = s.nextInt();
			
			System.out.println("Q "+0+" "+(int)Math.pow(10, 9));
			System.out.flush();
		//	System.out.println(1+(int)Math.pow(10, 9)-6);
			int B = s.nextInt();
			
			System.out.println("Q "+(int)Math.pow(10, 9)+" "+0);
			System.out.flush();
		//	System.out.println((int)Math.pow(10, 9)-4+2);
			int C = s.nextInt();
			
			System.out.println("Q "+(int)Math.pow(10, 9)+" "+(int)Math.pow(10, 9));
			System.out.flush();
		//	System.out.println((int)Math.pow(10,9)+(int)Math.pow(10, 9)-10);
			int D = s.nextInt();
			
			int temp1 = A-B+(int)Math.pow(10, 9);
			int temp2 = B-D+(int)Math.pow(10, 9);
		//	System.out.println(temp2);
			System.out.println("Q "+0+" "+temp1/2);
			System.out.flush();
		//	System.out.println(3);
			int E = s.nextInt();
			
			int x1 = E;
			int y1 = A-x1;
			int x2 = temp2 - x1;
			int y2 = temp1 - y1;
			System.out.println("A "+x1+" "+y1+" "+x2+" "+y2);
			System.out.flush();
			int ans = s.nextInt();
			if(ans<0) {
				return;
			}
		}
	}
}
