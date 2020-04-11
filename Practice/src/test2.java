import java.util.*;
import java.io.*;
public class test2 {
	    
	
	static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 
	
	public static void main(String[] args) throws IOException
	{
		Reader sc=new Reader();
		int t;
		t=sc.nextInt();
		while(t!=0)
		{
			int n,i,j;
			n=sc.nextInt();
			
			double x[]=new double[n];
			double y[]=new double[n];
			
			double a[]=new double[n];
			double b[]=new double[n];
			double c[]=new double[n];
			double d[]=new double[n];
			
			double mini;
			
			for(i=0;i<n;i++)
			{
				x[i]=sc.nextDouble();
				y[i]=sc.nextDouble();
				
				a[i]=x[i]+y[i];
				b[i]=x[i]+y[i];
				c[i]=y[i]-x[i];
				d[i]=-x[i]+y[i];				
			}
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			mini=Double.MAX_VALUE;
			
			for(i=0;i<n-1;i++)
			{
				
				double tempmin=Math.abs(a[i]-b[i+1]);
				
				for(j=i+1;j<n;j++)
				{
					double temp=Math.abs(a[i]-b[j]);
					if(temp<mini){
						mini=temp;
						tempmin=temp;
					}
					else if(temp>tempmin)
					{
						break;
					}
					else
						tempmin=temp;
				}
				
				if(mini==0)
					break;
				
			}
			
			if(mini==0)
			{
				System.out.println(mini);
				t--;
				continue;
			}
			Arrays.sort(c);
			Arrays.sort(d);
			
			double mini2=Double.MAX_VALUE;
			
			for(i=0;i<n-1;i++)
			{
				
				double tempmin=Math.abs(c[i]-d[i+1]);
				
				for(j=i+1;j<n;j++)
				{
					double temp=Math.abs(c[i]-d[j]);
					if(temp<mini2){
						mini2=temp;
						tempmin=temp;
					}
					else if(temp>tempmin)
					{
						break;
					}
					else
						tempmin=temp;
				}
				
				if(mini2==0)
					break;
				
			}

			
			
			
			double a1=mini/2;
			double a2=mini2/2;
			double ans=Math.min(a1,a2);
			
			System.out.println(ans);
				
			t--;
		}
	}
}