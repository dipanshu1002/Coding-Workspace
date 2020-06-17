package DP3;
import java.util.*;
public class Candy {
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		int N = s.nextInt();
		int[][] like = new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				like[i][j]=s.nextInt();
			}
		}
		int[] dp = new int[1<<N];
//		System.out.println(1<<N);
//		System.out.println(1<<1);
        dp[0] = 1;
        for(int mask=0;mask<=((1<<N) - 2);mask++){
        	System.out.println("Mask: "+mask);
            long temp = mask;
            int count = 0;
            while(temp>0){
                long bit = temp&1;
                count+=bit;
                temp/=2;
            }
            for(int j=0;j<N;j++){
                if((like[count][j]==1) && (mask & (1<<j))==0){
                    dp[mask|(1<<j)]+=dp[mask];
                }
            }
          for(int i=0;i<(1<<N);i++) {
        	System.out.println(i+": "+dp[i]);
        }
        }

        System.out.println("ans: "+dp[(1<<N) - 1]);
	}
}
