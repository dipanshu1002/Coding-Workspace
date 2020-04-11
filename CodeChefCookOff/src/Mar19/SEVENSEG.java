package Mar19;

import java.util.Scanner;
import java.util.*;

public class SEVENSEG {
	
	  public static int countSetBits(int n) 
	    { 
	        int count = 0; 
	        while (n > 0) 
	        { 
	            n &= (n - 1) ; 
	            count++; 
	        } 
	        return count; 
	    } 

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long T = s.nextLong();
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(0,Integer.parseInt("3F",16));
		map.put(1,Integer.parseInt("06",16));
		map.put(2,Integer.parseInt("5B",16));
		map.put(3,Integer.parseInt("4F",16));
		map.put(4,Integer.parseInt("66",16));
		map.put(5,Integer.parseInt("6D",16));
		map.put(6,Integer.parseInt("7D",16));
		map.put(7,Integer.parseInt("07",16));
		map.put(8,Integer.parseInt("7F",16));
		map.put(9,Integer.parseInt("6F",16));
		
		Set<Integer> keys = map.keySet();
	/*	for(Integer sc : keys) {
			System.out.println(map.get(sc));
		}*/

		for(long t=0;t<T;t++) {
			int flag =0;
			int N = s.nextInt();
			int[] min=new int[N];
			int[] max = new int[N];
			if(N==1) {
				int X = s.nextInt();
				int Y = s.nextInt();
				int one = countSetBits(map.get(X));
				if(Y>one) {
					System.out.println("invalid");
				}
				else {
					System.out.println((one-Y)+" "+(7-one+(one-Y)));
				}
				
			}
			else {
				
				for(int i=0;i<N;i++) {
					int X = s.nextInt();
					int Y = s.nextInt();
					int one = countSetBits(map.get(X));
					if(Y>one) {
						flag = 1;
						System.out.println("invalid");
						break;
					}
					else {
						min[i] = one - Y;
						max[i] = 7-one + min[i];
						
					}
					if(flag==1) {
						break;
					}
					
					
				}
				
				
				
			}
			
		}

	}

}
