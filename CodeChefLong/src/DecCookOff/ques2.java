package DecCookOff;

import java.util.*;
import java.lang.Math;

public class ques2 {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int a=0;a<t;a++)
		{
			
			int n=sc.nextInt();
			int l=(int)(Math.log10(n) + 1);	
			int i=0;
			String s=String.valueOf(n);
			String o=s;
			for(i=0;i<l-1;i++)
			{
				o=o.substring(1)+o.charAt(0);
				s=s+o;
			}
			long res=0;
			for (i = 0; i < s.length(); i++) 
		         res = ((res*10) % 1000000007 + Long.parseLong(s.substring(i,1+i))%1000000007) %1000000007; 

			System.out.println(res);
		}
	}
}
