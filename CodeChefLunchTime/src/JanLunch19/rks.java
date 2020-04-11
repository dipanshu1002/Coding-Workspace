package JanLunch19;
import java.util.*;
public class rks {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			long T = s.nextLong();
			for(long t=0;t<T;t++) {
				int N=s.nextInt();
				Set<Integer> rows = new HashSet();
				Set<Integer> column = new HashSet();
				for(int i=1;i<=N;i++) {
					rows.add(i);
					column.add(i);
				}
				int K=s.nextInt();
				for(int i=0;i<K;i++) {
					int r=s.nextInt();
					rows.remove(r);
					int c = s.nextInt();
					column.remove(c);
					}
				System.out.print(N-K+" ");
				int[] rowA = new int[rows.size()];
				int[] colA = new int[column.size()];
				int a=0;
				for(int k : rows) {
					rowA[a]=k;
					a++;
				}
				int b=0;
				for(int k : column) {
					colA[b]=k;
					b++;
				}
				for(int i=0;i<rowA.length;i++) {
					System.out.print(rowA[i]+" "+colA[i]+" ");
				}
				System.out.println();
				
				
			}
					
		}

}
