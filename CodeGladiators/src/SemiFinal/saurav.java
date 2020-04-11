package SemiFinal;

import java .io.*; 
import java.util.*;  
class saurav 
{ 
    static int m=-1;
    static void subsetSums(int []arr, int l, 
                            int r, int sum,String s ) 
    {
        if (l > r) 
        { 
            if(sum>m)
                m=sum;
            return; 
        } 
        int flag=1;
        String s1=Integer.toString(arr[l]);
        for(int i=0;i<s1.length();i++)
            {
                for(int j=0;j<s.length();j++)
                {
                    if(s1.charAt(i)==s.charAt(j))
                    {
                        flag=0;
                        break;
                    }
                }
                if(flag==0)
                break;
            }
            if(flag==1)
            subsetSums(arr, l + 1, r, sum + arr[l],s+arr[l]); 
        // Subset excluding arr[l] 
        subsetSums(arr, l + 1, r, sum,s); 
    } 
    public static void main (String[] args) 
    { 
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t!=0)
        {
            m=0;
            int n,i,j;
            n=sc.nextInt();
            int a[]=new int[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
            int sum;//m=-1;
            subsetSums(a, 0, n - 1, 0,"");
            System.out.println(m);
            t--;
        }

    } 
}