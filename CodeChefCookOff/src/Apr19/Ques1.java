package Apr19;

import java.lang.Math;
import java.util.*;
import java.util.Scanner;
public class Ques1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t;
		t=sc.nextInt();
		while(t!=0)
		{
			int n,a,b,x,y,z,i,j,flag=0,contri=0,msum=0;
			
			n=sc.nextInt();
			a=sc.nextInt();
			b=sc.nextInt();
			x=sc.nextInt();
			y=sc.nextInt();
			z=sc.nextInt();
			
			int c[]=new int[n];
			PriorityQueue<Integer> p = new PriorityQueue<>(10, Collections.reverseOrder());
			
			for(i=0;i<n;i++)
			{
				//System.out.println("enter");
				c[i]=sc.nextInt();
				int temp=c[i];
				p.add(temp);
				msum+=2*c[i];
			}
			//System.out.println("maac");
			
			while(b<z&&a<z)
			{
				b=b+y;
				a=a+x;
			}
			//System.out.println("2");
			if(a+x>=z&&b+y<z)
			{
				System.out.println(0);
			}
			else if(msum+a<z)
			{
				System.out.println("RIP");
			}
			else
			{
				int steps=0;
				
				while(a<z)
				{
				int temp=p.poll();
				a=a+temp;
				p.add(temp/2);
				steps++;
				System.out.println(temp);
				}
				System.out.println(steps);
				}
			
			t--;
		}
		
	}
}
