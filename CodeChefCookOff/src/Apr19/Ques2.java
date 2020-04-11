package Apr19;

import java.util.*;
import java.lang.Math;
public class Ques2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T=s.nextInt();
		for(int t=0;t<T;t++) {
			int N = s.nextInt();
			long A = s.nextInt();
			long B = s.nextInt();
			long X = s.nextInt();
			long Y = s.nextInt();
			long Z = s.nextInt();
			long count = 0;
			long[] C = new long[N];
			for(int i=0;i<N;i++) {
				C[i]=s.nextInt();
			}
			long tB = (long)(Math.ceil((double)(Z-B)/Y));
			long tA = (long)(Math.ceil((double)(Z-A)/X));
			long reqdA = Z - (A+(tB-1)*X);
			PriorityQueue<Long> pQ = new PriorityQueue<Long>( Collections.reverseOrder());
			for(int i=0;i<N;i++) {
				pQ.add(C[i]);
			}
			Iterator itr = pQ.iterator();
			while(reqdA>0) {
				long pop = pQ.poll();
				if(pop==0) {
					break;
				}
				reqdA-=pop;
				pQ.add(pop/2);
				count++;
			}
			if(reqdA>0) {
				System.out.println("RIP");
			}
			else {
			System.out.println(count);
			}
		}
	}

}
